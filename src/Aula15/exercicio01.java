package Aula15;
import java.util.Scanner; 
public class exercicio01 {

	
	public static void main(String[] args) {
		int n1, n2;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		n1 = leitor.nextInt();
		System.out.println("Digite o segundo numero");
		n2 = leitor.nextInt();
		if(n1 > n2) {
			System.out.print(n1 + " É o maior numero");
		} else if(n2>n1) {
			System.out.print(n2 + " É o maior numero");
		} else {
			System.out.print("Os numeros são iguais! ");
		}
		

	}

}
