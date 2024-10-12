package com.curso.java.poo.ejercicios.herencia.hospital;

public abstract class EmpleadosHospital extends Persona {
	private String turno;
	
	public EmpleadosHospital(String nombre, int edad) {
		super(nombre, edad);
	}

	public EmpleadosHospital(String nombre, int edad, String turno) {
		super(nombre, edad);
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public void fichar() {
		System.out.println("El empleado "+getNombre()+ " está fichando ");
	}

}
