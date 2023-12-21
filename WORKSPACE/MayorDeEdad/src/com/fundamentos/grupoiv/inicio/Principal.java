package com.fundamentos.grupoiv.inicio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa va a averiguar si una persona es mayor de edad");		
		System.out.println("Ingrese la edad");		
		int edad;		
		edad = teclado.nextInt();		
		if(edad >= 18) {
			///SI
			System.out.println("Es mayor de edad");			
		} else {
			///NO
			System.out.println("Es menor de edad");
		}

	}

}
