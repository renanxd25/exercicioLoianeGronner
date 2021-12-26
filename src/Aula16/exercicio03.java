package Aula16;
import java.util.Scanner;
public class exercicio03 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		boolean infoValida = false, 
				infoIdade = false,
				infoSalario = false,
				infoSexo = false,
				infoEstadoCivil = false;	
		String nome, sexo,estadocivil;
		int idade, salario;
		do {
			System.out.print("Entre com o nome: ");
			nome = leitor.next();
			if(nome.length() >=3) {
				infoValida = true;
			} else {
				System.out.println("Nome precisa de no minimo de 3 caracteres");
			}
		} while(!infoValida);
		do {
			System.out.println("Qual é a sua idade? ");
			idade = leitor.nextInt();
			if(idade >= 0 && idade <= 150) {
				infoIdade = true;
			} else {
				System.out.println("Idade precisa ser entre 0 e 150");
			}
		}while(!infoIdade);
		do {
			System.out.println("Qual o Salario? ");
			salario = leitor.nextInt();
			if(salario > 0 ) {
				infoSalario = true;
			} else {
				System.out.println("Salario precisa ser maior que zero ");
			}
		}while(!infoSalario);
		do {
			System.out.print("Qual o seu sexo? ");
			sexo = leitor.next();
			if(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
				infoSexo = true;
			}else {
				System.out.println("Sexo invalido! ");
			}
		}while(!infoSexo);
		do {
			System.out.print("Estado Civil? ");
			estadocivil = leitor.next();
			if(estadocivil.equalsIgnoreCase("s") || estadocivil.equalsIgnoreCase("d") || 
					estadocivil.equalsIgnoreCase("v") || estadocivil.equalsIgnoreCase("c")) {
				infoEstadoCivil = true;
			}else {
				System.out.println("Estado civil invalido invalido! ");
			}
		}while(!infoEstadoCivil);
	}
}
