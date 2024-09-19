package com.curso.java.inicio.arrays;

public class EjemploMatrices {

	public static void main(String[] args) {
		
		String str = "java";
		String str4 = "java";
        String str2 = new String("java");
        String str3 = str2.toUpperCase();//"JAVA"
             
        //System.out.println(str4==str);
        String str5 = str.trim().toUpperCase();
        System.out.println(str3==str5);
		
		
		int [][] notas = new int [2][3];	

		System.out.println(notas[1][1]);
		
		System.out.println("Filas" + notas.length);
		System.out.println("Columnas fila 0: " + notas[0].length);
		System.out.println("Columnas fila 1: " + notas[1].length);
		
		
		int [][] edades = new int [3][];
		edades[0]= new int[5];
		System.out.println(edades[0][0]);
		int []nums = {2,2};
		edades[1] = nums;
		edades[3]= new int[4];
		
		
	}

}

