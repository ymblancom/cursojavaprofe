package com.curso.java.utils;

public class UtilidadesMatematicas {

	public static int sumar(int numero1, int numero2) {
		int resultadoSuma = numero1 + numero2;
		
		return resultadoSuma;
	}
	
	//VARARGS
	public static void operacionNumerosIndefinidos(String operacion, int... numeros) {
		System.out.println("operacionNumerosIndefinidos");
		int resultado=0;
		for (int i : numeros) {
			resultado+=i;
		}
		System.out.println(resultado);
	}
	
	
	public static double operacion (double num1, double num2, String operacion) {
		double resultado = 0;
		
		if (operacion.equals("suma") || operacion.equals("+")) {
			resultado = num1 + num2;
		}else if(operacion.equals("resta") || operacion.equals("-")) {
			resultado = num1 - num2;
		}else if(operacion.equals("multiplica") || operacion.equals("*")) {
			resultado = num1 * num2;
		}else if(operacion.equals("divide") || operacion.equals("/")) {
			resultado = num1 / num2;
		}
		
		switch(operacion) {
			case "suma":
			case "+": resultado = num1 + num2;break;
			case "-": resultado = num1 - num2;break;
			case "*": resultado = num1 * num2;break;
			case "/": resultado = num1 / num2;break;
		}
		
		return resultado;
	}
	
	public static void pintaNota () {
		int nota=4;
		
		if (nota<5) {
			System.out.println("Suspenso");
		}else if (nota<7) {
			System.out.println("Aprobado");
		}if (nota<9) {
			System.out.println("Notable");
		}if (nota<=10) {
			System.out.println("Sobresaliente");
		}else {
			System.out.println("Nota incorrecta");
		}
	}
	
	
	public static int calculaSumatorio (int[] numeros) {
		int resultado=0;
//		for (int i = 0; i < numeros.length; i++) {
//			resultado+=numeros[i];
//		}
		for (int numero: numeros) {
			resultado+=numero;
			//resultado = resultado+numero;
		}
		
		return resultado;
	}
	
	public static int calculaMedia (int[] numeros) {
		int media = 0;
		int suma = calculaSumatorio(numeros);
		
		media = suma/numeros.length;
		
		return media;
	}
	
}







