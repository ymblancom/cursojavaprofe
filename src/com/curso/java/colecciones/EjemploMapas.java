package com.curso.java.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.curso.java.colecciones.ejercicios.juguetes.Doll;
import com.curso.java.poo.ejercicios.ejercicio1.Alumno;

public class EjemploMapas {
	public static void main(String[] args) {
		
		//Mapa con String como clave y Alumno como valor
		Map<String, Alumno> mapaAlumnos =  new HashMap();
		
		Alumno a1 = new Alumno("111A","N1","A1");
		mapaAlumnos.put(a1.getDni(), a1);
		Alumno a2 = new Alumno("222B","N2","A2");
		Alumno a3 = new Alumno("333C","N3","A3");
		mapaAlumnos.put(a2.getDni(), a2);
		mapaAlumnos.put(a3.getDni(), a3);
		
		String dni = "333C";
		Alumno a4 = mapaAlumnos.get(dni);
		System.out.println(a4.getDni());
		
		
		Alumno a5 = new Alumno("444D","N4","A4");
		Alumno a6 = mapaAlumnos.put("222B", a5);
		System.out.println(a6.getNombre());
		Alumno a7 = mapaAlumnos.get("222B");
		System.out.println(a7.getNombre());
		
		Set<String> dnis = mapaAlumnos.keySet();
		
		System.out.println("Dnis");
		for (String dniAlumno : dnis) {
			System.out.println(dniAlumno);
		}
		
		Collection<Alumno> alumnos = mapaAlumnos.values();
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getApellidos());
		}
		
		
		
		//Otro ejemplo
		//Mapa con String como clave y Listado de Doll como valor
		Map<String, List<Doll>> muniecasColor = new HashMap();
		Doll doll1 = new Doll("D1","BArbie",50,"rojo");
		Doll doll2 = new Doll("D2","BArbie",60,"azul");
		Doll doll3 = new Doll("D3","Nenuco",80,"rojo");
		Doll doll4 = new Doll("D4","BArbie",100,"blanco");
		
		muniecasColor.put(null, null);
		
		List<Doll> dollsRojo = new ArrayList<Doll>() ;
		dollsRojo.add(doll1);
		dollsRojo.add(doll3);
		List<Doll> dollsAzul = new ArrayList<Doll>() ;
		dollsAzul.add(doll2);
		List<Doll> dollsBlanco = new ArrayList<Doll>() ;
		dollsBlanco.add(doll4);
		
		muniecasColor.put(null, dollsBlanco);
		System.out.println("--: "+muniecasColor.get(null).size());
		
		muniecasColor.put("rojo", dollsRojo);
		muniecasColor.put("azul", dollsAzul);
		muniecasColor.put("blanco", dollsBlanco);
		
		Set<String> colores = muniecasColor.keySet();
		for (String color : colores) {
			//System.out.println(color);
			List<Doll> muniecas =  muniecasColor.get(color);
			double precioTotal = 0;
			for (Doll munieca : muniecas) {
				precioTotal += munieca.getPrecio();
			}
			System.out.println("Para el color "+ color + " el total es " + precioTotal);
		}
		
		
		Set<Entry<String,List<Doll>>> entries =  muniecasColor.entrySet();
		for (Entry<String, List<Doll>> entry : entries) {
			String color = entry.getKey();
			List<Doll> muniecas = entry.getValue();
			double precioTotal = 0;
			for (Doll munieca : muniecas) {
				precioTotal += munieca.getPrecio();
			}
			System.out.println("Para el color "+ color + " el total es " + precioTotal);
			
		}
		
		
		
		
		
		
		
		
	}
}


