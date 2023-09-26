/*
    1 	idUsuario Primaria 	int(11) 			No 	Ninguna 		AUTO_INCREMENT 	Cambiar Cambiar 	Eliminar Eliminar 	
	2 	nombre 	varchar(30) 	utf8mb4_general_ci 		No 	Ninguna 			Cambiar Cambiar 	Eliminar Eliminar 	
	3 	apellido 	varchar(30) 	utf8mb4_general_ci 		No 	Ninguna 			Cambiar Cambiar 	Eliminar Eliminar 	
	4 	dni Índice 	int(11) 			No 	Ninguna 			Cambiar Cambiar 	Eliminar Eliminar 	
	5 	email Índice 	varchar(40) 	utf8mb4_general_ci 		No 	Ninguna 			Cambiar Cambiar 	Eliminar Eliminar 	
	6 	usuario Índice 	varchar(30) 	utf8mb4_general_ci 		No 	Ninguna 			Cambiar Cambiar 	Eliminar Eliminar 	
	7 	clave 	varchar(8) 	utf8mb4_general_ci 		No 	Ninguna 			Cambiar Cambiar 	Eliminar Eliminar 	
	8 	tipo 	varchar(30) 	utf8mb4_general_ci 		No 	Ninguna 			Cambiar Cambiar 	Eliminar Eliminar 	
	9 	acceso 	int(11) 			No 	Ninguna 			Cambiar Cambiar 	Eliminar Eliminar 	
	10 	estado 
 */
package Entidades;

import java.time.LocalDate;

public class Usuario {

    private int id;

    private String nombre;
    private String apellido;
    private int dni;
    private LocalDate fechaNac;
    private String email;
    private String usuario;
    private char[] clave;
    private boolean activo;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, int dni, LocalDate fechaNac, String email, String usuario, char[] clave, boolean activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.email = email;
        this.usuario = usuario;
        this.clave = clave;
        this.activo = activo;
    }

    public Usuario(int id, String nombre, String apellido, int dni, LocalDate fechaNac, String email, String usuario, char[] clave, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.email = email;
        this.usuario = usuario;
        this.clave = clave;
        this.activo = activo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public char[] getClave() {
        return clave;
    }

    public void setClave(char[] clave) {
        this.clave = clave;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return this.id+" "+this.nombre+" "+this.apellido+" "+this.dni+" "+this.getFechaNac()+" "+this.email+" "+this.usuario+" "+this.clave+" "+this.activo;
    }

   
}
