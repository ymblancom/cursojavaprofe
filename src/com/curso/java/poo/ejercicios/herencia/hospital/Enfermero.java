package com.curso.java.poo.ejercicios.herencia.hospital;

public class Enfermero extends EmpleadosHospital {
	private String planta;
	
	public Enfermero(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	public Enfermero(String nombre, int edad, String turno, String planta) {
		super(nombre, edad, turno);
		this.planta = planta;
	}
	public String getPlanta() {
		return planta;
	}

	public void setPlanta(String planta) {
		this.planta = planta;
	}

	
	@Override
	public String toString() {
		return "Enfermero [planta=" + planta + "]";
	}

	@Override
	public void comer() {
		System.out.println("El enfermero " + super.getNombre() + " comiendo de tupper");
	}

	public void atenderPaciente(Paciente paciente) {
		
		if(paciente.getSintomas()==null) {//No tiene sintomas
			//Preguntamos
		}
		
		
		
		
		
	}

	public void atenderPaciente(Paciente paciente, Doctor doctor) {
		if(paciente.getSintomas()==null) {//No tiene sintomas
			//Preguntamos
		}
		
		doctor.diagnosticarPaciente(paciente);
	}
	
	
}
