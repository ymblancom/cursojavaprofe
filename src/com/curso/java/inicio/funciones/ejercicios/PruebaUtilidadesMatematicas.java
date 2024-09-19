package com.curso.java.inicio.funciones.ejercicios;

import com.curso.java.utils.Utilidades;
import com.curso.java.utils.UtilidadesMatematicas;

public class PruebaUtilidadesMatematicas {

	public static void main(String[] args) {

		int numero = Utilidades.pideDatoNumerico("Introduce un número");
		int resultado = UtilidadesMatematicas.sumar(numero, 3);
		System.out.println(resultado);
		
		UtilidadesMatematicas.operacionNumerosIndefinidos("suma", 1,2,3,4,5,6,7,8,9,10,11,12);
		
		double resultadoOperacion = UtilidadesMatematicas.operacion(12, 2, "+");
		System.out.println(resultadoOperacion);
		
		int[] numeros = {1,2,3};
		int resultadoSumatorio = UtilidadesMatematicas.calculaSumatorio(numeros);
		System.out.println("Sumatorio: "+resultadoSumatorio);
		
		int media = UtilidadesMatematicas.calculaMedia(numeros);
		System.out.println("Media: "+media);
		
	}

}
