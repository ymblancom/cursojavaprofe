package com.curso.java.interfaces.ejercicios.bar;

import com.curso.java.interfaces.ejercicios.bar.exceptions.TooColdTemperatureException;
import com.curso.java.interfaces.ejercicios.bar.exceptions.TooHotTemperatureException;

public class ClienteAsiduo extends ClienteCafetero {
	private String mote;

	public ClienteAsiduo(String nombre, String mote) {
		super(nombre);
		this.mote = mote;
	}

	public String getMote() {
		return mote;
	}

	@Override
	public void tomarCafe(TazaCafe tazaCafe) throws TooHotTemperatureException, TooColdTemperatureException {
		super.tomarCafe(tazaCafe);
		System.out.println(this.mote + " se está tomando su café tranquilamente");
		
	}
}
