package logicagb;

import java.util.Scanner;

public class Lista01Exercicio04 {
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);

        int numA, numB, numC;
        double resultadoD, somaS, somaR;

        System.out.println("\nDigite um valor positivo e inteiro para A: ");
        numA=read.nextInt();
        System.out.println("\nDigite um valor positivo e inteiro para B: ");
        numB=read.nextInt();
        System.out.println("\nDigite um valor positivo e inteiro para C: ");
        numC=read.nextInt();

        somaR = Math.pow((numA+numB), 2);
        somaS = Math.pow((numB+numC), 2);
        resultadoD = (somaS+somaR)/2;

        System.out.println("\nO resultado de é D: " + resultadoD);
	}
}
