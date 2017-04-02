package core;

/**
 * En esta clase define los atributos de un producto
 * 
 * @author AndresPC
 *
 */
public class Producto {

	private String nombre;
	private String codigo;
	private String descripccion;
	private double costo;
	private int existencias;
	private boolean nuevo;
	private String foto; // direccion del recurso de la foto (seria bueno crear
							// un servicio que se encargue de entregar
							// multimedia

	public Producto(String nombre, String codigo, String descripccion, double costo, int existencias, boolean nuevo,
			String foto) {

		this.nombre = nombre;
		this.codigo = codigo;
		this.descripccion = descripccion;
		this.costo = costo;
		this.existencias = existencias;
		this.nuevo = nuevo;
		this.foto = foto;
	}

}
