package Utilidades;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class GestorES {
	Scanner miLector;
	String linea;
	ArrayList<String> listaLinea;
	Iterator<String> iterador;
	
	
	public GestorES(String ruta, String separador) {
		listaLinea = new ArrayList<String>();
		iterador = listaLinea.iterator();
		try {
			File miArchivo = new File(ruta);
			miLector = new Scanner(miArchivo);
			miLector.useDelimiter(separador);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public String siguiente() {			
		// Se comprueba si hay más elementos en la lista de line
		if(iterador.hasNext()) {
			return iterador.next();
		}else {// si no, se trata de cargar la lista con más elementos	
			// si existen más lineas se carga la lista
			if (miLector.hasNextLine()) {
				listaLinea.clear();
				listaLinea.addAll(Arrays.asList(miLector.next().split(miLector.delimiter().pattern())));	
				return iterador.next();
			}else {// si no se cierra el fichero y se devuelve 'null'
				miLector.close();
				return null;
			}
			
		}
	}
	
	public void finalizar() {
		miLector.close();
	}
}
