package grupo.iv.fundamentos.principal;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int edad;
		int aniosExperiencia;
		System.out.println("El programa reclutador ...."); 
		
		System.out.println("Ingrese la edad");
		edad = teclado.nextInt();
		
		System.out.println("Ingrese los años de experiencia");
		aniosExperiencia = teclado.nextInt();
		
		
		if(edad >= 31 && edad <= 40 && aniosExperiencia < 2) {
			System.out.println("Listo pa' reclutar");
		} else {
			System.out.println("No nos llame, .....");
		}
	}

}
