package com.curso.java.poo.herencia;

public class Zoologico {

	public static void main(String[] args) {
		
		Vaca vaca1 = new Vaca("1","Lola",300,"Bradford");
		
		vaca1.comer();
		vaca1.beber();
		vaca1.mugir();
		
		Animal vaca2 = new Vaca("2","Lola2",350,"Bradford");
		Animal serpiente1 = new Serpiente("2","Kaah",20,true);
		System.out.println("====================");
		serpiente1.beber();
		System.out.println("====================");
		vaca2.comer();
		//Hacer cast o casting
		Vaca v = (Vaca)vaca2;
		v.mugir();
		//((Vaca)vaca2).mugir();
		v.setTipo("Angus");
		System.out.println(v);
		System.out.println(vaca2);
		
//		Animal animal1 = new Animal("3","A3",350);
//		animal1.comer();
	}

}


