package Aula16;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner leitor = new Scanner(System.in);
		num1 = leitor.nextInt();
		num2 = num1;
		for(int i = 1; i<10; i++ ) {
			num1 = num1 +i;
			System.out.print(num2 + "+" + i + " = " + num1);
		}
	}
}
