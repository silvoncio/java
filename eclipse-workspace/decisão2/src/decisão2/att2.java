package decis�o2;

import java.util.Scanner;

public class att2 {
public static void main(String[] args) {
		
		//2 - Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("\ndefina o primeiro n�mero: ");
		numero1 = leia.nextInt();
		System.out.println("\ndefina o segundo n�mero: ");
		numero2 = leia.nextInt();
		System.out.println("\ndefina o terceiro n�mero: ");
		numero3 = leia.nextInt();
		
		if (numero1 <= numero2 && numero1 <= numero3) {
			if (numero2 <= numero3) {
				System.out.println("\nordem dos n�meros: " + numero1 + ", " + numero2 + ", " + numero3);
			}
			else {
				System.out.println("\nordem dos n�meros: " + numero1 + ", " + numero3 + ", " + numero2);
			}
		}
		else if (numero2 <= numero1 && numero2 <= numero3) {
			if (numero1 <= numero3) {
				System.out.println("\nordem dos n�meros: " + numero2 + ", " + numero1 + ", " + numero3);
			}
			else {
				System.out.println("\nordem dos n�meros: " + numero2 + ", " + numero3 + ", " + numero1);
			}
		}
		else {
			if (numero1 <= numero2) {
				System.out.println("\nordem dos n�meros: " + numero3 + ", " + numero1 + ", " + numero2);
			}
			else {
				System.out.println("\nordem dos n�meros: " + numero3 + ", " + numero2 + ", " + numero1);
			}
		}
	}


}
