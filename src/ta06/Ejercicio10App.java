package ta06;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10App {

	public static boolean esPrimo(int num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i <= num / 2; i++) {
			if ((num % i) == 0) {
				return false;
			}
		}
		return true;
	}

	public static void generadorNumeros(int cantidad) {
		int listaNum[] = new int[cantidad];
		int numAleatorio;
		boolean numPrimo;

		for (int i = 0; i < listaNum.length; i++) {
			numAleatorio = (int) (Math.random() * (100 - 1 + 1) + 1);
			numPrimo = esPrimo(numAleatorio);
			if (numPrimo) {
				listaNum[i] = numAleatorio;
			}
		}

		for (int i = 0; i < listaNum.length; i++) {
			System.out.println(listaNum[i]);
		}

		Arrays.sort(listaNum);
		System.out.println("El numero mas alto es: " + listaNum[listaNum.length - 1]);
	}

	public static void main(String[] args) {
		int medidaArray;
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce tamaño array: ");
		medidaArray = scan.nextInt();
		generadorNumeros(medidaArray);

		scan.close();
	}

}
