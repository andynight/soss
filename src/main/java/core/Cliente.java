package core;

import java.util.Date;
import java.util.HashMap;

/**
 * Es la persona que compra o utiliza los servicios de las tiendas
 * 
 * @author AndresPC
 *
 */
public class Cliente extends Persona {
	
	private Coordenada ubicacion;
	private HashMap<Producto, Integer> pfrec;// productos frecuentes
	private HashMap<Tienda, Integer> tfrec; //tienda mas frecuentada
	
	public Cliente(String nombre, String cedula, String telefono, String ciudad, String genero, Date nacimiento,
			Coordenada ubicacion, HashMap<Producto, Integer> pfrec, HashMap<Tienda, Integer> tfrec) {
		super(nombre, cedula, telefono, ciudad, genero, nacimiento);
		this.ubicacion = ubicacion;
		this.pfrec = pfrec;
		this.tfrec = tfrec;
	}
	
	

}
