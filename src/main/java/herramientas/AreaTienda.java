package herramientas;

import core.Coordenadas;


public class AreaTienda {

	private double radio;
	private double distancia;
	
	public AreaTienda(double radio)
	{
		setRadio(radio);
	}
	
	public AreaTienda()
	{
		radio = 200;
	}
	
	public void setRadio(double radio)
	{
		this.radio = radio;
	}
	
	public double getDistancia()
	{
		return distancia;
	}
			
	public boolean estaDentro(Coordenadas vertice,Coordenadas bus)
	{
		double temp;
		temp = GeoMatematicas.calcDistancia(vertice,bus);
		this.distancia = temp;
		if (temp>= radio)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
