package ta06;

import java.util.Scanner;

public class Ejercicio7App {

	public static void conversorMoneda(double cantidad, String moneda) {
		if (moneda.equals("libras")) {
			System.out.println(cantidad * 0.86);
		} else if (moneda.equals("dolares")) {
			System.out.println(cantidad * 1.28611);
		} else if (moneda.equals("yenes")) {
			System.out.println(cantidad * 129.852);
		}
	}

	public static void main(String[] args) {
		double importe;
		String moneda;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un importe en euros");

		importe = scan.nextDouble();
		scan.nextLine();

		System.out.println("A que moneda deseas convertir (escribe una de las siguientes "
				+ "Libras Dolares Yenes");
		moneda = scan.nextLine();
		moneda.toLowerCase();

		if (moneda.equals("libras")) {
			conversorMoneda(importe, "libras");
		} else if (moneda.equals("dolares")) {
			conversorMoneda(importe, "dolares");
		} else if (moneda.equals("yenes")) {
			conversorMoneda(importe, "yenes");
		} else {
			System.out.println("tipo de moneda no valido!");
		}
		
		scan.close();
	}

}
