package ta06;

import java.util.Scanner;

public class Ejercicio1App {

	static double areaCirculo(double radio) {
		double resultado = (Math.pow(radio, 2) * Math.PI);
		return resultado;
	}

	static double areaTriangulo(double base, double altura) {
		return ((base * altura) / 2);
	}

	static double areaCuadrado(double lado1, double lado2) {
		return lado1 * lado2;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Elige el tipo de figura para calcular el area: \n" + "1-CIRCULO 2-TRIANGULO 3- CUADRADO \n"
				+ "Teclea el numero correspondiente y pulsa enter");
		int opcion = scan.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("Introduce el radio del circulo");
			double radio = scan.nextDouble();
			System.out.println("Resultado: " + areaCirculo(radio));
			break;
		case 2:
			System.out.println("Introduce la base");
			double base = scan.nextDouble();
			System.out.println("Introduce la altura");
			double altura = scan.nextDouble();
			System.out.println("Resultado: " + areaTriangulo(base, altura));
			break;
		case 3:
			System.out.println("Introduce el lado 1");
			double lado1 = scan.nextDouble();
			System.out.println("Introduce el lado 2");
			double lado2 = scan.nextDouble();
			System.out.println("Resultado: " + areaCuadrado(lado1, lado2));
			break;
		default:
			System.out.println("Opcion no válida");
			break;
		}
		scan.close();
	}

}
