package logicagb;

import java.util.Scanner;

public class Lista01Exercicio08 {
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
		double custoConsumidor, custoFabrica;
		System.out.println("\nDigite o valor de fábrica:");
		custoFabrica=read.nextDouble();
		custoConsumidor=custoFabrica+(custoFabrica*0.73);
		System.out.println("\nO valor para o consumidor será de R$"+custoConsumidor);
		}
}
