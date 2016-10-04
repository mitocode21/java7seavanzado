package com.mitocode.tema3;

import java.util.ArrayList;
import java.util.List;

public class PaisDAOImpl {

	public static PaisDAOImpl instancia = null;
	private List paises = null;
	
	private PaisDAOImpl(){
		
	}
	
	public static PaisDAOImpl getInstance(){
		if(instancia == null){
			instancia = new PaisDAOImpl();
		}
		return instancia;
	}	

	public List getPaises() {
		if (paises == null) {
			paises = new ArrayList();
			
			Pais p1 = new Pais("PERU");
			Pais p2 = new Pais("MEXICO");
			Pais p3 = new Pais("COLOMBIA");

			paises.add(p1);
			paises.add(p2);
			paises.add(p3);
		}
		return paises;
	}
}
