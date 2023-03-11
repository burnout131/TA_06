package ta06;

import java.util.Scanner;

public class Ejercicio12App {
	
	public static void generadorNumeros(int cantidad, int digito) {
		int listaNum[] = new int[cantidad];
		String listaNumStr[] = new String[cantidad];
		String digitoString;

		for (int i = 0; i < listaNum.length; i++) {
			listaNum[i] = (int) (Math.random() * (300 - 1 + 1) + 1);
		}
		
		for (int i = 0; i < listaNum.length; i++) {
			System.out.println(listaNum[i]);
		}
		
		for (int i = 0; i < listaNumStr.length; i++) {
			listaNumStr[i] = String.valueOf(listaNum[i]);
		}
		
		digitoString = Integer.toString(digito);
		
		for (String str: listaNumStr) {
			if(str.endsWith(digitoString)) {
				System.out.println("ACABA EN "+digitoString+" --> "+str);
			}
		}
	}

	public static void main(String[] args) {
		int medidaArray;
		int digito;
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce tamaño array: ");
		medidaArray = scan.nextInt();
		
		scan.nextLine();
		System.out.println("Introduce ultimo digito de los numeros a mostrar: ");
		
		if(scan.hasNextInt()) {
			digito = scan.nextInt();
			generadorNumeros(medidaArray, digito);
		}else {
			System.out.println("INTRODUCE UN NUMERO VALIDO!!");
		}
		
		scan.close();
	}

}
