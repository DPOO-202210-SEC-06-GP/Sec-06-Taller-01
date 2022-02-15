package controller;

import java.util.List;

public class combo 
{
	// ************************************************************************
	// Atributos
	// ************************************************************************
	
	/**
	 * El precio del producto
	 */
	private int precio;
	
	/**
	 * Lista de productos que forman el combo
	 */
	private List<productoMenu> productos;
	
	/**
	 * Descuento que tiene el combo en comparación con comprar los productos por separado
	 */
	private double descuento;
	
	/**
	 * Nombre del combo
	 */
	private String nombreCombo;

	// ************************************************************************
	// Constructores
	// ************************************************************************
	
	/**
	 * Se crea el combo con sus atributos
	 * @param elNombre El nombre del combo
	 * @param elDescuento El porcentaje de descuento
	 */
	public combo(String elNombre, double elDescuento)
	{
		this.nombreCombo = elNombre;
		this.descuento = elDescuento;
	}
	
	/**
	 * Agrega un producto al combo
	 */
	public void agregarItemACombo(productoMenu itemCombo)
	{
		this.productos.add(itemCombo);
	}
	
	/**
	 * Consulta el nombre del combo
	 * @return nombre
	 */
	public String getNombre()
	{
		return nombreCombo;
	}
	
	/**
	 * Calcula el precio del combo con el descuento
	 */
	public int getPrecio()
	{
		for(productoMenu itemCombo : productos)
		{
			precio += itemCombo.getprecioBase();
		}
		
		precio =  (int) (precio-(precio*(descuento/100)));
		
		return precio;
	}
}
