package Aula16;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		int num1, num2, num3=0;
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o primiero valor: ");
		num1 = leitor.nextInt();
		System.out.print("Digite o primiero valor: ");
		num2 = leitor.nextInt();
		for(int i = num1; i<num2; i++ ) {
			num3 = num3 +i;
			System.out.print(i + " -");
		}
		System.out.println("A soma dos intervalos dos numeros é " + num3);
	}

}
