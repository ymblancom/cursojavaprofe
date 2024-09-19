package com.curso.java.inicio.strings;

import java.util.Scanner;

public class EjemplosStrings {

	public static void main(String[] args) {
		
		//Los Strings se comparan SIEMPRE con el método equals
		String s1 = "hola";
		String s2 = "hola";
		String s3 = new String("hola");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		
		//Inmutabilidad
		String nombre = " JoseTLuiTsza  TRA";
		nombre = nombre.toUpperCase();
		//System.out.println(nombre);
		//Scanner scan = new Scanner(System.in);
		
		//Funciones
		System.out.println(nombre.toLowerCase().contains("jo"));
		System.out.println(nombre);
		
		String nombreFichero = "fichero.jpg";
		System.out.println(nombreFichero.endsWith(".jpg"));
		
		System.out.println(nombre.indexOf("ZA"));//Posicion en la que se encuentra el string que le paso empezando a buscar desde cero
		System.out.println(nombre.lastIndexOf("T"));//Posicion en la que se encuentra el string que le paso empezando a buscar desde el final
		System.out.println(nombre.length());//Tamaño del string
		System.out.println(nombre.indexOf( "J" ));
		
		System.out.println(nombre.charAt(nombre.length()-1));//Caracter que se encuentra en la posición que le pasamos y la posición no puede ser mayor al tamaño -1
		
		String texto = "        f  a	";
		System.out.println(texto.trim());
		System.out.println(texto.trim().length());

		System.out.println(texto.isBlank());
		System.out.println(texto.trim().isEmpty());

		System.out.println("'"+texto.replace(" ", "")+"'");
		
		
		System.out.println(nombreFichero.substring(2,5));
	}

}
