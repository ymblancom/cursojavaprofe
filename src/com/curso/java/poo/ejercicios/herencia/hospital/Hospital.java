package com.curso.java.poo.ejercicios.herencia.hospital;

public class Hospital {
	private String nombre;
	private Habitacion[] habitaciones;
	private Paciente[] salaDeEspera;
	
	public Hospital(String nombre) {
		super();
		this.nombre = nombre;
		this.habitaciones = new Habitacion[2];
		this.salaDeEspera = new Paciente[3];
		
	}

	public static void main(String[] args) {
		
		Hospital hospital = new Hospital("Nombre Hospital");
		hospital.abrirHospital();
		
	}

	public void abrirHospital() {
		System.out.println("Abriendo el Hospital "+ this.nombre);
		//Creamos los objetos
		EmpleadosHospital[] empleados = crearEmpleadosHospital();
		ficharEmpleados(empleados);
		//ficharEmpleados(crearEmpleadosHospital());
		crearEstancias();
//		try {
//			Enfermero e = (Enfermero)empleados[1];
//		}catch(ClassCastException cce) {
//			System.out.println("Error "+ cce.getMessage());
//		}
		triaje((Enfermero)empleados[0], (Doctor)empleados[1]);
	}
	
	public void triaje (Enfermero enfermero, Doctor doctor) {
		System.out.println("Empieza el triaje de los pacientes");
		for(int i=0 ; i<this.salaDeEspera.length   ; i++  ) {
			Paciente paciente = this.salaDeEspera[i];
			
			this.salaDeEspera[i]=null;//Liberamos el asiento de la sala de espera (el paciente sale de la sala de espera)
			
			enfermero.atenderPaciente(paciente, doctor, this.habitaciones );
			
			
			
		}

		
		
	}
	
	public EmpleadosHospital[] crearEmpleadosHospital() {
		Enfermero enfermero1 = new Enfermero("Enfermero1",26);
		Doctor doctor1 = new Doctor("Doctor1", 56);
		
		EmpleadosHospital[] empleados = {enfermero1, doctor1};
		
		return empleados;
	}
	
	public void crearEstancias () {
		Habitacion habitacion1 = new Habitacion(1);
		Habitacion habitacion2 = new Habitacion(2);
		
		this.habitaciones[0] = habitacion1;
		this.habitaciones[1] = habitacion2;
		
		String [] sintomasPaciente1 = {"dolor de cabeza","fiebre","tos"};
		Paciente paciente1 = new Paciente("N1",34,sintomasPaciente1);
		Paciente paciente2 = new Paciente("N2",54);
		Paciente paciente3 = new Paciente("N3",48, new String[] {"Mareos","Perdida visión"} );
		
		this.salaDeEspera[0]= paciente1;
		this.salaDeEspera[1]= paciente2;
		this.salaDeEspera[2]= paciente3;

	}
	
//	public void mostrarDatosPacientes(){
//		for (Paciente paciente : salaDeEspera) {
//			System.out.println(paciente);
//		}
//	}
//	
//	public void mostrarDatosDoctor(Doctor doctor){
//		System.out.println(doctor);
//	}

	
	public void ficharEmpleados(EmpleadosHospital[] empleados) {
		System.out.println("Los empleados van a fichar");
		for (EmpleadosHospital empleado : empleados) {
			empleado.fichar();
		}
	}
}


