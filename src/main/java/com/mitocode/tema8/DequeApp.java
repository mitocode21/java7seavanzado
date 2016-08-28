package com.mitocode.tema8;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeApp {

	public static void main(String... mitocode) {

		Deque<String> dq = new ArrayDeque<>();
		dq.add("1-Jaime");
		dq.add("2-Mito");
		dq.add("3-Code");
		dq.add(null);
		
		String x = dq.peek();
		System.out.println("Peek " + x);
		
		x = dq.poll();
		System.out.println("Poll " + x);
		
		x = dq.pop();
		System.out.println("Poop " + x);
		
		dq.addFirst("0-MitoCode");
		dq.addLast("4-JCode");				
		
		
		for (String elemento : dq) {
			System.out.println(elemento);
		}
	}

}
