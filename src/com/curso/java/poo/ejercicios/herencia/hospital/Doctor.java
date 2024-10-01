package com.curso.java.poo.ejercicios.herencia.hospital;

public class Doctor extends EmpleadosHospital {
	private String especialidad;

	public Doctor(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	public Doctor(String nombre, int edad, String especialidad) {
		super(nombre, edad);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public void comer() {
		System.out.println("El doctor " + super.getNombre() + " comiendo en el comedor");

	}
	
	
	public Enfermo diagnosticarPaciente(Paciente paciente) {
		System.out.println("El doctor "+ getNombre() +" está tratando al paciente "+ paciente.getNombre());
		Enfermo enfermo = null;
		if (Math.random()>0.1) {
			String enfermedad = "COVID";
			System.out.println("El paciente está muy malito tiene "+enfermedad + " deberá ser ingresado");
			//enfermo = new Enfermo(paciente.getNombre(), paciente.getEdad(), "COVID");
			enfermo = new Enfermo(paciente, enfermedad);
		}else {
			System.out.println("El paciente no está grave");
		}
		
		
		return enfermo;
	}
	
	

}
