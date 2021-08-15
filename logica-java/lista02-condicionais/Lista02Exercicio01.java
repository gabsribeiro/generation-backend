package logicagb;

import java.util.Scanner;

public class Lista02Exercicio01 {
	public static void main (String[] args) {
		Scanner read = new Scanner (System.in);
		int a, b, c, larger=0;
		System.out.println("Digite o primeiro valor: ");
		a=read.nextInt();
		System.out.println("Digite o segundo valor: ");
		b=read.nextInt();
		System.out.println("Digite o terceiro valor: ");
		c=read.nextInt();
		if(a>b) {
			if(a>c) {
				larger=a;
			} else {
				larger=c;
			}
		} else {
			if(b>c) {
				larger=b;
			} else {
				larger=c;
			}
		}
		System.out.println("O maior número digitado foi "+larger+".");
	}
}
