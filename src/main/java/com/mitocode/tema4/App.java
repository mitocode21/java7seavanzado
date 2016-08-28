package com.mitocode.tema4;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		 
		/*List<String> lista = new ArrayList<>();
		lista.add("MitoCode");
		//lista.add(25);
		
		String texto = lista.get(0);
		System.out.println(texto);
		
		/*String[] array = new String[5];
		array[0] = "MitoCode";
		array[1] = 1;*/
		
		Clase<String,Integer,String,Double> c = new Clase<>("MitoCode",25,"Jaime",25.0);
		c.mostrarTipo();
		
		List<Clase<String,Integer,String,String>> lista = new ArrayList<>();
		lista.add(new Clase<String,Integer,String,String>("MitoCode",25,"Jaime","Suscribete"));
		
		for(Clase<String,Integer,String,String> cl : lista){
			cl.mostrarTipo();
		}
		
		
		
		
		
		
		
		
		
		
 	}
}
