package fundamentos.matematicos.escalas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int num;
		int cantidadEscala = 11;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese el numero de la escala");
		num = teclado.nextInt();

		for (int i = 2; i <= cantidadEscala; i = i + 1) {
			System.out.println(num + "x" + i);
			num = num * i;
		}
		
		for (int i = 2; i <= cantidadEscala; i = i + 1) {
			System.out.println(num + "/" + i);
			num = num / i;
		}
		System.out.println(num);
	}
}
