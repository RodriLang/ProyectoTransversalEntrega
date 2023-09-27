package AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;

public class InscripcionData {
    private Connection con;
    private MateriaData matData;
    private AlumnoData alumData;

    public InscripcionData(MateriaData materiaData, AlumnoData alumnoData) {
        con=Conexion.getConexion();
        matData=materiaData;
        alumData=alumnoData;
    }
    
    public void guardarInscripcion(Inscripcion insc){
    String sql="INSERT INTO inscripcion (nota,idAlumno,idMateria) "
            + "VALUES (?,?,?)";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, 0);
            ps.setInt(2, insc.getAlumno().getId());
            ps.setInt(3, insc.getMateria().getId());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setId(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripción Guardada");
                ps.close();
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al trabajar en guardarInscripcion "+ex.getMessage());
        }
        
    }
    
    public List<Inscripcion> obtenerInscripciones(){
    List<Inscripcion> inscripciones=new ArrayList<Inscripcion>();
    String sql="SELECT *  FROM `inscripcion` JOIN alumno ON(inscripcion.idAlumno=alumno.idAlumno)"
            + " JOIN materia ON (inscripcion.idMateria=materia.idMateria)";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            Inscripcion ins;
            while (rs.next()) {                
                ins= new Inscripcion();
                ins.setId(rs.getInt("idInscripto"));             
                ins.setAlumno(alumData.buscarAlumnoId(rs.getInt("idAlumno")));
                ins.setMateria(matData.buscarMateria(rs.getInt("idMateria")));
                inscripciones.add(ins);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al trabajar en obtenerInscripciones "+ex.getMessage());
        }
    return inscripciones;          
    }
    
    
      public List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
    List<Inscripcion> inscripciones=new ArrayList<Inscripcion>();
    String sql="SELECT * FROM `inscripcion` JOIN alumno ON(inscripcion.idAlumno=alumno.idAlumno)"
            + " JOIN materia ON (inscripcion.idMateria=materia.idMateria) WHERE inscripcion.idAlumno=? ";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            Inscripcion ins;
            while (rs.next()) {                
                ins= new Inscripcion();
                ins.setId(rs.getInt("idInscripto"));             
                ins.setAlumno(alumData.buscarAlumnoId(id));
                ins.setMateria(matData.buscarMateria(rs.getInt("idMateria")));
                ins.setNota(rs.getDouble("nota"));
                inscripciones.add(ins);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al trabajar en obtenerInscripcionesPorAlumno "+ex.getMessage());
        }
    return inscripciones;       
    }
    
    public List<Materia> obtenerMateriasCursadas(int id){
    List<Materia> materias=new ArrayList<Materia>();
    String sql="SELECT inscripcion.idMateria, nombre, año FROM materia, inscripcion "
            + "WHERE inscripcion.idMateria=materia.idMateria AND idAlumno=? ";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            Materia materia;
            while (rs.next()) {                
                materia= new Materia();
                materia.setId(rs.getInt("idMateria"));             
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio( rs.getInt("año"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al trabajar en obtenerMateriasCursadas "+ex.getMessage());
        }
    return materias;       
    }
    
    public List<Materia> obtenerMateriasNoCursadas(int id){
    
    List<Materia> materias=new ArrayList<Materia>();
        materias=matData.listarMaterias();
    List<Materia> cursadas=new ArrayList<Materia>();
        cursadas=obtenerMateriasCursadas(id);   
        
        
        Iterator<Materia> itr = materias.iterator();
 
        while (itr.hasNext())
        {
            Materia t = itr.next();
             for(Materia matC:cursadas){
                if(t.getNombre().equals(matC.getNombre())){ 
                     itr.remove();
                }
            }
        }
        
    return materias;       
        
    }
    
    
 
    public void borrarInscripcion(int idMateria, int idAlumno){
    String sql="DELETE FROM `inscripcion` WHERE idAlumno=? AND idMateria=?";
    
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Inscripción eliminada exitosamente");
            }else{
                  JOptionPane.showMessageDialog(null, "Inscripción no encontrada");  
            }
            
            ps.close();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al trabajar con borrarInscripción"+ ex.getMessage());
        }
    }
    
    public void actualizarNota(int idAlumno,int idMateria, double nota){
    
        String sql="UPDATE inscripcion SET nota=? WHERE idAlumno=? AND idMateria=?";
    
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Nota modificada exitosamente");
            }else{
                  JOptionPane.showMessageDialog(null, "Inscripción no encontrada para modificar su nota");  
            }
            
            ps.close();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al trabajar con actualizarNota"+ ex.getMessage());
        }
    }
    public List<Alumno> obtenerAlumnosXMateria(int idMateria){
    List<Alumno> alumnos=new ArrayList<Alumno>();
    String sql="SELECT inscripcion.idAlumno, apellido, nombre, dni FROM alumno, inscripcion "
            + "WHERE inscripcion.idAlumno=alumno.idAlumno AND idMateria=? ";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs=ps.executeQuery();
            Alumno alumno;
            while (rs.next()) {                
                alumno= new Alumno();
                alumno.setDni(rs.getInt("dni"));
                alumno.setId(rs.getInt("idAlumno"));             
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre( rs.getString("nombre"));
                alumnos.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al trabajar en obtenerAlumnosXMAteria "+ex.getMessage());
        }
    return alumnos;       
    }
}