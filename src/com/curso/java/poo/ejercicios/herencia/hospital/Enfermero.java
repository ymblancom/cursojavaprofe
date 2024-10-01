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

	public void atenderPaciente(Paciente paciente, Doctor doctor, Habitacion[] habitaciones) {
		System.out.println("El enfermero " + getNombre() + " atiende al paciente " + paciente.getNombre());
		if(paciente.getSintomas()==null) {//No tiene sintomas
			//Preguntamos
		}
		Enfermo enfermo = doctor.diagnosticarPaciente(paciente);
		if (enfermo!=null) {//Se le ingresa (asignamos habitación)
			System.out.println("Se ingresa al enfermo "+ 
						enfermo.getNombre()  + " con " + enfermo.getEnfermedad());
			
			boolean habitacionesDisponibles = false;
			for (Habitacion habitacion : habitaciones) {
				if(habitacion.getEnfermo()==null) {//Si la habitación no tiene enfermo asignado
					System.out.println("El enfermo " + enfermo.getNombre() 
							+ " se le ingresa en la habitación " + habitacion.getNumero());
					
					habitacionesDisponibles = true;
					habitacion.setEnfermo(enfermo);
					break;
				}
			}
			
			if (!habitacionesDisponibles) {
				System.out.println("El enfermo "+ enfermo.getNombre() +" se tiene que ir a otro Hospital");
			}
		}else {
			System.out.println("El paciente "+ paciente.getNombre() + " sale del Hospital");
		}
	}
	
	
}
