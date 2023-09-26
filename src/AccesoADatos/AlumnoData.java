package AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import Entidades.Alumno;

public class AlumnoData {

    private Connection con = null;

    public AlumnoData() {
        con = Conexion.getConexion();
    }

    public void guardarAlumno(Alumno alumno) {

        String sql = "INSERT into alumno (dni,apellido,nombre,fechaNac,estado)"
                + " VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                alumno.setId(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno Guardado. ID: " +alumno.getId());
                ps.close();
            }

        } catch (SQLException ex) {

            if (ex.getSQLState().equals("23000") && ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "El Dni ingresado ya existe");
            } else {
                JOptionPane.showMessageDialog(null, "Error en el método guardarAlumno" + ex.getMessage());
            }

        }
    }

    public void modificarAlumno(Alumno alumno) {

        String sql = "UPDATE alumno sET dni=?,apellido=?,nombre=?,fechaNac=?"
                + " where idAlumno=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setInt(5, alumno.getId());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno modificado exitosamente");
                ps.close();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el método modificarAlumno" + ex.getMessage());
        }
    }

    public void eliminarAlumno(int id) {

        String sql = "UPDATE alumno SET estado=0 WHERE idAlumno=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno eliminado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Alumno no encontrado");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el método eliminarAlumno" + ex.getMessage());
        }
    }

    public Alumno buscarAlumnoId(int id) {
        String sql = "SELECT dni,apellido,nombre,fechaNac FROM alumno WHERE  idAlumno=? AND estado=1";

        Alumno alumno = null;
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setId(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNac").toLocalDate());
                alumno.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "El alumno con IdAlumno: " + id + " no existe.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el método Buscar Alumno por Id" + ex.getMessage());
        }
        return alumno;
    }

    public Alumno buscarAlumnoDni(int dni) {
        String sql = "SELECT idAlumno,apellido,nombre,fechaNac FROM alumno WHERE  dni=? AND estado=1";

        Alumno alumno = null;
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setDni(dni);
                alumno.setId(rs.getInt("idAlumno"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNac").toLocalDate());
                alumno.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "El alumno con Dni: " + dni + " no existe.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el método Buscar Alumno por DNI" + ex.getMessage());
        }
        return alumno;
    }

    public List<Alumno> listarAlumnos() {

        List<Alumno> alumnos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM alumno WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = new Alumno();

                alumno.setId(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNac").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                alumnos.add(alumno);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en el método Listar Alumnos " + ex.getMessage());
        }
        return alumnos;
    }

}
