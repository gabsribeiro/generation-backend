package logicagb;

import java.util.Scanner;

public class Lista01Exercicio07 {
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
		int a,b,c,d,e,f,x,y;
		System.out.println("\nEscreva o valor do coeficiente a:");
		a=read.nextInt();
		System.out.println("\nEscreva o valor do coeficiente b:");
		b=read.nextInt();
		System.out.println("\nEscreva o valor do coeficiente c:");
		c=read.nextInt();
		System.out.println("\nEscreva o valor do coeficiente d:");
		d=read.nextInt();
		System.out.println("\nEscreva o valor do coeficiente e:");
		e=read.nextInt();
		System.out.println("\nEscreva o valor do coeficiente f:");
		f=read.nextInt();
		x=(c*e)-(b*f)/(a*e)-(b*d);
		y=(a*f)-(c*d)/(a*e)-(b*d);
		System.out.println("\nO valor de x é "+x);
		System.out.println("\nO valor de y é "+y);
	}
}
