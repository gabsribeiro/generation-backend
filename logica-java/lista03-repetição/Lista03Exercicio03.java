package logicagb;
import java.util.Scanner;
public class Lista03Exercicio03 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int age, under21=0, over50=0;
		System.out.println("Digite a idade: ");
		age=input.nextInt();
		while(age!=-99) {
			if(age<21) {
				under21++;
			}else if(age>50) {
				over50++;
			}
			System.out.println("Digite a idade: ");
			age=input.nextInt();
		}
		System.out.println("\nTotal de pessoas com menos de 21 anos: "+under21);
		System.out.println("Total de pessoas com mais de 50 anos: "+over50);
	}
}
