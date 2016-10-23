package com.mitocode.tema3;

public class App {
		
	public static void main(String... mitocode) {	
		//PaisDAOImpl dao = new PaisDAOImpl();				
		//Con Singleton correcto
		
		Runnable r = new Runnable(){

			@Override
			public void run() {
				PaisDAOImpl dao = PaisDAOImpl.getInstance();
				
				for(Object obj : dao.getPaises()){
					System.out.println(((Pais)obj).getNombre());
				}				
			}
			
		};		
		
		Thread hilo1 = new Thread(r);
		hilo1.start();
		
		Thread hilo2 = new Thread(r);
		hilo2.start();
				
	}
}
