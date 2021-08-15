package logicagb;

import java.util.Scanner;

public class Lista01Exercicio02 {
	public static void main(String[] args) {
		//Considerando o ano ter 365 dias e um mês ter 30 dias
		Scanner read = new Scanner(System.in);
		int anos, meses, dias, resultado, totalDias;
		System.out.println("\nQual é a sua idade em dias?");
		totalDias=read.nextInt();
		anos=totalDias/365;
		meses=(totalDias%365)/30;
		dias=(totalDias%365)%30;
		System.out.println("\nVocê tem "+anos+" anos, "+meses+" meses e "+dias+ " dias vividos.");
	}
}
