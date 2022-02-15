package controller;

public class productoMenu
{
	// ************************************************************************
	// Atributos
	// ************************************************************************
	
	/**
	 * Nombre del Producto
	 */
	private String nombre;
	
	/**
	 * Precio base del producto
	 */
	private int precioBase;
	
	// ************************************************************************
	// Constructores
	// ************************************************************************
	
	/**
	 * Crea el producto con sus atributos
	 * @param elNombre El nombre del producto
	 * @param elPrecio El precio base del producto
	 */
	public productoMenu(String elNombre, int elPrecio)
	{
		this.nombre = elNombre;
		this.precioBase = elPrecio;
	}
	
	// ************************************************************************
	// Metodos para consultar los atributos
	// ************************************************************************
	
	/**
	 * Consulta el nombre del producto
	 * 
	 * @return nombre
	 */
	public String getNombre()
	{
		return nombre;
	}
	
	/**
	 * Consulta el precio base del producto
	 * @return precio base
	 */
	public int getprecioBase()
	{
		return precioBase;
	}
	
	/*public String generarTextoFactura()
	{
		
	/*}
	
}