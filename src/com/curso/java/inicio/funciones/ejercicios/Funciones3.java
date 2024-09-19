package com.curso.java.inicio.funciones.ejercicios;

public class Funciones3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 5;
		pintaTablaMultiplicar(numero);
		
		String nombrePerro = "Rex";
		String nombrePerro2 = "Toby";
		pintaNombrePerro(nombrePerro2, nombrePerro);
		//pintaNombrePerro(nombrePerro);
	}
	
	public static void pintaTablaMultiplicar (int numero) {
		System.out.println(numero);
		for (int i = 1; i <= 10; i++) {
			System.out.println(i +"x"+ numero +"="+ (numero*i) );
		}
	}
	
	public static void pintaNombrePerro(String nombrePerro1, String nombrePerro2) {
		System.out.println(nombrePerro1 + " " + nombrePerro2);
		
		
	}
	
	
	
	
	
	
	

	
	
}
