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
		ArrayList<combo> combos = new ArrayList<combo>();
		ArrayList<ingrediente> ingredientes = new ArrayList<ingrediente>();
		
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
			
			line = br.readLine();		
		}
		br.close();
		
		BufferedReader cm = new BufferedReader( new FileReader("./data/combos.txt"));
		String linea = cm.readLine();

		while (linea != null) 
		{

			String[] parts = linea.split(";");
			String noCom = parts[0];
			String des = parts[1];
			char[] charAr = des.toCharArray();
			String desc = "";
			int j = 0;
			int desc2 = 0;
			int bool2 = 0;
			while (bool2 != '%') {
				bool2 = charAr[j+1];
				desc += String.valueOf(charAr[j]);
				desc2 = Integer.parseInt(desc);
				j++;
			
			}
			ArrayList<option> contenido = new ArrayList<option>();
			for (int i = 2 ; i < parts.length ; i++) {
				String item = parts[i];
				option comp = opciones.get(item);
				contenido.add(comp);
			}
			Double descuento = Double.valueOf(desc2);
			combo tempCom = new combo(noCom, descuento, contenido);

			combos.add(tempCom);

			linea = cm.readLine();
		}
		cm.close();
		
		BufferedReader in = new BufferedReader( new FileReader("./data/ingredientes.txt"));
		String lin = in.readLine();
		
		while(lin != null) 
		{
			String[] datos = lin.split(";");
			String name = datos[0];		
			int price = Integer.parseInt(datos[1]);	
			ingrediente ing = new ingrediente(name, price);
			ingredientes.add(ing);
			lin = in.readLine();
		}
		in.close();
		
		
		
		menu = new menuDatos(opciones,options, combos, ingredientes);
		

		return menu;

	}
	
}
