package Aula15;
import java.util.Scanner;
public class exercicio06 {

	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		num1 = leitor.nextInt();
		System.out.print("Digite o segundo numero: ");
		num2 = leitor.nextInt();
		System.out.print("Digite o terceiro numero: ");
		num3 = leitor.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.print(num1 + " � o maior numero");
		} else if(num2 > num1 && num2 > num3) {
			System.out.print(num2 + " � o maior numero");
		}else if(num3 > num1 && num3 > num2) {
			System.out.print(num3 + " � o maior numero");
		}
		
	}

}
