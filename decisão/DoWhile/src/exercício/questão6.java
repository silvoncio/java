package exerc�cio;
import java.util.Scanner;
public class quest�o6 {
public static void main(String[]args) {
		
		Scanner reader = new Scanner(System.in);
		int number, sumDivisibleBy3 = 0, numberDivisibleBy3=0;
		double average;
		
		System.out.println("Se quiser sair digite 0");
		do {
			System.out.println("Digite um n�mero inteiro:");
			number = reader.nextInt();
			if(number%3==0 && number!=0) {
				sumDivisibleBy3 += number;
				numberDivisibleBy3++;
			}
		} while (number != 0);
		
		average = (float) sumDivisibleBy3/numberDivisibleBy3;
		
		System.out.println("A m�dia dos n�meros divisiveis por 3 �: "+average);
	}
	
}
