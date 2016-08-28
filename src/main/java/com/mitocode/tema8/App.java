package com.mitocode.tema8;

import java.util.Stack;

public class App {

	public static void main(String[] args) throws InterruptedException {
		Stack<Persona> pila = new Stack<Persona>();
		pila.push(new Persona(4,"MitoCode",25));
		pila.push(new Persona(2,"MitoCode",27));
		pila.push(new Persona(2,"MitoCode",27));
		pila.push(new Persona(1,"MitoCode",28));
		
		for(Persona elemento : pila){
			System.out.println(elemento);
		}
		
		System.out.println("Tope " + pila.peek());
		System.out.println("Search " + pila.search(new Persona(1,"MitoCode",28)));
		System.out.println("LIFO");
		while(!pila.isEmpty()){
			System.out.println("Atendiendo a " + pila.pop());
			Thread.sleep(1000);
		}
			
			
	}
}
