package com.curso.java.poo.herencia;

public class Serpiente extends Animal {
	private boolean venenosa;
	
	public Serpiente(String id, String nombre, double peso) {
		super(id, nombre, peso);
		// TODO Auto-generated constructor stub
	}

	public Serpiente(String id, String nombre, double peso, boolean venenosa) {
		super(id, nombre, peso);
		this.venenosa = venenosa;
	}

	public boolean isVenenosa() {
		return venenosa;
	}

	public void setVenenosa(boolean venenosa) {
		this.venenosa = venenosa;
	}

	@Override
	public void beber() {
		super.beber();
		System.out.println("La serpiente bebe");
	}
	
	

}
