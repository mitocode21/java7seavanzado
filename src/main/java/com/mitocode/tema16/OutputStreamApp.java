package com.mitocode.tema16;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamApp {

	public void escribirPorOutputStream() throws IOException {
		// byte a byte
		long ini = System.nanoTime();
		// String texto = "Suscribete al canal";
		InputStream fuente = null;
		byte[] buffer = new byte[1024 * 8];
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
		long fin = System.nanoTime();
		System.out.println("Tiempo OutputStream " + (fin - ini));
	}

	public void escribirPorBufferedOutputStream() throws IOException {		
		long ini = System.nanoTime();		

		final int BUFFER_SIZE = 1024 * 8;
		byte[] buffer = new byte[BUFFER_SIZE];		
		InputStream fuente = null;
		
		try (OutputStream destino = new BufferedOutputStream(new FileOutputStream("mitoFile.gif"), BUFFER_SIZE)) {
			fuente = new FileInputStream("suscribete.gif");
			int byteRead;
			
			while ((byteRead = fuente.read(buffer)) != -1) {
				destino.write(byteRead);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (fuente != null) {
				fuente.close();
			}
		}
		long fin = System.nanoTime();
		System.out.println("Tiempo BufferedOutputStream " + (fin - ini));
	}

	public static void main(String[] args) throws IOException {
		final OutputStreamApp app = new OutputStreamApp();

		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				try {
					app.escribirPorOutputStream();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		};

		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				try {
					app.escribirPorBufferedOutputStream();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		};

		Thread hilo1 = new Thread(r1);
		hilo1.start();

		Thread hilo2 = new Thread(r2);
		hilo2.start();

	}
}
