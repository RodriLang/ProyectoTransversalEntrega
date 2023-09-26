/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.util.List;
import Entidades.Materia;

public class MateriaData {

    private Connection con = null;

    public MateriaData() {
        con = Conexion.getConexion();
    }

    public void guardarMateria(Materia materia) {
        String sql = "INSERT INTO materia (nombre, año, estado) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, true);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                materia.setId(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "¡Materia guardada con éxito! ID: "+materia.getId());
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al trabajar con la tabla materia. " + ex.getMessage());
        }
    }

    public Materia buscarMateria(int id) {
        Materia mat = null;
        String sql = "SELECT nombre, año, estado FROM materia WHERE idMateria = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mat = new Materia();
                mat.setNombre(rs.getString("nombre"));
                mat.setAnio(rs.getInt("año"));
                mat.setEstado(rs.getBoolean("estado"));
                mat.setId(id);
            } else {
                JOptionPane.showMessageDialog(null, "No existe la materia");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al trabajar con la tabla materia. " + ex.getMessage());
        }
        return mat;
    }

    public void modificarMateria(Materia materia) {
        String sql = "UPDATE materia SET nombre = ?, año = ? WHERE idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setInt(3, materia.getId());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "¡Modificación exitosa!");
            } else {
                JOptionPane.showMessageDialog(null, "La materia no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al trabajar con la tabla materia. " + ex.getMessage());
        }
    }

    public void eliminarMateria(int id) {
        String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "¡Se eliminó la materia!");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al trabajar con la tabla materia. " + ex.getMessage());
        }
    }

    public List<Materia> listarMaterias() {
        List<Materia> materias = new ArrayList<>();
        String sql = "SELECT * FROM materia WHERE estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia mat = new Materia();
                mat.setId(rs.getInt("idMateria"));
                mat.setNombre(rs.getString("nombre"));
                mat.setAnio(rs.getInt("año"));
                mat.setEstado(rs.getBoolean("estado"));
                materias.add(mat);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al trabajar con la tabla materia. " + ex.getMessage());
        }
        return materias;
    }
    public List<Materia> listarMateriasInactivas() {
        List<Materia> materias = new ArrayList<>();
        String sql = "SELECT * FROM materia WHERE estado = 0";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia mat = new Materia();
                mat.setId(rs.getInt("idMateria"));
                mat.setNombre(rs.getString("nombre"));
                mat.setAnio(rs.getInt("año"));
                mat.setEstado(rs.getBoolean("estado"));
                materias.add(mat);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al trabajar con la tabla materia. " + ex.getMessage());
        }
        return materias;
    }

}
