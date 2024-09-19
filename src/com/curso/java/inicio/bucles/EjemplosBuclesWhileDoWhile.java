package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class EjemplosBuclesWhileDoWhile {

	public static void main(String[] args) {
		
		System.out.print("*");
		System.out.print("A");
		System.out.println("B");
		System.out.print("C");
		
		//Bucle while
		int numero = 15;
		
		while (numero<10) {
			System.out.println(numero);
			
			if (numero==5) {
				break;
			}
			numero+=3;
		}
		System.out.println("Salió del bucle");
		
		
		
		
		

		//Bucle do-while
		String respuesta = "";
		do {
			System.out.println("Deseas continuar??");
			Scanner scan = new Scanner(System.in);
			respuesta = scan.nextLine();
		}while(respuesta.equals("si"));
		System.out.println("Salió del do-while");
		
		int valor = 0;
		do {
			System.out.println("Entra");
			valor+=2;
		}while(valor!=4);
		

		
		
	}

}
