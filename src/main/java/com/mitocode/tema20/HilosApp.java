package com.mitocode.tema20;

public class HilosApp {

	public static void main(String[] args) throws InterruptedException {

		THilo hilo1 = new THilo(1);		
		hilo1.start();		

		Thread hilo2 = new Thread(new RHilo(2));				
		hilo2.start();		

		Runnable r = new Runnable() {

			@Override
			public void run() {				
				System.out.println("[A]Hilo ejecuntandose");
			}
		};

		Thread hilo3 = new Thread(r);
		//hilo3.start();	
		if(!hilo3.isAlive()){
			System.out.println("Iniciando hilo 3");
			hilo3.start();
		}

		System.out.println("Ejecutándose hilo MAIN");

	}

}
