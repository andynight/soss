package core;

import java.util.ArrayList;
import java.util.Date;

/**
 * Es la persona dueña de una o mas tiendas
 * 
 * @author AndresPC
 *
 */
public class Tendero extends Persona {
	
	private String rut;
	private ArrayList<Tienda> tiendas; // aun no me convence
	
	public Tendero(String nombre, String cedula, String telefono, String ciudad, String genero, Date nacimiento,
			String rut, ArrayList<Tienda> tiendas) {
		super(nombre, cedula, telefono, ciudad, genero, nacimiento);
		this.rut = rut;
		this.tiendas = tiendas;
	}
	
	

}
