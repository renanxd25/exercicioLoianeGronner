package Aula16;
import java.util.Scanner;

public class exercicio05 {
	public static void main(String[] args) {
		int paisA,paisB, taxaA,taxaB;
		int anos = 0;
		boolean validacao = false; 
		Scanner leitor = new Scanner(System.in);
		do {
			System.out.println("Quanto � a populacao do pais A: ");
			paisA = leitor.nextInt();
			System.out.println("Quanto � a taxa de cescimento da populacao do pais A: ");
			taxaA = leitor.nextInt();
			System.out.println("Quanto � a populacao do pais B: ");
			paisB = leitor.nextInt();
			System.out.println("Quanto � a taxa de cescimento da populacao do pais B: ");
			taxaB = leitor.nextInt();
			if(paisA < paisB) {
				paisA += (paisA/100) * taxaA;
				paisB += (paisB/100) *taxaB;
				validacao = true;
				anos++;
			}else{
				System.out.println("A popula��o do pais A � maior que a populacao do pais B repita as perguntas! ");
			}
		}while(!validacao);
		System.out.println("O PaisA superou o PaisB em " + anos + " anos");
		System.out.println("Em " + anos +" anos a popula��o do Pais A ter�: " + paisA);
		System.out.println("E a do Pais B ter�: " + paisB);
	}

}
