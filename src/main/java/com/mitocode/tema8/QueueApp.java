package com.mitocode.tema8;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {

	public static void main(String[] args) throws InterruptedException {
		Queue<Persona> cola = new PriorityQueue<>();
		cola.offer(new Persona(1,"Jaime",28));
		cola.offer(new Persona(1,"Mito",27));
		cola.offer(new Persona(1,"MitoCode",25));
		cola.offer(new Persona(1,"Code",26));		
									
		while(!cola.isEmpty()){
			
			//System.out.println("Se procede a atender a " + cola.peek());
			
			System.out.println("Atendiendo a " + cola.poll());
			Thread.sleep(1000);
		}
	}
}
