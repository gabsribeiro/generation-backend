package logicagb;

import java.util.Scanner;

public class Lista01Exercicio05 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float nota1, nota2, nota3, mediaTotal;
		System.out.println("\nNota 1:");
		nota1=read.nextFloat();
		System.out.println("\nNota 2:");
		nota2=read.nextFloat();
		System.out.println("\nNota 3:");
		nota3=read.nextFloat();
		mediaTotal=((nota1*2)+(nota2*3)+(nota3*5))/(2+3+5);
		System.out.println("\nA sua média final é "+mediaTotal);
		
	}
}
