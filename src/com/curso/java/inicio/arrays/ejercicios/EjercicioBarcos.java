package com.curso.java.inicio.arrays.ejercicios;

import java.util.Scanner;

public class EjercicioBarcos {

	public static void main(String[] args) {
		final int ACORAZADO = 1;
		final int DESTRUCTOR = 2;
		final int SUBMARINO = 3;

		// Defino la matriz
		int[][] tablero = new int[5][5];

//Defino donde están los barcos dentro del tablero
		tablero[3][2] = ACORAZADO;
		tablero[4][2] = ACORAZADO;
		tablero[0][3] = DESTRUCTOR;
		tablero[1][1] = DESTRUCTOR;
		tablero[2][2] = SUBMARINO;

		Scanner scan = new Scanner(System.in);
		String[] letrasTablero = { "A", "B", "C", "D", "E" };
		int[] numerosTablero = { 1, 2, 3, 4, 5 };

		int contador = 0;
		int aciertos = 0;
		System.out.println("Bienvenido al juego del hundir la flota");
		do {

			for (String letra : letrasTablero) {
				System.out.print("  " + letra);
			}
			System.out.println();
			for (int numero : numerosTablero) {
				System.out.print(numero);
				// Recorro esa fila del tablero para ver si ha acertado alguno
				for (int i = 0; i < tablero[numero - 1].length; i++) {
					if (tablero[numero - 1][i] == -1) {
						System.out.print(" X ");
					} else if (tablero[numero - 1][i] == -2) {
						System.out.print(" O ");
					} else {
						System.out.print("   ");
					}
				}
				System.out.println();
			}

			System.out.println("\nSelecciona una posición del tablero. Ejemplo A1");
			String posicion = scan.nextLine();

			int columna = 0;
			switch (posicion.charAt(0)) {
			case 'A':
				columna = 0;
				break;
			case 'B':
				columna = 1;
				break;
			case 'C':
				columna = 2;
				break;
			case 'D':
				columna = 3;
				break;
			case 'E':
				columna = 4;
				break;
			}

			int fila = Integer.parseInt("" + posicion.charAt(1)) - 1;

			int valorPosicion = tablero[fila][columna];
			if (valorPosicion == -1 || valorPosicion == -2) {
				System.out.println("Ya has seleccionado este punto");
				contador++;
			} else if (valorPosicion == ACORAZADO || valorPosicion == DESTRUCTOR || valorPosicion == SUBMARINO) {
				String navio = "";
				switch (valorPosicion) {
				case ACORAZADO:
					navio = "Acorazado";
					break;
				case DESTRUCTOR:
					navio = "Destructor";
					break;
				case SUBMARINO:
					navio = "Submarino";
					break;
				}

				System.out.println("Enhorabuena has tocado un " + navio);
				aciertos++;
				tablero[fila][columna] = -1;
			} else {// El usuario no acierta con un barco
				contador++;
				System.out.println("Agua");
				tablero[fila][columna] = -2;
			}

			if (aciertos == 5) {
				System.out.println("Enhorabuena has hundido la flota enemiga");
				break;
			} else {
				System.out.println("Te quedan" + (10 - contador) + " intentos");
			}

//			for (int[] filaT : tablero) {
//				for (int j : filaT) {
//					System.out.print(j);
//				}
//				System.out.println();
//			}
		} while (contador < 10);

	}

}
