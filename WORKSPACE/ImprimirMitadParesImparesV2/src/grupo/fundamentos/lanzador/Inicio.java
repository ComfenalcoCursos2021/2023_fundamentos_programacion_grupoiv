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

			if( i <(n/2) && i%2==0 ) {
				System.out.println("Pares " + i);
			}
			if(i >(n/2) && i%2 != 0) {
				System.out.println("Impares " + i);
			}
			
			i = i + 1;
		}
	}

}
