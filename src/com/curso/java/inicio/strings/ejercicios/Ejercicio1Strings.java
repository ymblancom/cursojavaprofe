package com.curso.java.inicio.strings.ejercicios;

public class Ejercicio1Strings {

	public static void main(String[] args) {
		String textoOriginal = "    En un lugar de la Mancha Quijote, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lantejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda...           ";
		
		//Tamaño del texto sin los espacios en blanco del principio y del final
		String textoSinEspacios = textoOriginal.trim();
		System.out.println(textoSinEspacios.length());

		//Mostrar la segunda frase del quijote
		int posicionPrimerPunto = textoSinEspacios.indexOf(".");
		System.out.println(posicionPrimerPunto);
		String segudaFrase = textoSinEspacios.substring(posicionPrimerPunto+1).trim();
		System.out.println(segudaFrase);
		
		//Aparece la palabra Quijote??
		String respuesta = "";
		if (textoSinEspacios.toLowerCase().contains("quijote")) {
			respuesta = "Si";
		}else {
			respuesta = "No";
		}
		System.out.println("Aparece la palabra Quijote: "+ respuesta);
		
		//Operador ternario
		String respuestaTernario = textoSinEspacios.contains("Quijote")?"Si":"No";
		int respuestaT = textoSinEspacios.contains("Quijote")?1:0;
		System.out.println("Aparece la palabra Quijote: "+ respuestaTernario);
		
		
		//Cuantas comas aparecen en el texto
		int contadorComas = 0;
		for ( int indicePalabra=0 ;  indicePalabra<textoSinEspacios.length() ; indicePalabra++ ) {
			//System.out.println(textoSinEspacios.charAt(indicePalabra) + " " + (textoSinEspacios.charAt(indicePalabra)==','));
			if (textoSinEspacios.charAt(indicePalabra)==',') {
				contadorComas++;
			}
			
		}
		System.out.println("Número de comas: "+contadorComas);
		
		int numComas = textoSinEspacios.split(",").length;
		System.out.println(textoSinEspacios.split(",").length-1 );
		
	}

}
