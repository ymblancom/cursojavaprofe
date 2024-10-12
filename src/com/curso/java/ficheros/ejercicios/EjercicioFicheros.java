package com.curso.java.ficheros.ejercicios;

import java.io.File;

public class EjercicioFicheros {

	public static void main(String[] args) {
		
		File directorio = new File ("C:\\Users\\Tardes.SB03-00\\Desktop\\ejercicioficheros\\ejercicioficheros");
		System.out.println("En el directorio hay "+ directorio.listFiles().length + " ficheros");
		File[] ficheros = directorio.listFiles();
		int contadorFicheros=0;
		int contadorDirectorios=0;
		for (File file : ficheros) {
			if (file.isDirectory()) {
				contadorDirectorios++;
			}else {
				contadorFicheros++;
			}
		}
		System.out.println("directorios: "+ contadorDirectorios);
		System.out.println("ficheros: "+ contadorFicheros);
		

		for (String fileName :directorio.list()) {
			if (fileName.endsWith(".jpg") || fileName.endsWith(".png") ) {
				System.out.println(fileName);
			}
		}
		
		long tamanioMaximo=0;
		String nombreFicheroTamanioMaximo="";
		for (File file : ficheros) {
			if(file.length()>tamanioMaximo) {
				tamanioMaximo = file.length();
				nombreFicheroTamanioMaximo=file.getName();
			}
		}
		System.out.println(nombreFicheroTamanioMaximo + " "+ tamanioMaximo);
	}

}
