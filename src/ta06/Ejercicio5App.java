package ta06;

import java.util.Scanner;

public class Ejercicio5App {

	public static String decimalABinario(int num) {
		int binary[] = new int[40];
		int index = 0;

		while (num > 0) {
			binary[index++] = num % 2;
			num = num / 2;
		}

		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
		return "";
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un numero decimal para convertir a binario");
		int num = scan.nextInt();

		decimalABinario(num);

		scan.close();
	}
}
