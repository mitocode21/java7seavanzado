package com.mitocode.tema6;

import java.util.Set;
import java.util.TreeSet;

public class AppTreeSet {

	public static void main(String[] args) {
		Set<Persona> lista = new TreeSet<>();
		lista.add(new Persona(1,"MitoCode",22));
		lista.add(new Persona(2,"Code",23));
		lista.add(new Persona(3,"Mito",24));
		lista.add(new Persona(4,"Jaime",25));
		lista.add(new Persona(3,"Mito",24));
		lista.add(new Persona(6,"AAA",27));
		
		for(Persona per : lista){
			System.out.println(per.getId() + "-" + per.getNombre() + "-" + per.getEdad());
		}
	}
}
