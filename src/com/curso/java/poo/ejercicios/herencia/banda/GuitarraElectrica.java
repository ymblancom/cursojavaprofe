package com.curso.java.poo.ejercicios.herencia.banda;

public class GuitarraElectrica extends Guitarra {
	double potencia;

	public GuitarraElectrica(String nombre, String tipo, boolean afinado, double potencia) {
		super(nombre, tipo, afinado);
		this.potencia = potencia;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public void tocar() {
		System.out.println("Tocando la guitarra eléctrica muy alto");
	}
	
	
}
