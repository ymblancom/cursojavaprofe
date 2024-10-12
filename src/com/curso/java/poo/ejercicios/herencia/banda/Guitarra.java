package com.curso.java.poo.ejercicios.herencia.banda;

public class Guitarra extends Instrumento {
	private int numCuerdas;
	
	public Guitarra(String nombre, String tipo, boolean afinado) {
		super(nombre, tipo, afinado);
		// TODO Auto-generated constructor stub
	}

	public Guitarra(String nombre, String tipo) {
		super(nombre, tipo);
		// TODO Auto-generated constructor stub
	}

	public Guitarra(String nombre, String tipo, boolean afinado, int numCuerdas) {
		super(nombre, tipo, afinado);
		this.numCuerdas = numCuerdas;
	}

	public int getNumCuerdas() {
		return numCuerdas;
	}

	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}

	@Override
	public void limpiar() {
		System.out.println("La guitarra "+ getNombre() +" se está limpiando con un pañito");
	}

	@Override
	public void afinar() {
		System.out.println("Afinando guitarra");
		super.afinar();
		
	}
	
	
	
	

}
