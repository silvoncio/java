package la�osdecis�o;

import java.util.Scanner;

public class exercicio2 {

		public static void main(String[]args) {
			int n, pairs=0, odd=0;
			Scanner reader = new Scanner (System.in);
			
			for(int i = 1; i<=10; i++) {
				System.out.println("Digite um n�mero inteiro: ");
				n = reader.nextInt();
				if(n%2==0) {
					pairs++;
				}
				else {
					odd++;
				}
			}
			System.out.println("Pares: "+pairs);
			System.out.println("Impares: "+odd);
		
	}

}
