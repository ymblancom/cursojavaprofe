package com.curso.java.interfaces;

import com.curso.java.poo.ejercicios.herencia.banda.Guitarra;
import com.curso.java.poo.ejercicios.herencia.banda.Instrumento;
import com.curso.java.poo.herencia.Vaca;

public class PruebaInterfaces {

	public static void main(String[] args) {
		Saxofon saxo = new Saxofon("Saxo1", "");
		Instrumento guitarra = new Guitarra("Guitarra1", "");
		Vaca vaca1 = new Vaca("Lola", "", 0, "");
		
		Vendible vendible1 = new Saxofon("Saxo2", "");
		//Vendible vendible2 = new Guitarra("Guitarra1", "");
		Saxofon saxo2 = (Saxofon)vendible1;
		PruebaInterfaces pi = new PruebaInterfaces();
		pi.limpiar(saxo);
		pi.limpiar(guitarra);
		
		pi.vender(vaca1);
	}
	
	public void limpiar (Instrumento instrumento) {
		instrumento.limpiar();
	}
	
	
	public void vender (Vendible vendible) {
		vendible.vender();
	}
	
}
