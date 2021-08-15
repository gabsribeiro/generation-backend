package logicagb;

import java.util.Scanner;

public class Lista02Exercicio02 {
	public static void main (String[] args){
		Scanner read = new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Digite três números: ");
		n1=read.nextInt();
		n2=read.nextInt();
		n3=read.nextInt();
		if(n3>n1) {	
			if(n1>n2) {
				System.out.printf("Os números em ordem crescente são "+n2+", "+n1+" e "+n3);
			}else if(n2<n3) {
				System.out.printf("Os números em ordem crescente são "+n1+", "+n2+" e "+n3);
			}			
		}if(n1>n2) {
			if(n2>n3) {
				System.out.printf("Os números em ordem crescente são "+n3+", "+n2+" e "+n1);
			}else if(n3<n1) {
				System.out.printf("Os números em ordem crescente são "+n2+", "+n3+"e "+n1);
			}
		}if(n1<n2) {
			if(n3<n1) {
				System.out.printf("Os números em ordem crescente são "+n3+", "+n1+" e "+n2);
			}else if(n3<n2) {
				System.out.printf("Os números em ordem crescente são "+n1+", "+n3+" e "+n2);
			}
		}
	}
}
