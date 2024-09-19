package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioCollatz {

	public static void main(String[] args) {
		String respuesta = "";
		do {
			System.out.println("Escribe un numero");
			Scanner scan = new Scanner(System.in);
			int numero = scan.nextInt();
			System.out.println(numero);
			
			while(numero!=1) {
				if(numero%2 == 0) {//número par
					//numero = numero/2;
					numero /=2;
				}else {//Impar
					numero = numero*3+1;
				}
				System.out.println(numero);
			}
			
			System.out.println("Deseas continuar?");
			scan = new Scanner(System.in);
			respuesta = scan.nextLine();
			
		}while(respuesta.equals("si"));
		
		System.out.println("Termina");
	}

}
