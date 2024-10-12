package com.curso.java.poo.herencia;

import com.curso.java.interfaces.Vendible;

public class Vaca extends Animal implements Vendible{
	private String tipo;

	public Vaca(String id, String nombre, double peso, String tipo) {
		super(id, nombre, peso);
		this.tipo = tipo;
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void mugir() {
		System.out.println("La vaca "+ getNombre() +" está mugiendo");
	}

	@Override
	public void comer() {
		System.out.println("La vaca "+ getNombre() + " está pastando");
	}
	
	@Override
	public String toString() {
		return "Vaca [tipo=" + tipo + ", id=" + getId() + ", nombre=" + getNombre() + "]";
	}

	@Override
	public void vender() {
		System.out.println("Vendiendo a la vaca "+ getNombre());
		
	}

	@Override
	public void comprobarEstado() {
		// TODO Auto-generated method stub
		
	}
	
	
}
