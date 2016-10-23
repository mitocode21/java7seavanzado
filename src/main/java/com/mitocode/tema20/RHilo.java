package com.mitocode.tema20;

public class RHilo implements Runnable {

	private int id;
	
	public RHilo(int id){
		this.id = id;
	}
	
	@Override
	public void run() {
		for(int i = 0;i<100;i++){
			System.out.println("[R]Ejecuntándose hilo de id -->" + id);
		}
		
	}

}
