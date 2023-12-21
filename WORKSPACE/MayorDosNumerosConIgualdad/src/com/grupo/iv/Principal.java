package com.grupo.iv;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int n1, n2;

		System.out.println("Por favor ingrese 2 numeros");

		System.out.println("Ingresa el primer dato");
		n1 = teclado.nextInt();

		System.out.println("Ingrese el segundo dato");
		n2 = teclado.nextInt();

		if (n1 > n2) {
			System.out.println(n1 + " es el mayor");
		} else {

			if (n1 == n2) {
				System.out.println("Son iguales");
			} else {
				System.out.println(n2 + " es mayor");
			}

		}

		System.out.println("Termino");

	}
}
