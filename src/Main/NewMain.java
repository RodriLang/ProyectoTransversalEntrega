
package Main;

import AccesoADatos.AlumnoData;
import AccesoADatos.Conexion;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import Entidades.Alumno;
import Entidades.Inscripcion;


public class NewMain {

   
    public static void main(String[] args) {
        
        Connection conexion=Conexion.getConexion();
        
        AlumnoData alu= new AlumnoData();
        MateriaData mat = new MateriaData();
        //alu.guardarAlumno(new Alumno (34768990,"Sosa","Laura",LocalDate.of(1988, Month.MARCH, 15),true));
        //alu.modificarAlumno(new Alumno (6,34768990,"Sosa","Maria Laura",LocalDate.of(1988, Month.MARCH, 15),true));
        InscripcionData ins = new InscripcionData(mat, alu);
        Inscripcion insc = new Inscripcion(2, alu.buscarAlumnoId(1), mat.buscarMateria(1));
        
        //ins.guardarInscripcion(insc);
        
        
        System.out.println(mat.listarMaterias());
        
        System.out.println("");
        System.out.println("Inactivas");
        System.out.println(mat.listarMateriasInactivas());
}
}
