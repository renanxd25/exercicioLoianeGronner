package Aula19;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		double[] a = new double[10];
		int c = 0;
		int contador = 0;
				
		Scanner leitor = new Scanner(System.in);

		for(int i = 0; i < a.length; i++ ) {
			c = i + 1;
			System.out.print("Digite o " + c + "º valor: ");
			a[i] = leitor.nextInt();
		    if(a[i]%2==0) {
		    	contador++;
		    }
		}
		System.out.println("===========================================================");
		System.out.println("O sistema dectou " + contador + " numeros pares");
		System.out.println("===========================================================");
		for(int p = 0; p <= a.length; p++ ) {
			System.out.println("O valor do vetor A nao posicao " + p + " é igual a " + a[p]);
			System.out.println("===========================================================");
		}
		
		leitor.close();
		System.out.println("O sistema dectou " + contador + " numeros pares");
	
	}

}
