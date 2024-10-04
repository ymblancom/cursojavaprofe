package com.curso.java.colecciones.ejercicios.juguetes;

public class Tren extends Juguete {
	private String modelo;
	
	public Tren(String nombre, String marca, double precio) {
		super(nombre, marca, precio);
		// TODO Auto-generated constructor stub
	}

	public Tren(String nombre, String marca, double precio, String modelo) {
		super(nombre, marca, precio);
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Tren [modelo=" + modelo + ", toString()=" + super.toString() + "]";
	}

	
}
