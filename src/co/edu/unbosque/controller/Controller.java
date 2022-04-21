package co.edu.unbosque.controller;

import java.util.Scanner;

import co.edu.unbosque.model.model;

public class Controller {

	model model = new model();
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
			System.out.println("crear");
			model.crear(N);
			System.out.println("verificar");
			model.verificar();;

		}
	}

}
