package com.curso.java;

public class HolaMundo{

	public static void main(String[] args) {

		System.out.println("Hola Mundo");
		
		//Tipo objeto, o Arrays
		String nombre = "Jose Luis";
		String apellidos = "Llorente";
		
		//Tipos primitivos
		//Enteros
		byte numero1 = 2;
		short numero2 = 2;
		int edad = 24;
		long numero3 = 2;
		
		
		//Decimales
		float decimal2 = 1.0f;
		double decimal1 = 9.7;
		
		
		//Caracter
		char caracter = 'c';
		
		//Booleanos
		boolean esMayorEdad = 7>3;
		
		System.out.println(nombre + apellidos + (edad + 2));
		
		int suma = edad +5;
		System.out.println(suma);
	}

}
