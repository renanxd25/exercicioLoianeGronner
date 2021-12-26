package Aula15;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		int n1, n2;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		n1 = leitor.nextInt();
		if(n1 > 0) {
			System.out.print(n1 + " É positivo");
		} else if(n1 <0 ) {
			System.out.print(n1 + " É negativo");
		}
		

	}

}
