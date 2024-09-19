package com.curso.java.poo.ejercicios.maniqui;

public class Maniqui {
	private int id;
	private Vestido vestido;
	private Pantalon pantalon;
	private Camisa camisa;
	
	
	public Maniqui(int id) {
		this.id = id;
	}
	
	public Maniqui(int id, Vestido vestido) {
		this.id = id;
		this.vestido = vestido;
	}
	
	public Maniqui(int id, Camisa camisa, Pantalon pantalon) {
		this.id = id;
		this.camisa = camisa;
		this.pantalon = pantalon;
	}
		
//	public Maniqui(int id, Vestido vestido, Pantalon pantalon, Camisa camisa) {
//		super();
//		this.id = id;
//		this.vestido = vestido;
//		this.pantalon = pantalon;
//		this.camisa = camisa;
//	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Vestido getVestido() {
		return vestido;
	}
	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}
	public Pantalon getPantalon() {
		return pantalon;
	}
	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}
	public Camisa getCamisa() {
		return camisa;
	}
	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}
	
	public boolean estaDesnudo() {
		boolean desnudo = false;
		
		if (this.vestido==null && this.camisa==null && this.pantalon==null) {
			desnudo = true;
		}
		
		return desnudo;
	}
	
	public void desvestir () {
		this.vestido=null;
		this.camisa=null;
		this.pantalon=null;
	}
	
	
	//Sobrecarga de métodos
	public void vestir (Vestido vestido) {
		this.vestido = vestido;
	}
	public void vestir (Camisa camisa, Pantalon pantalon) {
		setCamisa(camisa);
		setPantalon(pantalon);
	}
}








