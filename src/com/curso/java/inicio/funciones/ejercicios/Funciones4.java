package com.curso.java.inicio.funciones.ejercicios;

import com.curso.java.utils.Utilidades;

public class Funciones4 {

	public static void main(String[] args) {
		
//		int edad = Utilidades.pideDatoNumerico("Introduce tu edad");
//		System.out.println("La edad introducida por el usuario es "+edad);
//		
//		int piso = Utilidades.pideDatoNumerico("Introduce el piso al que vas");
//		System.out.println("El usuario con "+edad + " años va al piso "+piso);
//		
//		String nombre = Utilidades.pideDatoString("Introduce tu nombre");
//		
//		
//		
//		double numAleatorio = Math.random();
//		int num = Integer.parseInt("1");
//		int anioNacimiento = Utilidades.calculaAnioNacimiento(28);
//		boolean emailCorrecto = Utilidades.validarEmail("asdasd@asdas.es");
		
//		int numero = Utilidades.pideDatoNumerico("Introduce un número para pintar su tabla de multiplicar");
//		Funciones3.pintaTablaMultiplicar(numero);
		
		String[] opciones = {"Opción1","Opción2","Opción3","Salir"};
		Utilidades.pintarMenu(opciones,true);
		
		String[] opciones2 = {"1. Opción1","2. Opción2","3. Opción3","4. Salir"};
		Utilidades.pintarMenu(opciones2,false);
		
	}

}
