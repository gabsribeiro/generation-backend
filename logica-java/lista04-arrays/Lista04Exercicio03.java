package logicagb;
import java.util.Scanner;
public class Lista04Exercicio03 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] array = new int [3][3];
		int count=0;
		System.out.println("__________ MATRIZ[3][3] __________\n");
		for(int l=0; l<array.length; l++) {
			for(int c=0; c<array.length; c++) {
				System.out.printf("Insira os valores da matriz [%d][%d]: ",l,+c);
				array[l][c]=input.nextInt();
				if(array[l][c]>10) {
					count++;
				}
			}
		}
		System.out.print("\nA matriz possui "+count+" valor(es) maior(es) que 10.");		
	}
}
