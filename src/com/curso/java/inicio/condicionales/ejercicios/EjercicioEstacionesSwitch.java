package com.curso.java.inicio.condicionales.ejercicios;

import java.util.Scanner;

//java.lang
public class EjercicioEstacionesSwitch {

	public static void main(String[] args) {
		String mes = "";
		System.out.println("Escribe un mes");
		Scanner scan = new Scanner(System.in);
		mes = scan.nextLine();
		mes = mes.toLowerCase();
		
		System.out.println(mes);
		
		String estacion = " ";
		
		switch(mes) {
			case "Enero": 
			case "Febrero": 
			case "Marzo": estacion = "invierno";break;
			case "Abril": estacion = "primavera";break;
		
		}
		
		switch(mes) {
			case "enero","febrero", "marzo": estacion = "invierno";break;
			case "abril","mayo", "junio": estacion = "primavera";break;
			case "julio","agosto", "septiembre": estacion = "verano";break;
			case "octubre","noviembre", "diciembre": estacion = "otoños";break;
			
		}

		
		if (estacion.equals("")) {
			System.out.println("Mes introducido erroneo");
		}else{
			System.out.println("El mes "+ mes + " está en la estación "+estacion);
			
		}

	}

}
