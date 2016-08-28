package com.mitocode.tema12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpRegApp {

	public static void main(String... mitocode) {
		
		//hablar sobre metodos de clase y de instancia
		/*Pattern p = Pattern.compile("..s");
		Matcher m = p.matcher("xxs");
		
		System.out.println(m.matches());			
		
		String x = "hola;jaime";
		String[] arr = x.split(p.pattern());
		
		for(String elemento : arr){
			System.out.println(elemento);
		}*/
		
		String texto = "jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code;jaime;mitocode;mito;code";
		
		///////////////////////////////
		
		long ini2 = System.currentTimeMillis();							
		String[] arreglo2 = texto.split(";");
		long fin2 = System.currentTimeMillis();
		System.out.println(arreglo2);
		System.out.println(fin2 - ini2);
		
		///////////////////////////////
		//TIP: mientras mas compleja la exp. regular el tiempo se favorece a pattern
		//probar rendimiento en un loop entre split vs matcher
		long ini = System.currentTimeMillis();
		Pattern patron = Pattern.compile(";");							
		//explicar que internamente el split|replace* utiliza un compile e invocarlo varias veces afectaria rendimiento		
		String[] arreglo = patron.split(texto);			
		long fin = System.currentTimeMillis();
		System.out.println(arreglo);
		System.out.println(fin - ini);

	}

}
