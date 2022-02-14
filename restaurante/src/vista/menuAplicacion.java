package vista;

import controller.menuDatos;
import controller.option;
import controller.LoaderRestaurante;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class menuAplicacion {

	public static void menuPrincipal(menuDatos menu) {
		
		System.out.println("\n ¡Bienvenido a la Hamburguesa Rey!");
		System.out.println("\n ¡Somos el mas grande restaurante, lo tenemos todo!");
		System.out.println(" A continuacion, echale un vistazo a nuestro menu:");	
		ArrayList<option> options = menu.mostrarProductos();
		for (int i = 0; i< options.size(); i++) {
			option value1 = options.get(i);
		    String price = Integer.toString(value1.givePrice());
		    String name2 = value1.giveName();
		    name2 = name2.substring(0,1).toUpperCase() + name2.substring(1);
		    int dif = 30-price.length()- name2.length();
		    String space= new String(new char[dif]).replace("\0", "-");
		    System.out.println( "\n" + (i+1) + " - "+ name2 + space + price);
		    
		}
		}
	public void ejecutarAplicacion() throws FileNotFoundException, IOException
	{
		menuDatos menu = LoaderRestaurante.cargarArchivo();
		boolean continuar = true;
		while(continuar)
		{
			try 
			{
				menuPrincipal(menu);
				int opcionSelec = Integer.parseInt(input(""));
				if (opcionSelec == 0)
				{
					continuar = false;
					System.out.println("Ha sido un gusto atenderte el dia de hoy.");
					System.out.println("Esperamos que vuelvas pronto :)");
					System.out.println("\n Recuerda que somos los numero uno en sabor!");
				}
				

			}
			catch (NumberFormatException e)
			{
				
				
			}
			
	}
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
