package controller;
import java.util.ArrayList;
public class pedido {

	private int numeroPedido;
	private int idPedido;
	private String nombreCliente;
	private String diCliente;
	private ArrayList<option> pedidos= new ArrayList<option>();
	private ArrayList<option> pedidosT= new ArrayList<option>();
	private String facturaT;
	
	public pedido(String nombreCliente, String diCliente ) 
	{
		this.nombreCliente = nombreCliente;
		this.diCliente = diCliente;

	}
	
	public String givefac()
	{
		facturaT();
		return facturaT;
	}
	
	public int getId() 
	{
		return idPedido;
	}
	public void agregarOption(option producto) 
	{
		pedidos.add(producto);
	}
	public int sizePed() 
	{
		int size = pedidos.size();
		return size;
	}
	public ArrayList<option> giveList() 
	{
		return pedidos;
	}
	public void actualizarPedN(ArrayList<option> options)
	{
		this.pedidosT = options;
	}
	
	private void  facturaT() 
	{ 
		String fin =  "------- " + nombreCliente + " -------";
		fin +=  "------- " + diCliente + " -------";
		for (int i =0 ; i< pedidos.size(); i++ )
		{
			option temp = pedidos.get(i);
			String name = temp.giveName();
			int price = temp.givePrice();
			String name2 = Integer.toString(price);
			int dif = 30- name2.length()- name.length();
		    String space= new String(new char[dif]).replace("\0", "-");
		    fin += ( "\n" + (i+1) + " - "+ name + space + name2);
			 
		}
		this.facturaT= fin;
	}
	
}
 