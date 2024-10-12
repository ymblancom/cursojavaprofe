package com.curso.java.poo.ejercicios.herencia.hospital;

import java.util.Arrays;

public class Paciente extends Persona {
	private String[] sintomas;
	
	public Paciente(String nombre, int edad) {
		super(nombre, edad);
		
	}

	public Paciente(String nombre, int edad, String[] sintomas) {
		super(nombre, edad);
		this.sintomas = sintomas;
	}

	public String[] getSintomas() {
		return sintomas;
	}

	public void setSintomas(String[] sintomas) {
		this.sintomas = sintomas;
	}

	
	@Override
	public String toString() {
		return "Paciente [sintomas=" + Arrays.toString(sintomas) + ", Paciente: " + super.toString() + "]";
	}

	@Override
	public void comer() {
		System.out.println("El paciente " + super.getNombre() + " comiendo en la cafetería");

	}

}

