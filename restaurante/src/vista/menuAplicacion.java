package vista;

import controller.menuDatos;
import controller.option;
import controller.pedido;
import controller.LoaderRestaurante;
import controller.combo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class menuAplicacion {

	public  boolean menuPrincipal(menuDatos menu, boolean continuar,pedido usuario ) {
			
		ArrayList<option> options = menu.mostrarProductos();
		System.out.println("\n ------------------------------------------------");
		System.out.println("\n A continuacion, nuestra carta de platos principales...");
		System.out.println("\n ------------------------------------------------");
		
		for (int i = 0; i< options.size(); i++) {
			option value1 = options.get(i);
		    String price = Integer.toString(value1.givePrice());
		    String name2 = value1.giveName();
		    name2 = name2.substring(0,1).toUpperCase() + name2.substring(1);
		    int dif = 30-price.length()- name2.length();
		    String space= new String(new char[dif]).replace("\0", "-");
		    System.out.println( "\n" + (i+1) + " - "+ name2 + space + price);
		    
		}
		

		while(continuar == true)
		{
			try 
			{
				System.out.println("\n ------------------------------------------------");
				System.out.println("\n 50 - Pagar la cuenta");
				System.out.println("\n 101 - Quiero ver los combos.");
				System.out.println("\n 0 - Ya no quiero comprar mas.");
				System.out.println("\n ------------------------------------------------");
				int sel = Integer.parseInt(input(""));
				if (sel == 0) {
					return false;
				}
				else if (sel == 101) 
				{
					continuar = mostrarCombos(menu,continuar, usuario);
					if (continuar== false) {
						return false;
					}
					
				}
				else if (sel ==50)
				{
					String fact = usuario.givefac();
					System.out.println(fact);
				}
				
				else if (sel != 0 & sel != 101)
				{
					option producto = options.get(sel-1);
					usuario.agregarOption(producto);
					
				}
				
			} 
			catch (NumberFormatException e) 
			{
				
			}
		}
		
		return false;
		}
	
	public boolean mostrarCombos(menuDatos menu, boolean continuar, pedido usuario) {
		System.out.println("\n ------------------------------------------------");
		System.out.println("\n A continuarcion, nuestra gran variedad de combos");
		System.out.println("\n ------------------------------------------------");
		ArrayList<combo> combos = menu.mostrarCombos();
		for (int i=0; i < combos.size();i++)
		{
			combo value = combos.get(i);
			String name = value.getNombre();
			name = name.substring(0,1).toUpperCase() + name.substring(1);
			int dif = 30- name.length();
			String space= new String(new char[dif]).replace("\0", "-");
			System.out.println( "\n" + (i+1)+ " - "+ name + space );	
		}

		while(continuar == true)
		{
			try 
			{
				System.out.println("\n ------------------------------------------------");
				System.out.println("\n 50 - Pagar la cuenta");
				System.out.println("\n 101 - Quiero ver el menu general");
				System.out.println("\n 0 - Ya no quiero comprar mas.");
				System.out.println("\n ------------------------------------------------");
				int sel = Integer.parseInt(input(""));
	
				if (sel == 0) {
					return false;
				}
				else if (sel == 101)
				{
					continuar = menuPrincipal(menu, continuar, usuario);
					if (continuar ==  false) {
						return false;
					}
				}
				
				else if (sel ==50)
				{
					String fact = usuario.givefac();
					System.out.println(fact);
				}
				
				else if (sel != 0 & sel != 101)
				{
					combo producto = combos.get(sel-1);
					ArrayList<option> delComb = producto.getList();
					for (int i =0  ; i < delComb.size(); i++)
					{
						option temp = delComb.get(i);
						usuario.agregarOption(temp);
					}
					
					
				}
				
			} 
			catch (NumberFormatException e) 
			{
				
			}
		}
		return false;
	}
	
	
	
	public void ejecutarAplicacion() throws FileNotFoundException, IOException
	{
		String name = input(" Ingrese su nombre \n");
		pedido usuario = new pedido(name,"Calle 184");
		menuDatos menu = LoaderRestaurante.cargarArchivo();
		boolean continuar = true;
		while(continuar)
			
		{
			try 
			{
				continuar = inicioAl(menu, continuar, usuario);

			}
			catch (NumberFormatException e)
			{
				
				
			}
			
	}
	}
	
	public boolean inicioAl(menuDatos menu , boolean continuar, pedido usuario) 
	{
		System.out.println("\n ¡Bienvenido a la Hamburguesa Rey!");
		System.out.println("\n ¡Somos el mas grande restaurante, lo tenemos todo!");
		System.out.println(" A continuacion, echale un vistazo a lo que tenemos para ofrecerte");
		System.out.println("\n ¡Elige una opcion!");
		System.out.println("\n 1) Quiero ver el menu general.");
		System.out.println("\n 2) Quiero ver el menu de combos.");
		int opcionSelec = Integer.parseInt(input(""));
		if (opcionSelec == 0)
		{
			continuar = false;
			System.out.println("Ha sido un gusto atenderte el dia de hoy.");
			System.out.println("Esperamos que vuelvas pronto :)");
			System.out.println("\n Recuerda que somos los numero uno en sabor!");
			return continuar;
		}
		else if (opcionSelec == 1)
		{
			continuar = menuPrincipal(menu, continuar, usuario);
			if (continuar == false)
			{
				return false;
			}
		}
		else if (opcionSelec == 2)
		{
			continuar = mostrarCombos(menu, continuar, usuario );
			if (continuar == false)
			{
				return false;
			}
		}
		
		return false;
	}

	public String input(String mensaje)
	{
		/*
		 * Metodo input para permitir que el usuario interactue con el programa
		 */
		try
		{
			System.out.print(mensaje );
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}

}
