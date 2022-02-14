package controller;

public class option {
	/*
	 * Un objeto de clase Option es un producto del restaurante.
	 * Atributos:
	 * name: Nombre del producto.
	 * price: Precio del producto
	 */
	private String name;
	private int price;
	
	public option(String name, int price) 
	{
		this.name = name;
		this.price = price;
 
	}
	
	
	public String giveName() 
	{
		return name;
	}
	
	public int givePrice() 
	{
		return price;
	}
}
