package co.edu.unbosque.model;

import java.util.Scanner;

public class model  {
	
	int matriz[][];
	int N;
	Scanner sc = new Scanner(System.in);
	
	
	public int [][] crear(int N) {
		
		int matriz[][] = new int[N][N];

		for (int x = 0; x < matriz.length; x++) {
			System.out.println("Ingrese valor de la fila con espacios " + (x + 1));
			String val1 = sc.next();
			String[] matrix = val1.split(" ");
			System.out.println(matrix.toString());
			for (int y = 0; y < matriz.length; y++) {
				
						matriz[x][y] = Integer.parseInt(matrix[y]);
						
						System.out.println("["+matriz[x][y]+"");

			}
		}
		
		return matriz;
		
	}
	

}
