package com.mitocode.tema3;

public class App {
		
	public static void main(String... mitocode) {	
		//PaisDAOImpl dao = new PaisDAOImpl();				
		//Con Singleton correcto
		
		PaisDAOImpl dao = PaisDAOImpl.getInstance();
		
		for(Object obj : dao.getPaises()){
			System.out.println(((Pais)obj).getNombre());
		}
		
		for(Object obj : dao.getPaises()){
			System.out.println(((Pais)obj).getNombre());
		}
		
		PaisDAOImpl daoi = PaisDAOImpl.getInstance();
		for(Object obj : daoi.getPaises()){
			System.out.println(((Pais)obj).getNombre());
		}
	}
}
