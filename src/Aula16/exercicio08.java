package Aula16;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		double num;
		int passo = 1;
		double soma = 0, media = 0;
		Scanner leitor = new Scanner(System.in);
		boolean validacao = true;
		
		for(int i=0; i < 5; i++ ){
			System.out.print("Digite um numero no passo " + passo + ": ");
			num = leitor.nextInt();
			passo = passo + 1;
			soma = soma+num;
			
			if(validacao) {
				media = soma/5;
			}
		}
		System.out.println("A media dos numeros foi: " + media );
		System.out.println("A soma dos numeros foi: " + soma );
	}

}
