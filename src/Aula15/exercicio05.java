package Aula15;
import java.util.Scanner;

public class exercicio05 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double nota1,nota2,media;
		System.out.print("Digite a primeira nota: ");
		nota1 = leitor.nextInt();
		System.out.print("Digite a segunda nota: ");
		nota2 = leitor.nextDouble();
		media = (nota1+nota2)/2;
		
		if(media >= 7 && media <=9) {
			System.out.print("A nota média do aluno foi " + media + " e ele foi aprovado");
		} else if(media == 10) {
			System.out.print("A nota media do aluno foi " + media + " e ele foi aprovado com distinção");
		} else {
			System.out.print("A media do aluno foi " + media + " e ele foi reprovado");
		}
		
	}

}
