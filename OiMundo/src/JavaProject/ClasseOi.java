/*
 Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */
package JavaProject;

import java.util.Scanner;

public class ClasseOi {
	public static void main(String[] args){
		int num1, num2, num3;
		Scanner scan = new Scanner(System.in);
		System.out.println("entre com o primeiro n�mero: ");
		num1 = scan.nextInt();
		System.out.println("entre com o segundo n�mero: ");
		num2 = scan.nextInt();
		System.out.println("defina o terceiro n�mero: ");
		num3 = scan.nextInt();
	
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("\nO maior n�mero � o: " + num1);
		}
		if (num2 > num1 && num2 > num3) {
			System.out.println("\nO maior n�mero � o: " + num2);
		}
	
		if (num3 > num1 && num3 > num2) {
			System.out.println("\nO maior n�mero � o: " + num3);
			
		}
	
		
	}}