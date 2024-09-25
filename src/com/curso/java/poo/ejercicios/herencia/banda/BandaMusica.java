package com.curso.java.poo.ejercicios.herencia.banda;

public class BandaMusica {

	public static void main(String[] args) {
		BandaMusica banda = new BandaMusica();
		banda.empezarConcierto();
	}

	private void empezarConcierto() {
		Instrumento[] instrumentos = crearInstrumentos();
		afinarInstrumentos(instrumentos);
	}
	
	private Instrumento[] crearInstrumentos() {
		System.out.println("Creando instrumentos");
		Guitarra guitarra = new Guitarra("Guitarra1","Tipo");
		Guitarra guitarraElectrica = new GuitarraElectrica("Guitarra1","Tipo",false,150);
		Piano piano = new Piano("Paino1", "Cuerda", false, 7, "De cola");
		Tambor tambor = new Tambor("TAmbor1","",false,"Ojalata");
		
		Instrumento[] instrumentos = {guitarra, guitarraElectrica, piano, tambor};
		System.out.println("Creados  "+ instrumentos.length + " instrumentos");
		return instrumentos;
	}
	
	private void afinarInstrumentos(Instrumento[] instrumentos) {
		System.out.println("Afinando instrumentos");
		for (Instrumento instrumento : instrumentos) {
			instrumento.limpiar();
			instrumento.afinar();
		}
		System.out.println("Instrumentos Afinados");
	}
	
}

