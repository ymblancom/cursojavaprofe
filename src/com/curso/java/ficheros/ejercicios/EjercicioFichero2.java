package com.curso.java.ficheros.ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.curso.java.poo.ejercicios.ejercicio1.Alumno;

public class EjercicioFichero2 {
	
	public static void main(String[] args) {
		EjercicioFichero2 ef2 =new EjercicioFichero2();
		List<Alumno> alumnos = ef2.cargarAlumnosDeFichero("fichero_datos.txt");
		
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
		
	}
	
	public List<Alumno> cargarAlumnosDeFichero(String fileName) {
		List<Alumno> alumnos = new ArrayList();
		
		File file = new File(fileName);
		try (BufferedReader reader = new BufferedReader(new FileReader(file))){

            String linea;

             while ( (linea = reader.readLine()) != null){
            	try {
	            	String[] campos = linea.split(";");
	            	if (campos.length>=3) {
		            	String nommbre = campos[0];
		            	String dni = campos[1];
		            	String apellido = campos[2];
		
		            	Alumno alumno = new Alumno(nommbre,dni, apellido);
		            	alumnos.add(alumno);
	            	}else {
	            		System.err.println("Registro erróneo "+linea);
	            	}
            	}catch(Exception e) {
            		System.err.println(e.getMessage());
            	}
            	System.out.println(linea);
            }
            
            System.out.println("Tamaño de la lista"+alumnos.size());
            
        } catch (IOException e) {
        	System.out.println("Error " + e.getMessage());
            //e.printStackTrace();
        }
		
		return alumnos;
	}

}
