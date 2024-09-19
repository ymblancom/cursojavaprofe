package com.curso.java.inicio.strings.ejercicios;

public class EjercicioStringsSubstring {

	public static void main(String[] args) {
		String nombreFichero = "asda.sdf.ichero.imagen.jpg";
		
		int posicionPunto = nombreFichero.lastIndexOf("."); 
		System.out.println("Extensión: "+ nombreFichero.substring( posicionPunto   ));
		System.out.println("Nombre: " + nombreFichero.substring(0, posicionPunto  ) );
		

	}

}
