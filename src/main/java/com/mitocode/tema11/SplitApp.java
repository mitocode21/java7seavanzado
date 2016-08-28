package com.mitocode.tema11;

public class SplitApp {

	public static void main(String... mitocode) {
		String cadena = "Jaime|MitoCode|Mito|Code";
		String[] extraccion = cadena.split("\\|",5);
		
		for(String elemento : extraccion){
			System.out.println(elemento);	
		}
		
	}
}
