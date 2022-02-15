package controller;

public class combo 
{
	// ************************************************************************
	// Atributos
	// ************************************************************************
	
	/**
	 * Lista de productos que forman el combo
	 */
	private List<Producto> productos;
	
	/**
	 * Descuento que tiene el combo en comparación con commprar los productos por separado
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
	public Combo(String elNombre, double elDescuento)
	{
		this.nombreCombo = elNombre;
		this.descuento = elDescuento;
	}
	
	public void agregarItemACombo(Producto itemCombo)
	
}
