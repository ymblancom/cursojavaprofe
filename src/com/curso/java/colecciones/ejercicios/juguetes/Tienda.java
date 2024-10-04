package com.curso.java.colecciones.ejercicios.juguetes;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.curso.java.utils.Utilidades;

public class Tienda {
	private String nombre;
	
	public Tienda(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		Tienda tienda = new Tienda("Tienda1");
		tienda.abrirTienda();
	}
	
	public void abrirTienda() {
		System.out.println("Abriendo la tienda "+ this.nombre);
		List<Juguete> listaJuguetes = crearJuguetes();
		pintaJuguetes(listaJuguetes);
		precioJuguetes(listaJuguetes);
		
		for (Juguete juguete : listaJuguetes) {
			if(juguete instanceof Tren) {
				Tren t = ((Tren)juguete);
				System.out.println(t.getModelo());
			}
		}
		
		
		String color = Utilidades.pideDatoString("Introduce un color");
		for (Juguete juguete : listaJuguetes) {
			if (juguete instanceof Doll) {
				Doll d = (Doll)juguete;
				if (d.getColor().equals(color)) {
					listaJuguetes.remove(d);
					System.out.println("Borrando "+ juguete.getNombre());
				}
			}
		}
		pintaJuguetes(listaJuguetes);
	}
	
	public void precioJuguetes(List<Juguete> juguetes) {
		double precioTotal=0;
		for (Juguete juguete : juguetes) {
			precioTotal += juguete.getPrecio();
		}
		System.out.println("Precio total "+precioTotal);
	}
	
	public void pintaJuguetes(List<Juguete> juguetes) {
		for (Juguete juguete : juguetes) {
			System.out.println(juguete);
		}
	}
	
	
	public List<Juguete> crearJuguetes() {
		Tren tren1 = new Tren("Tren1","m",50,"modelo1");
		Tren tren2 = new Tren("Tren2","w",50,"modelo2");
		Doll doll1 = new Doll("D1","BArbie",50,"rojo");
		Doll doll2 = new Doll("D2","BArbie",50,"azul");
		Doll doll3 = new Doll("D3","Nenuco",50,"rojo");
		
		List<Juguete> juguetes = new CopyOnWriteArrayList();
		juguetes.add(tren2);
		juguetes.add(tren1);
		juguetes.add(doll1);
		juguetes.add(doll2);
		juguetes.add(doll3);
		
		return juguetes;
		
	}
	

}

