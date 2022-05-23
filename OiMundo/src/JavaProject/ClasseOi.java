/*
 Faça um programa que receba três inteiros e diga qual deles é o maior.
 */
package JavaProject;

import java.util.Scanner;

public class ClasseOi {
	public static void main(String[] args){
		int num1, num2, num3;
		Scanner scan = new Scanner(System.in);
		System.out.println("entre com o primeiro número: ");
		num1 = scan.nextInt();
		System.out.println("entre com o segundo número: ");
		num2 = scan.nextInt();
		System.out.println("defina o terceiro número: ");
		num3 = scan.nextInt();
	
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("\nO maior número é o: " + num1);
		}
		if (num2 > num1 && num2 > num3) {
			System.out.println("\nO maior número é o: " + num2);
		}
	
		if (num3 > num1 && num3 > num2) {
			System.out.println("\nO maior número é o: " + num3);
			
		}
	
		
	}}