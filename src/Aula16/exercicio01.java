package Aula16;
import  java.util.Scanner;
public class exercicio01 {
	public static void main(String[] args) {
	int nota;
	Scanner leitor = new Scanner(System.in);
	
	System.out.print("Digite uma nota entra 0 a 10: ");
	nota = leitor.nextInt();
	
	while(nota < 0 || nota >10) {
		System.out.println("===================");
		System.out.println("Nota invalida!!");
		System.out.println("===================");
		System.out.println("Digite uma nova nota: ");
		nota = leitor.nextInt();
		System.out.println("===================");
	}
	System.out.print("O aluno tirou a nota " + nota);
	

	}

}
