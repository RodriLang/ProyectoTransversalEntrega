package AccesoADatos;

import Entidades.Usuario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class UsuarioData {

    private Connection con = null;

    public UsuarioData() {
        con = Conexion.getConexion();
    }
    
    public void crearUsuario(Usuario usuario){
        
        
        String sql="INSERT INTO usuario(nombre, apellido, dni, fechaNac, email, usuario, clave, activo)"
                + " VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            
            ps.setString(1,usuario.getNombre());
            ps.setString(2,usuario.getApellido());
            ps.setInt(3,usuario.getDni());
            ps.setDate(4,Date.valueOf(usuario.getFechaNac()));
            ps.setString(5,usuario.getEmail());
            ps.setString(6,usuario.getUsuario());
            ps.setString(7,usuario.getClave().toString());
            ps.setBoolean(8,usuario.isActivo());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                usuario.setId(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Usuario Guardado");
                ps.close();//TODO Agregar al Finaly
            }
        } catch (SQLException ex) {
            if (ex.getSQLState().equals("23000") && ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "El Dni ingresado ya existe");
            } else {
                JOptionPane.showMessageDialog(null, "Error en el método crearUsuario" + ex.getMessage());
            }
        }
    }   

    
    public void modificarUsuario(Usuario usuario){
        String sql="UPDATE usuario SET nombre=?, apellido=?, dni=?, fechaNac=?, email=?, usuario=?, activo=? WHERE idUsuario=?";
            
            PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setInt(3, usuario.getDni());
            ps.setDate(4, Date.valueOf(usuario.getFechaNac()));
            ps.setString(5,usuario.getEmail());
            ps.setString(6,usuario.getUsuario());
            ps.setBoolean(7,usuario.isActivo());
            ps.setInt(8, usuario.getId());
            
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Usuario modificado exitosamente");
                ps.close();
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el método modificarUsuario" + ex.getMessage());
        }

            
    }
    
    public void modificarClave(Usuario usuario){
         String sql="UPDATE usuario SET clave=? WHERE idUsuario=?";
            
            PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            
            ps.setString(1,usuario.getClave().toString());
            ps.setInt(2, usuario.getId());
            
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Clave modificada exitosamente");
                ps.close();
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el método modificarClave" + ex.getMessage());
        }
    }
    
    public void eliminarUsuario(int idUsuario){
        String sql = "UPDATE usuario SET estado=0 WHERE idUsuario=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idUsuario);

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el método eliminarUsuario" + ex.getMessage());
        }
    }
}
