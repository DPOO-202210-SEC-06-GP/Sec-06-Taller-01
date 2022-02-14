package controller;
import java.util.ArrayList;
import java.util.Map;



public class menuDatos {
	/*
	 * Carga de datos:
	 * Atributos...
	 * Map opciones: Es un mapa donde las llaves seran los nombres de los productos
	 * y los valores seran objetos de clase Option, o sea, productos
	 * 
	 * ArrayList options: Lista que contiene todos los productos.
	 */
	private Map<String, option> opciones;
	private ArrayList<option> options;

	/*
	 Contructores
	 */
	
	public menuDatos( Map<String, option> opciones, ArrayList<option> options)
	/*
	 * Crea un nuevo menu.
	 */
	{
		this.opciones = opciones;
		this.options = options;

	}
	
	
	/*
	 * Consultores
	 */
	public Map<String, option> filOp() 
	/*
	 * Devuelve el Map Opciones
	 */
	{
		return opciones;
	}
	
	public ArrayList<option> mostrarProductos() 
	/*
	 * Devuelve el ArrayList options
	 */
	{
		return options;
	}
}
