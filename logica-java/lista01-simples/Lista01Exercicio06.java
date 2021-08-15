package logicagb;

import java.util.Scanner;

public class Lista01Exercicio06 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double x1,x2,y1,y2,d;
		System.out.println("\nDigite o valor para x1: ");
		x1=read.nextDouble();
		System.out.println("\nDigite o valor para x2: ");
		x2=read.nextDouble();
		System.out.println("\nDigite o valor para y1: ");
		y1=read.nextDouble();
		System.out.println("\nDigite o valor para y2: ");
		y2=read.nextDouble();
		
		d=Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1),2));
		
		System.out.println("\nd="+d);
	}
}
