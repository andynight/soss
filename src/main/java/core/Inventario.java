package core;

import java.util.ArrayList;

/**
 * Esta clase maneja las existencias de un producto para el inventario.
 * utiliza un codigo que le correspondera a una tienda para ser cargado unicamente
 * a su tienda en especifico
 * 
 * @author AndresPC
 *
 */
public class Inventario {

	private String codigoInventario;
	private ArrayList<Producto> productos;

	public Inventario(String codigoInventario) {
		this.codigoInventario = codigoInventario;
		productos = new ArrayList<>();
	}

}
