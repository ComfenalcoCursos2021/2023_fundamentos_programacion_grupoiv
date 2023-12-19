package grupo.fundamentos;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int a = 5;
		int b;
		int rta;
		
		System.out.println("Programa para sumar dos numeros");
		
		System.out.println("Ingrese el primer numero:");
		a = teclado.nextInt();
		
		System.out.println("Ingrese el segundo numero:");
		b = teclado.nextInt();
		
		rta = a + b;
		System.out.println("El resultado es: " + rta);

		System.out.println("el mensaje de despedída");

	}

}
