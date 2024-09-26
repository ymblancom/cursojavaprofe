package com.curso.java.poo.ejercicios.herencia.banda;

public class BandaMusica {
	private String nombreBanda;
	
	public BandaMusica(String nombreBanda) {
		super();
		this.nombreBanda = nombreBanda;
	}

	public static void main(String[] args) {
		//System.out.println(this.nombreBanda);
		BandaMusica banda = new BandaMusica("The Beatles");
		banda.nombreBanda="Guns N´ Roses";
		banda.empezarConcierto();
	}

	private void empezarConcierto() {
		System.out.println("Empezando el concierto de "+this.nombreBanda);
		Instrumento[] instrumentos = crearInstrumentos();
		afinarInstrumentos(instrumentos);
		tocarInstrumentos(instrumentos);
		System.out.println("Concierto finalizado");
	}
	
	private Instrumento[] crearInstrumentos() {
		System.out.println("Creando instrumentos");
		Instrumento guitarra = new Guitarra("Guitarra1","Tipo");
		Guitarra guitarraElectrica = new GuitarraElectrica("GuitarraElectrica1","Tipo",false,150);
		Piano piano = new Piano("Paino1", "Cuerda", false, 7, "De cola");
		Instrumento tambor = new Tambor("Tambor1","",false,"Hojalata");
		
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
	
	private void tocarInstrumentos(Instrumento[] instrumentos) {
		System.out.println("Tocando instrumentos");
		boolean instrumentosAfinados = true;
		for (Instrumento instrumento : instrumentos) {
			//System.out.println(instrumento.getClass().getName());
			//if(instrumento.getClass().getName().contains("Tambor")) {
			if (instrumento instanceof Tambor) {
				//Cast
				((Tambor)instrumento).aporrear();
			}else {
				instrumento.tocar();
			}
			
			if (!instrumento.isAfinado()) {
				instrumentosAfinados=false;
			}
		}
		if (instrumentosAfinados) {
			System.out.println("La banda ha tocado muy bien!!!");
		}else {
			System.out.println("La banda ha tocado regular");
		}
		
		System.out.println("Se ha terminado de tocar");
	}
}

