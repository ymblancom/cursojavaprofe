package com.curso.java;

public class PrimeraClase {

	public static void main(String[] args) {
		
		if (args.length==3) {
			String nombre = args[0];
			String apellidos = args[1];
			System.out.println(nombre);
			System.out.println(apellidos);
			System.out.println(args[2]);
		}else {
			System.out.println("Debes mandarme 3 parámetros <nombre apellidos texto>");
			System.exit(1);
		}
		
	}

}

