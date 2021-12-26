package Aula16;
import java.util.Scanner;
public class exercicio07 {
	public static void main(String[] args) {
		int num;
		int passo = 1;
		int maior = Integer.MIN_VALUE;
		Scanner leitor = new Scanner(System.in);
		
		for(int i=0; i < 5; i++ ){
			System.out.print("Digite um numero no passo " + passo + ": ");
			num = leitor.nextInt();
			passo = passo + 1;
			if(num > maior) {
				maior = num;
			}
		}
		System.out.print("O maior numero digitado foi " + maior);
	}

}
