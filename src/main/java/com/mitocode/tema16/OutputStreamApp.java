package com.mitocode.tema16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamApp {

	public void escribirPorOutputStream() throws IOException {
		// byte a byte
		long ini = System.currentTimeMillis();
		// String texto = "Suscribete al canal";
		InputStream fuente = null;
		byte[] buffer = new byte[1024];
		try (OutputStream destino = new FileOutputStream("mitoFile.gif")) {
			fuente = new FileInputStream("suscribete.gif");
			int byteRead;
			while ((byteRead = fuente.read(buffer)) != -1) {
				destino.write(buffer, 0, byteRead);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (fuente != null) {
				fuente.close();
			}
		}
		long fin = System.currentTimeMillis();
		System.out.println("Tiempo OutputStream " + (fin - ini));
	}

	public static void main(String[] args) throws IOException {
		OutputStreamApp app = new OutputStreamApp();
		app.escribirPorOutputStream();
	}
}
