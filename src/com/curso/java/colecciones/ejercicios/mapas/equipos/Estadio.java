package com.curso.java.colecciones.ejercicios.mapas.equipos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Estadio {
	private String nombre;
	
	public Estadio(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		Estadio estadio = new Estadio("Estadio1");
		estadio.iniciarPartido();

	}
	
	private void iniciarPartido () {
		System.out.println("Iniciando partido en el estadio "+this.nombre);
		Map<Equipo, List<Jugador>> mapaEquipos = new HashMap();
		
		Equipo equipo1 = new Equipo("E1", 4);
		Equipo equipo2 = new Equipo("E2", 32, 15);
		
		Jugador jugador1 = new Jugador("J1",22,"DEF");
		Jugador jugador2 = new Jugador("J2",22,"CEN");
		Jugador jugador3 = new Jugador("J3",22,"DEL");
		Jugador jugador4 = new Jugador("J4",22,"POR");
		Jugador jugador5 = new Jugador("J5",22,"DEF");
		Jugador jugador6 = new Jugador("J6",22,"DEL");
		
		List<Jugador> jugadores1 = new ArrayList<Jugador>();
		jugadores1.add(jugador1);
		jugadores1.add(jugador2);
		jugadores1.add(jugador3);
		
		List<Jugador> jugadores2 = List.of(jugador4,jugador5,jugador6);
		
		
		mapaEquipos.put(equipo1, jugadores1);
		mapaEquipos.put(equipo2, jugadores2);
		
		
		Collection<List<Jugador>> jugadoresCol = mapaEquipos.values();
		for(  List<Jugador> jugadores :  jugadoresCol  ) {
			for (Jugador jugador : jugadores) {
				System.out.println(jugador.getNombre());
			}
		}
		
		//Recorremos todas las claves del mapa

		Set<Equipo> equipos = mapaEquipos.keySet();
		for (Equipo equipo : equipos) {
			System.out.println(equipo);
			//Por cada clave recupero los valores
			List<Jugador> jugadores = mapaEquipos.get(equipo);
			for (Jugador jugador : jugadores) {
				System.out.println("\t"+jugador);
			}
			
		}
		
		//Lo mismo hecho con EntrySet
		Set<Entry<Equipo, List<Jugador>>> entryEquipos =  mapaEquipos.entrySet();
		for( Entry<Equipo, List<Jugador>> entry :  entryEquipos) {
			Equipo equipo = entry.getKey();
			System.out.println(equipo);
			List<Jugador> jugadores = entry.getValue();
			for (Jugador jugador : jugadores) {
				System.out.println("\t"+jugador);
			}
		}
		
		
//		Map<String, Map<Equipo,List<Jugador>>> equiposPais = new HashMap();
//		equiposPais.put("ES",mapaEquipos);
//		equiposPais.get("ES");
//		equiposPais.get("ES").get(equipo1).get(0).getNombre();
		
		
	}

}






