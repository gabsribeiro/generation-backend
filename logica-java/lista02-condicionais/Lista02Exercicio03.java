package logicagb;

import java.util.Scanner;

public class Lista02Exercicio03 {
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
		int age;
		System.out.println("Digite a sua idade: ");
		age=read.nextInt();
		if(age>=10 && age<=14) {
			System.out.println("Categoria 10-14 - Infantil");
		} else if(age>=15 && age<=17) {
			System.out.println("Categoria 15-17 - Juvenil");
		} else if(age>=18 && age<=25) {
			System.out.println("Categoria 18-25 - Adulto");
		} else {
			System.out.println("Fora da faixa etária.");
		}
	}
}
