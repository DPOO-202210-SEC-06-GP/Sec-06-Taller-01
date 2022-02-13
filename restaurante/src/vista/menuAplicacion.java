package vista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class menuAplicacion {
	
	public static void menuPrincipal() {
		System.out.println("\n ¡Bienvenido a la Hamburguesa Rey!");
		System.out.println("\n ¡Somos el mas grande restaurante, lo tenemos todo!");
		System.out.println(" A continuacion, echale un vistazo a nuestro menu:");

			
		}
	public void ejecutarAplicacion()
	{
		boolean continuar = true;
		while(continuar)
		{
			try 
			{
				menuPrincipal();
				int opcionSelec = Integer.parseInt(input(""));
				
			

			}
			catch (NumberFormatException e)
			{
				
				
			}
			
	}
	}

	public String input(String mensaje)
	{
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
