package Aula19;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		int[] a = new int[15];
		int[] b = new int[a.length];
		int c = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		for(int i = 0; i < a.length; i++ ) {
			c = i + 1;
			System.out.print("Digite o " + c + "º valor: ");
			a[i] = leitor.nextInt();
			b[i] = a[i] * a[i];
		}
		for(int p = 0; p <= a.length; p++ ) {
			System.out.println("O valor do vetor A nao posicao " + p + " é igual a " + a[p]);
			System.out.println("O valor do vetor B nao posicao " + p + " é igual a " + b[p]);
			System.out.println("===========================================================");
		}
		leitor.close();
	
	}

}
