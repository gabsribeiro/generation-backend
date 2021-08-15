package logicagb;
import java.util.Scanner;
public class Lista03Exercicio05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, sum=0;
		System.out.println("________Sistema de Soma________\nPara encerrar digite 0\n");
		do {			
			System.out.print("Digite um número: ");
			i=input.nextInt();
			sum=sum+i;
		}while(i!=0);
			System.out.println("A soma dos números digitados = "+sum);
	}
}
