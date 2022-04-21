package co.edu.unbosque.model;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class model {

	boolean on;
	Scanner sc = new Scanner(System.in);
	int matriz[][];

	public int[][] crear(int N) {
		int n = N;
		int matriz[][] = new int[n][n];
		for (int x = 0; x < matriz.length; x++) {
			System.out.println("Ingrese valor de la fila con espacios " + (x + 1));
			String val1 = sc.nextLine();
			// String val1 = JOptionPane.showInputDialog("Ingrese valor de la fila con
			// espacios " + (x + 1));
			String[] matrix = val1.split(" ");
			for (int y = 0; y < matriz.length; y++) {

				matriz[x][y] = Integer.parseInt(matrix[y]);

				// System.out.print("[" + matriz[x][y] + "]");

			}

			System.out.println("");

		}

		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				int val = matriz[y][x];

					if (val == matriz[y+1][x+1]) {

						boolean on = false;

					}

					else {

						boolean on = true;

					}
				
			}
		}

		if (on = false) {
			System.out.println("No");
		}

		else {
			System.out.println("Si");
		}

		return matriz;

	}

	public void verificar() {

	}

}
