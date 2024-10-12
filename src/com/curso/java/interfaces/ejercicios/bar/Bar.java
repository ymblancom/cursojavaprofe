package com.curso.java.interfaces.ejercicios.bar;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import com.curso.java.interfaces.ejercicios.bar.exceptions.TooColdTemperatureException;
import com.curso.java.interfaces.ejercicios.bar.exceptions.TooHotTemperatureException;

public class Bar {
	private String nombre;
	
	public Bar(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		Bar bar = new Bar("Casa Lola");
		bar.abrirBar();
	}
	
	public void abrirBar() {
		System.out.println("Abriendo el bar "+ this.nombre);
		
		Huesped huesped = new Huesped("N1", "1111A");
		Comensal comensal = new Comensal("N2",true);
		ClienteAsiduo clienteAsiduo = new ClienteAsiduo("N3", "ErPesao");
		
		ServibleCafe[] cafeteros = {comensal,clienteAsiduo};
		servirCafe(cafeteros);
		
	}
	
	public void servirCafe(ServibleCafe[] clientes) {
		
		for (ServibleCafe cliente : clientes) {
			
			TazaCafe taza = new TazaCafe("Arabigo");
			try {
				cliente.tomarCafe(taza);
			} catch (TooHotTemperatureException | TooColdTemperatureException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	
}
