package core;

import java.util.Date;

/**
 * Esta es una superclase de la cualen se estienden clases con similitudes a una 
 * persona como cliente o tendero
 * 
 * @author AndresPC
 *
 */
public class Persona {
	
	private String nombre;
	private String cedula; // (-1 o doc de identidad) validar
	private String telefono; //validar
	private String ciudad;
	private String genero;
	private Date nacimiento;
	
	public Persona(String nombre, String cedula, String telefono, String ciudad, String genero, Date nacimiento) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.telefono = telefono;
		this.ciudad = ciudad;
		this.genero = genero;
		this.nacimiento = nacimiento;
	}
	
	
	


}
