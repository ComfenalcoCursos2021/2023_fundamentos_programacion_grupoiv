package com.grupo.iv.fundamentos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		DecimalFormat formatea = new DecimalFormat("###,###.##");
		int n;
		int suma;

		System.out.println("Este programa suma los n primeros numeros");
		System.out.println("Ingrese los el numero");

		n = teclado.nextInt();
		suma = 0;

		for (int i = 1; i <= n; i = i + 1) {
			suma = suma + i;
		}

		System.out.println("La suma total es " + formatea.format(suma));
	}

}
