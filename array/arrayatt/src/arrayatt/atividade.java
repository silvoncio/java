package arrayatt;
import java.util.Scanner;
/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
public class atividade {
	public static void main(String[]args) {
		float [][] M = new float[3][3];
		int greaterThan10 = 0;
		Scanner reader = new Scanner(System.in);
		
		
		for(int i =0; i<3;i++) {
			for(int j =0; j<3;j++) {
				System.out.println("Digite um valor: ");
				M[i][j] = reader.nextFloat();
				if(M[i][j]>10) {
					greaterThan10++;
				}
			}
		}
		System.out.println("A matriz possui "+greaterThan10+" valores maior que 10");
	}
}
