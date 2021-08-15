package logicagb;

import java.util.Scanner;
import java.util.Scanner;
public class Lista01Exercicio01 {
		public static void main (String[] args) {
		//Considerando o ano ter 365 dias e um mês ter 30 dias
		Scanner read = new Scanner(System.in);
		int anos, meses, dias, resultado;
		System.out.println("\nQuantos anos você tem?");
		anos=read.nextInt();
		System.out.println("\nSão "+ anos + " anos e quantos meses?");
		meses=read.nextInt();
		System.out.println("\nSão "+anos+" anos, "+meses+ " meses e quantos dias?");
		dias=read.nextInt();
		anos=anos*365;
		meses=meses*30;
		resultado=anos+meses+dias;
		System.out.println("\nConsiderando um ano com 365 dias e um mês com 30 dias, você já viveu "+resultado+" dias!");
		}
}
