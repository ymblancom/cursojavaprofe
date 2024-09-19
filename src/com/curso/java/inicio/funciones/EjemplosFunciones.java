package com.curso.java.inicio.funciones;

public class EjemplosFunciones {

	public static void main(String[] args) {
		System.out.println(esPar(""));
		metodo0();
		metodo1();
		metodo2();
		metodo3();
	}

	//Sobrecarga
	public static boolean esPar(int numero) {
		boolean esPar = numero%2==0;
		
		return esPar;
	}
	
	public static boolean esPar() {
		int numero = (int)Math.random()*100;
		boolean esPar = numero%2==0;
		
		return esPar;
	}
	
	public static boolean esPar(String numeroStr) {
		int numero = Integer.parseInt(numeroStr);
		boolean esPar = numero%2==0;
		
		return esPar;
	}
	
	public static void metodo0() {
		System.out.println("Metodo0 de EjemplosFunciones");
	}
	
	protected static void metodo1 () {
		System.out.println("Hola Mundo");
	}
	
	static void metodo2() {
		System.out.println("Metodo2 de EjemplosFunciones");
	}
	
	private static void metodo3() {
		System.out.println("Metodo3 de EjemplosFunciones");
	}
}
