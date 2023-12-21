package fundamentos.matematicos.escalas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double num;
		int cantidadEscala;
		DecimalFormat df = new DecimalFormat("#");

		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese el numero de la escala");
		num = teclado.nextInt();
		
		System.out.println("Ingrese la cantidad de escalas");
		cantidadEscala = teclado.nextInt();

		for (int i = 2; i <= cantidadEscala; i = i + 1) {
			System.out.println(df.format(num) + "x" + i);
			num = num * i;
		}
		
		for (int i = 2; i <= cantidadEscala; i = i + 1) {
			System.out.println(df.format(num) + "/" + i);
			num = num / i;
		}
		System.out.println(num);
	}
}
