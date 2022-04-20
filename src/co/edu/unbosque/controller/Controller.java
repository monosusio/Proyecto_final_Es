package co.edu.unbosque.controller;

import java.util.Scanner;

import co.edu.unbosque.model.model;

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

			model model = new model();
			model.crear(N);

		}
	}

}
