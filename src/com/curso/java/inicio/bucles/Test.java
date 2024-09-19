package com.curso.java.inicio.bucles;

public class Test {

	public static void main(String[] args) {
//		if (7<3 && (3>1 && "b".equals("b"))) {
//			System.out.println("Entra");
//		}
		
		//System.out.println(("a".equals("b") || (3>1 && "b".equals("b")) ) );
		//if (false )
		
		int numero = 2;
		if (numero<0 & test()) {
			System.out.println("Válido");
		}else {
			System.out.println("No correcto");
		}

	}

	public static boolean test() {
		System.out.println("Entra");
		
		return true;
	}
	
}
