package fundamentos.grupo.iv;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		
		int n1;
		int n2;
		int n3;
		int aux;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el 1 numero");
		n1 = teclado.nextInt();
		System.out.println("Ingrese el 2 numero");
		n2 = teclado.nextInt();
		System.out.println("Ingrese el 3 numero");
		n3 = teclado.nextInt();
		
		if( n2 > n1 ) {
			aux = n1;
			n1 = n2;
			n2 = aux;					
		}
		
		if( n3 > n2 ) {
			aux = n2;
			n2 = n3;
			n3 = aux;
		}
		
		if( n2 > n1 ) {
			aux = n1;
			n1 = n2;
			n2 = aux;
		}
		
		System.out.println("los numeros en orden: " + n1 + " <-> " + n2 + " <-> " + n3);
		

	}

}
