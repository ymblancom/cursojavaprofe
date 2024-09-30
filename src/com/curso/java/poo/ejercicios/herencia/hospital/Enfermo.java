package com.curso.java.poo.ejercicios.herencia.hospital;

public class Enfermo extends Persona {
	private String enfermedad;
	
	public Enfermo(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	public Enfermo(String nombre, int edad, String enfermedad) {
		super(nombre, edad);
		this.enfermedad = enfermedad;
	}
	
	public Enfermo(Paciente paciente, String enfermedad) {
		super(paciente.getNombre(), paciente.getEdad());
		this.enfermedad = enfermedad;
	}
	
	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}
	
	

	@Override
	public String toString() {
		return "Enfermo [enfermedad=" + enfermedad + ", Datos " + super.toString() + "]";
	}

	@Override
	public void comer() {
		System.out.println("El paciente " + super.getNombre() + " comiendo en la habitación");
	}

}
