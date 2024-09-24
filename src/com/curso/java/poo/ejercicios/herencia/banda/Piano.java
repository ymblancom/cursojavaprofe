package com.curso.java.poo.ejercicios.herencia.banda;

public class Piano extends Instrumento {
	private int numeroOctavas;
	private String tipoPiano;
	
	public Piano(String nombre, String tipo, boolean afinado, int numeroOctavas, String tipoPiano) {
		super(nombre, tipo, afinado);
		this.numeroOctavas = numeroOctavas;
		this.tipoPiano = tipoPiano;
		// XXX hay que arreglar meter una condición ....
	}

	public int getNumeroOctavas() {
		return numeroOctavas;
	}
	public void setNumeroOctavas(int numeroOctavas) {
		this.numeroOctavas = numeroOctavas;
	}

	public String getTipoPiano() {
		return tipoPiano;
	}
	public void setTipoPiano(String tipoPiano) {
		this.tipoPiano = tipoPiano;
	}

	@Override
	public void limpiar() {
		System.out.println("El piano se está limpiando con un plumero");

	}

}
