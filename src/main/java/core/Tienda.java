package core;

import java.util.ArrayList;
import java.util.HashMap;

import herramientas.AreaTienda;
import interfaces.Observer;
import interfaces.Subject;

/**
 * Esta clase se encargara de mantener la logica de una tienda en la aplicación
 * 
 * @author AndresPC
 *
 */
public class Tienda implements Subject {

	private String Nit; // se permite que sea string pero debe validarse para
						// que solo sean numero
	private String nombre;
	private Tendero Propietario; // creeria que este se puede quitar por que si
									// el tendero tiene sus tiendas entonces por
									// tendero sabriamos la tienda no se si
									// hacer redundancia toca mirar
	private Inventario inventario;
	private String Foto; // direccion en la cual se encuentra ubicada la imagen
	private HashMap<String, ArrayList<HashMap<String, String>>> Oferta; // objeto
																		// completo
																		// que
																		// revaluaremos
	private ArrayList<Producto> novedades;
	private long contadorVisitas;
	private String Especialidad;// No se muy bien a lo que se refieren xd
	private Coordenada ubicacion;
	private AreaTienda geoArea;

	public Tienda(String nit, String nombre, Tendero propietario, Inventario inventario, String foto,
			HashMap<String, ArrayList<HashMap<String, String>>> oferta, ArrayList<Producto> novedades,
			long contadorVisitas, String especialidad, Coordenada ubicacion) {
		super();
		Nit = nit;
		this.nombre = nombre;
		Propietario = propietario;
		this.inventario = inventario;
		Foto = foto;
		Oferta = oferta;
		this.novedades = novedades;
		this.contadorVisitas = contadorVisitas;
		Especialidad = especialidad;
		this.ubicacion = ubicacion;
		this.geoArea = new AreaTienda(80);
	}

	@Override
	public void AddObserver(Observer e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void RemoveObserver(Observer e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void NotifyObservers() {
		// TODO Auto-generated method stub

	}

}
