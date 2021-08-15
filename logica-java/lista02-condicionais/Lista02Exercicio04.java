package logicagb;

import java.util.Scanner;

public class Lista02Exercicio04 {
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
		double number, sqrt, power;
		System.out.println("Digite um número: ");
		number=read.nextDouble();
		if(number%2==0) {
			sqrt=Math.sqrt(2);
			System.out.println("O número escolhido é par e sua raiz quadrada é "+sqrt);
		} else if(number%2==1) {
			power=Math.pow(number, 2);
			System.out.println("O número escolhido é ímpar e sua potência ao ² é "+power);
		}
	}
}
