package controller;
import java.io.IOException;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LoaderRestaurante {
	public static menuDatos cargarArchivo() throws  FileNotFoundException, IOException
	{
		Map<String, option> opciones = new HashMap<>();
		BufferedReader br = new BufferedReader(new FileReader("./data/menu.txt"));
		String line = br.readLine();
		menuDatos menu = null;
		ArrayList<option> options = new ArrayList<option>();
		
		while(line != null) {
			String[] partes = line.split(";");
			String item = partes[0];
			String priceT = partes[1];
			int price = Integer.parseInt(priceT);
			option theOption = opciones.get(item);
			if (theOption == null) 
			{
				option tempOp = new option(item, price);
				options.add(tempOp);
				opciones.put(item, tempOp);
			}
			
			menu = new menuDatos(opciones,options);
			line = br.readLine();		
		}

		br.close();

		return menu;

	}
	
}
