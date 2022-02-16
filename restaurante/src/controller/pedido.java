package controller;
import java.util.ArrayList;
public class pedido {

	private int numeroPedido;
	private int idPedido;
	private String nombreCliente;
	private String diCliente;
	private ArrayList<option> pedidos;
	
	public pedido(String nombreCliente, String diCliente,ArrayList<option> pedidos ) 
	{
		this.nombreCliente = nombreCliente;
		this.diCliente = diCliente;
		this.pedidos = pedidos;
	}
	
	public int getId() 
	{
		return idPedido;
	}
	public void agregarOption(option producto) 
	{
		pedidos.add(producto);
	}
	
}
 