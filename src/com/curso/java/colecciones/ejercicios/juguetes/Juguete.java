package com.curso.java.colecciones.ejercicios.juguetes;

public class Juguete {
	private String nombre;
	private String marca;
	private double precio;

	public Juguete(String nombre, String marca, double precio) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Juguete [nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + "]";
	}

}
