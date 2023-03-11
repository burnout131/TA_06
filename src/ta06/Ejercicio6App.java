package ta06;

import java.util.Scanner;

public class Ejercicio6App {
	public static int cuentaCifras(String cadena) {
		return cadena.length();
	}

	public static void main(String[] args) {
		String numeroEnString;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce numero");
		
		numeroEnString = scan.nextLine();
		
		//Creo este if para asegurar que el numero introducido sea positivo y entero
		if(numeroEnString.startsWith("-") || numeroEnString.contains(",")) {
			System.out.println("Debes introducir un numero entero positivo!");
		}else {
			System.out.println("Recuento digitos: "+cuentaCifras(numeroEnString));
		}
		
		scan.close();
	}

}
