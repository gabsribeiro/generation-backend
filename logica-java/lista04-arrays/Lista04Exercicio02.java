package logicagb;
import java.util.Scanner;
public class Lista04Exercicio02 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int[] vetor = new int[6];
		int sumE=0, sumO=0;
		for(int i=0; i<vetor.length; i++) {
			System.out.print("Digite um n�mero: ");
			vetor[i]=input.nextInt();
		}
		System.out.print("\nN�meros pares: \n");
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i]%2==0) {
				System.out.print(vetor[i]+ " | ");
				sumE+=vetor[i];
			}
		}
		System.out.print("\nN�meros �mpares: \n");
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i]%2==1) {
				System.out.print(vetor[i]+" | ");
				sumO+=vetor[i];
			}
		}		
		System.out.println("\nA soma dos n�meros pares = "+sumE);
		System.out.println("A soma dos n�meros �mpares = "+sumO);		
	}
}
