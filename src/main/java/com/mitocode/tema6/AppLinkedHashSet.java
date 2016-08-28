package com.mitocode.tema6;

import java.util.LinkedHashSet;
import java.util.Set;

public class AppLinkedHashSet {

	public static void main(String[] args) {
		Set<Persona> lista = new LinkedHashSet<>();		
		lista.add(new Persona(1,"MitoCode",22));
		lista.add(new Persona(1,"Mito",22));
		lista.add(new Persona(1,"Code",22));
		lista.add(new Persona(1,"Code",22));
		lista.add(new Persona(1,"MitoCode",25));
		lista.add(new Persona(1,"AAA",22));
		
		for(Persona per : lista){
			System.out.println(per.getEdad()+"-" + per.getNombre());
		}
	}
}
