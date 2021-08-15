package logicagb;
import java.util.Scanner;
public class Lista04Exercicio04 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		float[][] a1 = new float [2][2];
		float[][] a2 = new float [2][2];
		float[][] a3 = new float [2][2];
		int choice, l=0, c=0;
		System.out.print("Insira os valores da matriz A1: \n");
		for(l=0; l<a1.length; l++) {
			for(c=0; c<a1.length; c++) {
				System.out.printf("[%d][%d]: ",l,c);
				a1[l][c]=input.nextFloat();
			}
		}
		System.out.print("\nInsira os valores da matriz A2: \n");
		for(l=0; l<a2.length; l++) {
			for(c=0; c<a2.length; c++) {
				System.out.printf("[%d][%d]: ",l,c);
				a2[l][c]=input.nextFloat();
			}
		}
		System.out.println("\nEscolha uma das opções a seguir: \n[1]: Somas as matrizes \n[2]: Subtrair a primeira matriz da segunda \n[3]: Adicionar uma constante as duas matrizes \n[4]: Imprimir as matrizes\n");
		choice=input.nextInt();
		for(l=0; l<a3.length; l++) {
			for(c=0; c<a3.length; c++) {
				switch(choice) {
				case(1):
					a3[l][c]=(a1[l][c])+(a2[l][c]);
					System.out.print("["+a3[l][c]+"]");
					break;
				case(2):
					a3[l][c]=(a2[l][c])-(a1[l][c]);
					System.out.print("["+a3[l][c]+"]");
					break;
				case(3):
					System.out.print("Escolha um número para a constante: ");
					int constant=input.nextInt();
					System.out.println("\nMatriz 1: ");
					for(l=0; l<a1.length; l++) {
						for(c=0; c<a1.length; c++) {
							a1[l][c]+=constant;							
							System.out.print("["+a1[l][c]+"]");
						}
						System.out.println();
					}
					System.out.println("\nMatriz 2: ");
					for(l=0; l<a2.length; l++) {
						for(c=0; c<a2.length; c++) {
							a2[l][c]+=constant;							
							System.out.print("["+a2[l][c]+"]");
						}
						System.out.println();
					}	
					break;
				case(4):
					System.out.println("Matriz 1: ");
					for(l=0; l<a1.length; l++) {
						for(c=0; c<a1.length; c++) {							
							System.out.print("["+a1[l][c]+"]");
						}
						System.out.println();
					}
					System.out.println("\nMatriz 2: ");
					for(l=0; l<a2.length; l++) {
						for(c=0; c<a2.length; c++) {						
							System.out.print("["+a2[l][c]+"]");
						}
						System.out.println();
					}	
					break;					
				}
			}
			System.out.println();
		}
		
	}
}
