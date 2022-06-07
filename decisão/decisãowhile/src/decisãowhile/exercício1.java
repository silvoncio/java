package decisãowhile;
//while
import java.util.Scanner;

public class exercício1 {
	public static void main (String[]args) {
		
		int age=0, MenosQue21=0, MaiorQue50=0;
		Scanner reader = new Scanner (System.in);
		while(age!=99) {
			System.out.println("Digite uma idade: ");
			age = reader.nextInt();
			
			if(age<21) {
				MenosQue21++;
			}
			else if(age>50) {
				MaiorQue50++;
			}
		}
		System.out.println("pessoas com menos de 21 anos: "+MenosQue21);
		System.out.println("pessoas com mais de 50 anos: "+MaiorQue50);
	}
}