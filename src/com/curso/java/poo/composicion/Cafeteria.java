package com.curso.java.poo.composicion;

public class Cafeteria {
	private String nombre;
	private int capacidadMaxima;
	
	public Cafeteria(String nombre, int capacidadMaxima) {
		super();
		this.nombre = nombre;
		this.capacidadMaxima = capacidadMaxima;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
	
	
}
