package com.mitocode.tema17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class AppReader {

	private int BUFFER_SIZE = 8 * 1024;

	public void leer() throws IOException {

		try (Reader r = new BufferedReader(new FileReader("mitocode.txt"), BUFFER_SIZE)) {
			int data = r.read();
			System.out.println((char) data);
			while (data != -1) {
				data = r.read();
				System.out.println((char) data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void escribir() throws IOException {
		try (Writer w = new BufferedWriter(new FileWriter("mitocode.txt"), BUFFER_SIZE)) {
			w.write("Suscribanse");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws IOException {
		AppReader app = new AppReader();
		// app.leer();
		app.escribir();
	}
}
