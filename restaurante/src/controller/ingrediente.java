package controller;

public class ingrediente 
{	
	// ************************************************************************
	// Atributos
	// ************************************************************************

	/**
	 * El nombre del ingrediente.
	 */
	private String nombre;

	/**
	 * El costo adicional del ingrediente
	 */
	private int costoAdicional;

	// ************************************************************************
	// Constructores
	// ************************************************************************

	/**
	 * Se crea el ingrediente con sus atributos.
	 * @param elNombre El nombre del ingrediente
	 * @param elCostoAdicional Cuanto cuesta de el ingrediente
	 */
	public ingrediente(String elNombre, int elCostoAdicional)
	{
		this.nombre = elNombre;
		this.costoAdicional = elCostoAdicional;
	}

	// ************************************************************************
	// Metodos para consultar los atributos
	// **

	/**
	 * Consulta el nombre del ingrediente
	 * 
	 * @return nombre
	 */

	public String getNombre()
	{
		return nombre;
	}

	/**
	 * Consulta el costo adicional
	 * 
	 * @return costoAdicional
	 */
	public int getcostoAdicional()
	{
		return costoAdicional;
	}
}
