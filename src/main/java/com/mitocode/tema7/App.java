package com.mitocode.tema7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class App {

	public static void main(String[] args) {

		Map<Persona, String> map = new HashMap<>();
		map.put(new Persona(1,"MitoCode",21), "MitoCode");
		map.put(new Persona(2,"MitoCode",22), "Mito");
		map.put(new Persona(2,"MitoCode",22), "Mito");
		map.put(new Persona(2,"MitoCode",22), "Mito");
		map.put(new Persona(3,"MitoCode",24), "AAA");
		map.put(new Persona(6,"MitoCode",26), null);
		
		/*Iterator it = map.keySet().iterator();
		while(it.hasNext()){
		  Persona key = (Persona) it.next();
		  System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
		}*/
		
		for(Entry<Persona, String> ent : map.entrySet()){
			System.out.println("Clave: " + ent.getKey()+ " -> Valor: " + ent.getValue());
		}
	}

}
