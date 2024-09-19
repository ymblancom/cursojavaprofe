package com.curso.java.inicio.bucles;

public class EjemplosBucleFor {

	public static void main(String[] args) {
		
		System.out.println("EMPIEZA");
//		String texto = "hola";
//		for (int i=6 ; i<10  ; i+=3) {
//			texto = texto+i;
//			System.out.println("Introduce nombre del alumno "+texto);
//		}
		
		
//		for (int i=0; i<=10 ; i++) {
//			System.out.println("3x"+i+" = " + (3*i));
//		}
		
		
		
		for ( int i =0 ; i<=4 ; i++  ) {
			
			System.out.println(i);
			if (i%2==0) {
				i+=3;
				continue;
			}
			
			System.out.println("EJECUTA");
		}
		System.out.println("FIN");

	}

}
