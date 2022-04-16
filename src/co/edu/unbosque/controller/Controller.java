package co.edu.unbosque.controller;

import java.util.Scanner;

public class Controller {
	
	Scanner sc = new Scanner(System.in);
	
	public Controller(){
		
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
				
				System.out.println("Ingrese valor de la fila con espacios 1"+i);
				
				String val1 = sc.next();
				sc.nextLine();
				char[] matrix = val1.toCharArray();
				System.out.println(matrix+"\n");
				
				
				for (int x=0; x < matriz.length; x++) {
					  for (int y=0; y < matriz[x].length; y++) {
						  for (int u=0; u <matrix.length ; u++)
					    matriz[x][y] = matrix[u];
					    
					  }
					  
					}
				for (int x=0; x < matriz.length; x++) {
					  for (int y=0; y < matriz[x].length; y++) {
					    System.out.println ("[" + x + "," + y + "] = " + matriz[x][y]);
					  }
					}
				
				
				
			}
			
		}
		
	}

}
