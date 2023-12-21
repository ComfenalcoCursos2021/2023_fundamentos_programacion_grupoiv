package com.grupoiv.fundamentos.inicio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int n;
		int filtro;
		int digitos;
		Scanner teclado = new Scanner(System.in);

		filtro = 10;
		digitos = 1;

		System.out.println("Este programa cuenta digitos");
		System.out.println("Ingrese el numero al cual.....");
		n = teclado.nextInt();

		while (n >= filtro) {
			filtro = filtro * 10;
			digitos = digitos + 1;
		}

		System.out.println(" Tiene la cantidad  de digitos = " + digitos);

	}

}
