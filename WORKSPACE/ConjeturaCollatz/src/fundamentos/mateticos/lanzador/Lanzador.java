package fundamentos.mateticos.lanzador;

import java.util.Scanner;

public class Lanzador {

	public static void main(String[] args) {

		int n;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese el numero para probar la conjetura");
		n = teclado.nextInt();

		while (n <= 1) {
			System.out.println("Recuerde que debe ser un dato positivo mayor a 1");
			n = teclado.nextInt();
		}

		System.out.println("->" + n);
		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = (n*3) + 1;
			}
			System.out.println("->"+n);
		}
	}

}
