package grupo.fundamentos.lanzador;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		int i;
		System.out.println("Ingrese el numero");
		n = teclado.nextInt();

		i = 0;

		while (i <= n) {

			if(i < (n/2)) {
				if( i%2 == 0) {
					System.out.println("Impresion de pares " + i);
				}
			} else {
				if(i%2 != 0) {
					System.out.println("Impresion de impares " + i);
				}
			}
			
			i = i + 1;
		}
	}

}
