package logicagb;

import java.util.Scanner;

public class Lista01Exercicio03 {
	public static void main (String[] args) {
		 Scanner read = new Scanner(System.in);

	     int totalSeg, segundos, minutos, horas;

	     System.out.println("\nDigite o total de duração do evento em segundos: ");
	     totalSeg = read.nextInt();

	     horas=totalSeg/3600;
	     minutos=(totalSeg%3600)/60;
	     segundos =(totalSeg%3600)%60;

	     System.out.println("\nO evento durou " + horas + " hora(s), " + minutos + " minuto(s) e " + segundos + " segundo(s).");
	}
}
