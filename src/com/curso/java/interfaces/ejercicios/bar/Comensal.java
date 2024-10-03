package com.curso.java.interfaces.ejercicios.bar;

import com.curso.java.interfaces.ejercicios.bar.exceptions.TooColdTemperatureException;
import com.curso.java.interfaces.ejercicios.bar.exceptions.TooHotTemperatureException;

public class Comensal extends ClienteCafetero {
    private boolean tieneReserva;

    public Comensal(String nombre, boolean tieneReserva) {
        super(nombre);
        this.tieneReserva = tieneReserva;
    }

    public boolean isTieneReserva() {
        return tieneReserva;
    }

	@Override
	public void tomarCafe(TazaCafe tazaCafe) throws TooHotTemperatureException, TooColdTemperatureException {
		super.tomarCafe(tazaCafe);
		System.out.println("El comensal "+getNombre() + " se está tomando su café tranquilamente");
		
	}

    
    
}
