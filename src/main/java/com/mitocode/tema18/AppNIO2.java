package com.mitocode.tema18;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class AppNIO2 {

	public void operacionesFile(String operacion) throws IOException {

		Path pathOrigen = Paths.get("mitocode.txt");
		Path pathDestino = Paths.get("mitocodeFolder/mitocode.txt");

		switch (operacion) {
		case "existe":
			// boolean existe = Files.exists(path, new LinkOption[]{
			// LinkOption.NOFOLLOW_LINKS});
			// System.out.println(existe);
			break;
		case "crear":
			// Path nuevoPath = Files.createDirectory(path);
			break;
		case "copiar":
			Files.copy(pathOrigen, pathDestino, StandardCopyOption.REPLACE_EXISTING);
			break;
		case "mover":
			Files.move(pathOrigen, pathDestino, StandardCopyOption.REPLACE_EXISTING);
			break;
		case "eliminar":
			Files.delete(pathDestino);
			break;
		}

	}

	public void leer() throws IOException {
		Path path = Paths.get("mitocodeCopy.txt");

		byte[] bytes = Files.readAllBytes(path);

		for (byte b : bytes) {
			System.out.print((char) b);
		}
	}

	public void escribir() throws IOException {
		Path path = Paths.get("mitocodeCopy.txt");

		String texto = "Coders";
		Files.write(path, texto.getBytes());
	}

	public void leerPorChannel() throws IOException {
		RandomAccessFile file = new RandomAccessFile("mitocodeCopy.txt", "rw");
		FileChannel channel = file.getChannel();
		
		long size = channel.size();
		ByteBuffer buf = ByteBuffer.allocate((int)size);

		int bytesRead = channel.read(buf);
		while (bytesRead != -1) {

			System.out.println("Leidos " + bytesRead);
			
			buf.flip(); //Preparado el buffer para leer

			while (buf.hasRemaining()) {
				System.out.print((char) buf.get());
			}

			buf.clear(); //Cambio a modo escritura
			bytesRead = channel.read(buf);
		}
		file.close();
	}

	public void escribirPorChannel() throws IOException {
		RandomAccessFile file = new RandomAccessFile("mitocodeCopy.txt", "rw");
		FileChannel channel = file.getChannel();
		
		String texto = "Hola";		

		ByteBuffer buf = ByteBuffer.allocate(128);
		buf.clear(); //modo escritura
		buf.put(texto.getBytes());

		buf.flip();

		while(buf.hasRemaining()) {
		    channel.write(buf);
		}
		file.close();
	}

	public static void main(String[] args) throws IOException {
		AppNIO2 app = new AppNIO2();
		app.escribirPorChannel();
		app.leerPorChannel();
	}

}
