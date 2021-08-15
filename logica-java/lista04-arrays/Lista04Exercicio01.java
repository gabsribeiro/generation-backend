package logicagb;

public class Lista04Exercicio01 {
	public static void main (String[] args) {
		int sum=0;
		int[] A = {1, 0, 5, -2, -5, 7};
		for(int i=0; i<A.length; i++) {
			A[3]=100;
		}
		System.out.print("____VETOR [6]____\n");
		for(int i=0; i<A.length; i++) {
			System.out.println(A[i]);
		}
		sum=A[0]+A[1]+A[5];
		System.out.println("\nA soma entre os valores das posições A[0], A[1] e A[5] do vetor é = "+sum);
	}
}
