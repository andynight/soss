package core;

import java.util.ArrayList;
import java.util.HashMap;

import herramientas.AreaTienda;

/**
 * Esta clase se encargara de mantener la logica de una tienda en la aplicación
 * @author AndresPC
 *
 */
public class Tienda {
	private String Nit; // se permite que sea string pero debe validarse para que solo sean numero
	private String  nombre;
	private Tendero Propietario; // creeria que este se puede quitar por que si el tendero tiene sus tiendas entonces por tendero sabriamos la tienda no se si hacer redundancia toca mirar
	private Inventario inventario;
	private String Foto; // direccion en la cual se encuentra ubicada la imagen
	private HashMap<String, ArrayList<HashMap<String, String>>> Oferta; //objeto completo que revaluaremos
	private ArrayList<Producto> novedades;
	private long contadorVisitas;
	private String Especialidad;//No se muy bien a lo que se refieren xd
	private Coordenada ubicacion;
	private AreaTienda geoArea;
	
	
}
