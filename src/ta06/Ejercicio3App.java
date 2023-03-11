package ta06;

import java.util.Scanner;

public class Ejercicio3App {

	public static boolean esPrimo(int num) {
		if(num <= 1) {
			return false;
		}

		for (int i = 2; i <= num / 2; i++) {
			if ((num % i) == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int numero;
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un numero");
		numero = scan.nextInt();
		
		System.out.println(esPrimo(numero));
		
		scan.close();
	}

}
