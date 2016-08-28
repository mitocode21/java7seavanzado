package com.mitocode.tema4;

import java.util.ArrayList;
import java.util.List;

public class AppWild {

	public void listarUpperBounded(List<? extends Persona> lista) {
		for (Persona per : lista) {		
			//if(a instanceof Alumno){
			System.out.println(per.getNombre());
			//}else if(a instanceof Profesor){
			//}
		}
	}
	
	public void listarLowerBounded(List<? super Alumno> lista) {
		for (Object al : lista) {		
			//if(a instanceof Alumno){
			System.out.println(((Persona)al).getNombre());
			//}else if(a instanceof Profesor){
			//}
		}
	}
	
	public void listarUnBounded(List<?> lista) {
		for (Object al : lista) {		
			//if(a instanceof Alumno){
			System.out.println(((Persona)al).getNombre());
			//}else if(a instanceof Profesor){
			//}
		}
	}
	
	public static void main(String[] args) {
		AppWild aw = new AppWild();
		
		Persona al1 = new Profesor("MITOCODE");
		Persona al2 = new Profesor("JAIME");
		Persona al3 = new Profesor("MITO");
		
		List<Persona> lista = new ArrayList<>();
		lista.add(al1);
		lista.add(al2);
		lista.add(al3);
		
		aw.listarUpperBounded(lista);
		System.out.println();
		aw.listarLowerBounded(lista);
		System.out.println();
		aw.listarUnBounded(lista);
	}
}
