package logicagb;
import java.util.Scanner;
public class Lista03Exercicio04 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int age, gender, psychS, calmP=0, nervousW=0, aggressiveM=0, othersC=0, nervousOver40=0, calmUnder18=0, i=0;
		System.out.print("____PESQUISA PARA LEVANTAMENTO PSICOLÓGICO____\n");
		while(i<=4) {
			System.out.print("\nDigite a sua idade: \n");
			age=input.nextInt();
			System.out.println("Escolha o seu gênero: \n1-Feminino \n2-Masculino \n3-Outros\n");
			gender=input.nextInt();
			System.out.println("Escolha a sua característica psicológico atual: \n1-Calmo \n2-Nervosa \n3-Agressivo");
			psychS=input.nextInt();
			if(psychS==1) {
				calmP++;
			}
			if(gender==1 && psychS==2) {
				nervousW++;
			}
			if(gender==2 && psychS==3) {
				aggressiveM++;
			}	
			if(gender==3 && psychS==1) {
				othersC++;
			}
			if(psychS==2 && age>40) {
				nervousOver40++;
			}
			if(psychS==1 && age<18) {
				calmUnder18++;
			}
			i++;
		}
		System.out.println("\n____________RESULTADO DA PESQUISA_____________");
		System.out.println("\nNúmero de pessoas calmas: "+calmP);
		System.out.println("Número de mulheres nervosas: "+nervousW);
		System.out.println("Número de homens agressivos: "+aggressiveM);
		System.out.println("Número de outros calmos: "+othersC);
		System.out.println("Número pessoas nervosas com mais de 40 anos: "+nervousOver40);
		System.out.println("Número de pessoas calmas com menos de 18 anos: "+calmUnder18);
	}
}
