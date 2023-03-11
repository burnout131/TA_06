package ta06;

import java.util.Scanner;

public class Ejercicio4App {

	public static void calculaFactorial(int num) {
		int factorial = 1;

		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}

		System.out.println("El factorial de " + num + " es " + factorial);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un numero para calcular factorial");
		int numero = scan.nextInt();

		calculaFactorial(numero);
		scan.close();
	}

}
