package controller;

import java.util.ArrayList;
import java.util.List;

public class combo 
{
	// ************************************************************************
	// Atributos
	// ************************************************************************
	
	/**
	 * El precio del producto
	 */
	
	private ArrayList<option> contenido;
	
	/**
	 * Lista de productos que forman el combo
	 */
	private List<option> productos;
	
	/**
	 * Descuento que tiene el combo en comparaci�n con comprar los productos por separado
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
	public combo(String elNombre, double elDescuento, ArrayList<option> contenido)
	{
		this.nombreCombo = elNombre;
		this.descuento = elDescuento;
		this.contenido = contenido;
	}
	
	/**
	 * Agrega un producto al combo
	 */
	public void agregarItemACombo(option itemCombo)
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
	
	/*
	 * Devuelve el procentaje de descuento.
	 */
	public Double getDesc()
	{
		return descuento;
	}
	
	/**
	 * Calcula el precio del combo con el descuento
	 * Recibe como parametro una lista de los componentes del combo
	 */
	public int getPrice() 
	{
		Double conteo = 0.0;
		for (int i =0 ; i < contenido.size();i++)
		{
			option temp = contenido.get(i);
			int price = temp.givePrice();
			conteo += price;
			}
		int fin = (int)  (conteo * descuento)/100;
		return fin;
	}
}
