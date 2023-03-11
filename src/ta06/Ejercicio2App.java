package ta06;

import java.util.Scanner;

public class Ejercicio2App {

	public static void generadorNumeros(int cantidad, int min, int max) {
		int listaNum[] = new int[cantidad];
		
		for (int i = 0; i < listaNum.length; i++) {
			listaNum[i] = (int) (Math.random() * (max - min + 1) + min);
		}
		
		for (int i = 0; i < listaNum.length; i++) {
			System.out.println(listaNum[i]);
		}
	}

	public static void main(String[] args) {
		int cantidadNumeros, valorMin, valorMax;
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce la cantidad de números a generar");
		cantidadNumeros = scan.nextInt();

		System.out.println("Introduce el valor mínimo");
		valorMin = scan.nextInt();

		System.out.println("Introduce el valor máximo");
		valorMax = scan.nextInt();
		
		generadorNumeros(cantidadNumeros, valorMin, valorMax);

		scan.close();
	}

}
