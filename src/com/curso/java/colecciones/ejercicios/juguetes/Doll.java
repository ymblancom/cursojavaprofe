package com.curso.java.colecciones.ejercicios.juguetes;

public class Doll extends Juguete {
	private String color;

	public Doll(String nombre, String marca, double precio) {
		super(nombre, marca, precio);
		// TODO Auto-generated constructor stub
	}
	

	public Doll(String nombre, String marca, double precio, String color) {
		super(nombre, marca, precio);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Doll [color=" + color + ", toString()=" + super.toString() + "]";
	}

	
}
