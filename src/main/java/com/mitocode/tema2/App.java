package com.mitocode.tema2;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	private List canasta = new ArrayList();
	
	private void verificar(Object objeto){
		if(objeto instanceof Fruta){
			canasta.add(objeto);
			System.out.println("Fruta agregada " + ((Fruta)objeto).getNombre());
		}else{
			System.out.println("Elemento no permitido, solo frutas porfavor");
		}
	}

	public static void main(String[] args) {	
		/*String texto = new String("MitoCode");
		if(texto instanceof String){
			System.out.println("Es un String");
		}*/
		
		/*Alumno al = new Alumno();
		if(al instanceof Persona){
			System.out.println("Es una Persona");
		}*/
		
		//Se tiene una canasta en donde solo se debe permitir ingresar frutas
		System.out.println("Canasta abierta, porfavor ingresar SOLO frutas");
		
		
		Manzana m1 = new Manzana("ROJA");
		Manzana m2 = new Manzana("VERDE");
		Naranja n1 = new Naranja("NARANJA SIN PEPA");
		Galleta g1 = new Galleta("CHOCOLATE");
		
		App app = new App();
		app.verificar(m1);
		app.verificar(m2);
		app.verificar(n1);
		app.verificar(g1);
		
		
		
	}

}
