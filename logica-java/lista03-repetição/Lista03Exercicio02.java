package logicagb;
import java.util.Scanner;
public class Lista03Exercicio02 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		int even=0, odd=0;
		for(int i=0; i<11; i++) {
			System.out.println("Digite um n�mero: ");
			i=input.nextInt();
			if(i%2==0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("\nN� de pares: "+even);
		System.out.println("\nN� de �mpares: "+odd);
	}
}
