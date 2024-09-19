package com.curso.java.poo.ejercicios.maniqui;

public class Escaparate {

	public static void main(String[] args) {
		Boton boton1 = new Boton("redondo", "negro1","mediano");
		Boton boton2 = new Boton("redondo", "negro2","mediano");
		Boton boton3 = new Boton("redondo", "negro3","mediano");
		
		Boton[] botones = {boton2,boton3};
		
		Pantalon pantalon1 = new Pantalon("vaquero","L",30, boton1);
		Camisa camisa1 = new Camisa("Blanco","L",25, botones);
		
		System.out.println(pantalon1.getBoton().getColor());
		
		Vestido vestido1 = new Vestido("Verde","L",40);
		
		
		Maniqui maniqui1 = new Maniqui(1);
		Maniqui maniqui2 = new Maniqui(2, vestido1);
		Maniqui maniqui3 = new Maniqui(3, camisa1, pantalon1);
		//Maniqui maniqui4 = new Maniqui(4, vestido1,  pantalon1, camisa1);
		
		
		Maniqui[] maniquies = {maniqui1,maniqui2,maniqui3};
		
		
//		System.out.println(maniquies[1].getVestido());
//		System.out.println(maniquies[1].getVestido().getColor());
		
		
		
		maniqui3.desvestir();
		Vestido vestido2 = new Vestido("Azul","L",50);
		maniqui3.vestir(vestido2);
		maniqui1.vestir(camisa1, pantalon1);
		mostrarEscaparate(maniquies);
	}

	public static void mostrarEscaparate(Maniqui[] maniquies) {
		
		for (Maniqui maniqui : maniquies) {
			System.out.println("\nManiqui con id " + maniqui.getId());
			if (!maniqui.estaDesnudo()) {
				if (maniqui.getVestido()!=null) {//Si tiene vestido
					System.out.println("Datos del Vestido:");
					System.out.println("\tColor: "+maniqui.getVestido().getColor());
					System.out.println("\tPrecio: "+maniqui.getVestido().getPrecio());
					System.out.println("\tTalla: "+maniqui.getVestido().getTalla());
				}
				
				if (maniqui.getCamisa()!=null) {//Si tiene camisa
					System.out.println("Datos de la camisa:");
					System.out.println("\tColor: "+maniqui.getCamisa().getColor());
					System.out.println("\tPrecio: "+maniqui.getCamisa().getPrecio());
					System.out.println("\tTalla: "+maniqui.getCamisa().getTalla());
				}
				
				if (maniqui.getPantalon()!=null) {//Si tiene Pantalon
					System.out.println("Datos del pantalón:");
					System.out.println("\tColor: "+maniqui.getPantalon().getColor());
					System.out.println("\tPrecio: "+maniqui.getPantalon().getPrecio());
					System.out.println("\tTalla: "+maniqui.getPantalon().getTalla());
				}
			}else {
				System.out.println("El maniquí está desnudo");
			}
		}
		
	}
	
	
}
