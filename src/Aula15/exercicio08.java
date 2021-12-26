package Aula15;
import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		float p1,p2,p3;
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o valor do produto 1 ");
		p1 = leitor.nextFloat();
		System.out.print("Digite o valor do produto 2 ");
		p2 = leitor.nextFloat();
		System.out.print("Digite o valor do produto 3 ");
		p3 = leitor.nextFloat();
		
		
		if(p1 < p2 && p1 < p3) {
			System.out.println("O produto numero 1 é o mais barato e ele custa apenas R$" + p1);
		} else if(p2 < p1 && p2 < p3) {
			System.out.println("O produto numero 1 é o mais barato e ele custa apenas R$" + p2);
		}else if(p3 < p1 && p3 < p2) {
			System.out.println("O produto numero 1 é o mais barato e ele custa apenas R$" + p3);
		
		}

	}

}
