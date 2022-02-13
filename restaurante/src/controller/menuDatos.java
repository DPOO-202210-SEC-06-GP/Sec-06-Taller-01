package controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class menuDatos {
	
	private List<combo> combos;
	private List<pedido> pedidos;
	
	public menuDatos(Map<String, combo> combos, Map<String, pedido> pedidos)
	{
		this.combos  = new ArrayList<combo>(combos.values());

	}
	
	

}
