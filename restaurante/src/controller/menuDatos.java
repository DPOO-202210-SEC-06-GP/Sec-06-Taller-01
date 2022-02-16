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
	private ArrayList<combo> combos;
	private ArrayList<ingrediente> ingredientes;

	/*
	 Contructores
	 */
	
	public menuDatos( Map<String, option> opciones, ArrayList<option> options,ArrayList<combo> combos,ArrayList<ingrediente> ingredientes)
	/*
	 * Crea un nuevo menu.
	 */
	{
		this.opciones = opciones;
		this.options = options;
		this.combos = combos;
		this.ingredientes = ingredientes;

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
	
	public ArrayList<combo> mostrarCombos() 
	/*
	 * Devuelve el ArrayList combos
	 */
	{
		return combos;
	}
	
	public ArrayList<ingrediente> mostrarIngre() 
	/*
	 * Devuelve el ArrayList combos
	 */
	{
		return ingredientes;
	}
	
	public option getByName(String name) {
		/*
		 * Dato un nombre, devuelve el objeto/producto cuyo nombre es el mismo.
		 */
		option item = opciones.get(name);
		
		return item;
	}
}
