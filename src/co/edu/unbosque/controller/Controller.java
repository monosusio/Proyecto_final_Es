package co.edu.unbosque.controller;

import java.util.Scanner;

public class Controller {

	Scanner sc = new Scanner(System.in);

	public Controller() {

		inicializar();

	}

	public void inicializar() {

		System.out.println("Digite la cantidad de pruebas que desea");

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			System.out.println("Digite el tamaño de la matriz");

			int N = sc.nextInt();
			char matriz[][] = new char[N][N];

			for (int j = 0; j < N; j++) {

				System.out.println("Ingrese valor de la fila con espacios " + (j + 1));

				String val1 = sc.next();
				sc.nextLine();
				char[] matrix = val1.toCharArray();

					System.out.println(matrix);
					
				for (int p = 0; p < N; p++) {
					for (int x = 0; x < N; x++) {
						for (int y = 0; y < N; y++) {
							matriz[x][y] = matrix[p];


						}
					}
				}
					
					for (int x = 0; x < matriz.length; x++) {
						for (int y = 0; y < matriz[0].length; y++) {
							System.out.print("["+x+"]"+","+"["+y+"]= "+matriz[x][y]+" \n");

			}
			

		}

	}
}
	}
}
