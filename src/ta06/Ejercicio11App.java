package ta06;

import java.util.Scanner;

public class Ejercicio11App {
	public static int dimensionArray;
	
	public static void multiplicaValores(int[] arr1, int[] arr2) {
		int[] nuevoArray = new int[dimensionArray];
		
		for (int i = 0; i < nuevoArray.length; i++) {
			nuevoArray[i] = arr1[i] * arr2[i];
			System.out.println(nuevoArray[i]);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arrayUno, arrayDos;
		
		System.out.println("Introduce dimension del array: ");
		dimensionArray = scan.nextInt();
		
		arrayUno = new int[dimensionArray];
		arrayDos = new int[dimensionArray];
		
		for (int i = 0; i < arrayDos.length; i++) {
			arrayUno[i] = (int) (Math.random() * (300 - 1 + 1) + 1);
			System.out.println("ARR 1 "+arrayUno[i]);
			arrayDos[i] = (int) (Math.random() * (300 - 1 + 1) + 1);
			System.out.println("ARR 2 "+arrayDos[i]);
		}
		
		multiplicaValores(arrayUno, arrayDos);
		
		scan.close();
	}

}
