package ta06;

import java.util.Scanner;

public class Ejercicio8App {
	public static int listaNum[] = new int[10];
	public static Scanner scan = new Scanner(System.in);

	public static void muestraValores() {
		for (int i = 0; i < listaNum.length; i++) {
			System.out.println("Indice: " + i + " Valor: " + listaNum[i]);
		}
	}

	public static void agregaValores() {
		for (int i = 0; i < listaNum.length; i++) {
			System.out.println("Introduce el valor a añadir al indice " + i);
			listaNum[i] = scan.nextInt();
		}
	}

	public static void main(String[] args) {
		agregaValores();
		muestraValores();

		scan.close();
	}

}
