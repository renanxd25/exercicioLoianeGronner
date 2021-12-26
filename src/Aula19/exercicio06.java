package Aula19;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		double[] a = new double[10];
		double[] b = new double[a.length];
		double[] c = new double[a.length];
		int f = 0;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("===========================================================");
		System.out.println("============= Digiate os valores do vetor A ===============");
		System.out.println("===========================================================");
		for(int i = 0; i < a.length; i++ ) {
			f = i + 1;
			System.out.print("Digite o " + f + "º valor: ");
			a[i] = leitor.nextInt();
		}
		System.out.println("===========================================================");
		System.out.println("============= Digiate os valores do vetor B ===============");
		System.out.println("===========================================================");
		for(int i = 0; i < a.length; i++ ) {
			f = i + 1;
			System.out.print("Digite o " + f + "º valor: ");
			b[i] = leitor.nextInt();
		}
		System.out.println("===========================================================");
		for(int i = 0; i < a.length; i++ ) {
			c[i] = a[i] + b[i];
		}
		System.out.println("===========================================================");
		for(int p = 0; p <= a.length; p++ ) {
			System.out.println("O valor do vetor C nao posicao " + p + " é igual a " + c[p]);
			System.out.println("===========================================================");
		}
		leitor.close();
	
	}

}
