package logicagb;
import java.util.Scanner;
public class Lista03Exercicio06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		double mean=0,i=0,sum=0;
		System.out.println("___Média dos Números Múltiplos de 3___\nPara encerrar digite 0\n");
		do {
			System.out.print("Digite um número: ");
			n=input.nextInt();
			if(n%3==0 && n!=0) {
				sum+=n;
				i++;					
			}				
		}while(n!=0);
		if(i!=0) {
			mean=sum/i;
			System.out.println("\nA média dos números digitados múltiplos de 3 é igual a "+mean);
		}else {
			System.out.println("\nEscolha um número diferente de 0 (zero) para iniciar o programa");
		}				
	}
}
