package com.curso.java.inicio.funciones.ejercicios;

//definir funcion que recibe un String y devuelve la longitud del String
public class Funciones1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tamanio = calcularLongitudTexto("casa");
		System.out.println("Tamaño del texto "+ tamanio);
		System.out.println(tamanio*2);
		
		String[] colores = {"rojo", "verde", "azul"};
		Funciones2.main(colores);
		
	}
	
	private static int calcularLongitudTexto(String texto) {
		System.out.println("Entrqa en calcularLongitudTexto");
		int longitudTexto = texto.length();
		
		return longitudTexto;
	}

	
}
