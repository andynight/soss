package core;

import javax.json.Json;

import com.mongodb.BasicDBObject;

/**
 * Una Clase sencilla que se encarga de manejar coordenadas
 * 
 * @author Carlos Pereira 
 *
 */
public class Coordenada {

	private double latitud;
	private double longitud;
	
	public Coordenada()
	{
		
		latitud = 0;
		longitud = 0;
	}

	public Coordenada(double latitud, double longitud)
	{
		
		this.latitud = latitud;
		this.longitud = longitud;
	}

	/**
	 * Retorna la latitud
	 * @return double
	 */
	public double getLatitud() {
		return latitud;
	}

	/**
	 * Modifica la latitud
	 * @param latitud
	 */
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	/**
	 * Retorna la Longitud
	 * @return double
	 */
	public double getLongitud() {
		return longitud;
	}

	/**
	 * Modifica la Longitud
	 * @param longitud
	 */
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	public String toString(){
		String cadena;
		
		cadena = Json.createObjectBuilder().add("Coordenada", Json.createObjectBuilder()
				.add("Latitud", latitud).add("Longitud", longitud)).build().toString();
		
		
		return cadena;
	}
	
	public BasicDBObject getBsonCoordenada()
	{
		BasicDBObject coorBson = new BasicDBObject();
		coorBson.append("Latitud",latitud);
		coorBson.append("Longitud",longitud);
		return coorBson;
	}
	
	
}
