package com.curso.java.inicio.strings.ejercicios;

import java.util.Scanner;

public class Ejercicio2ValidarEmail {

	public static void main(String[] args) {
		String email = "";
		String error = "";
		
		do {
			error = "";
			System.out.println("Escribe un email");
			Scanner scan = new Scanner(System.in);
			email = scan.nextLine();
			email = email.trim();
			//El email no puede contener espacios en blanco 
			if(email.contains(" ")) {
				error =  " no puede tener espacios en blanco ";
			}
			
			
			//asdfs.dfs@as.seasdsaess
			
			//El email solo contiene una @
			if(!email.contains("@") || email.indexOf("@")!=email.lastIndexOf("@")) {
				error += " debe contener una @";
				//error = error +  " debe contener una @";
			}else {//Solo hay una @
				//Despues de la @ debe de haber al menos un punto
				if(email.lastIndexOf(".")<email.indexOf("@")) {
					error += " debe contener un punto despues de la @";
				}else {
					String dominio = email.substring(email.indexOf("@")+1);
					System.out.println(dominio);
					if (dominio.indexOf(".")<2) {
						error += " el espacio entre la @ y el punto debe ser superior a 2";
					}
					String subdominio = dominio.substring(dominio.lastIndexOf(".")+1);
					System.out.println(subdominio);
					if (subdominio.length()>5 || subdominio.length()<2) {
						error += " después del último punto tiene que haber entre 2 y 5 caracteres";
					}
				}
			}
			
			
		
			System.out.println("El email " + email + error);
			
		}while(!error.isBlank());

		System.out.println("Correcto");
	}

}
