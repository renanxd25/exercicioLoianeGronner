package Aula15;
import java.util.Scanner;
public class exercicio12 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float salario,percentual, aumento1,aumento2,aumento3, aumento4;
		
		try {
			System.out.print("Qual o salario do colaborador? ");
			salario = leitor.nextFloat();
			leitor.close();
			
		} finally {
			leitor.close();
		}
		
		aumento1 = (salario* 20/100);
		aumento2 = (salario* 15/100);
		aumento3 = (salario* 10/100);
		aumento4 = (salario* 5/100);

	}

}
