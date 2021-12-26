package Aula16;
import java.util.Scanner;
public class exercicio10 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o primiero valor: ");
		num1 = leitor.nextInt();
		System.out.print("Digite o primiero valor: ");
		num2 = leitor.nextInt();
		for(int i = num1; i<num2; i++ ) {
			System.out.println(i);
		}
	}

}
