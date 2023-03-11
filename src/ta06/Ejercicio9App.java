package ta06;

import java.util.Scanner;

public class Ejercicio9App {

	public static void generadorNumeros(int cantidad, int min, int max) {
		int listaNum[] = new int[cantidad];

		for (int i = 0; i < listaNum.length; i++) {
			listaNum[i] = (int) (Math.random() * (max - min + 1) + min);
		}
		
		contenidoArray(listaNum);
	}

	public static void contenidoArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Indice: " + i + " valor: " + array[i]);
		}
		
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		System.out.println("La suma de los valores del array es: " + suma);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el tamaño del array");
		int arraySize = scan.nextInt();

		generadorNumeros(arraySize, 0, 9);

		scan.close();
	}

}
