package com.curso.java.poo.ejercicios.herencia.banda;

public class Tambor extends Instrumento {
	private String material;

	public Tambor(String nombre, String tipo, boolean afinado, String material) {
		super(nombre, tipo, afinado);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public void limpiar() {
		System.out.println("El tambor se está limpiando con grasa de caballo");

	}

	public void aporrear() {
		System.out.println("Aporreando el tambor");
	}

	@Override
	public void afinar() {
		super.setAfinado(true);
		System.out.println("Tambor afinado correctamente");
	}
	
	
	
	
}
