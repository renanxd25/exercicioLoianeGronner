package Aula16;
import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		String usuario, senha;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o usuario:");
		usuario = leitor.next();
		System.out.println("Digite a senha:");
		senha = leitor.next();
		
		while(usuario.equalsIgnoreCase(senha) && senha.equalsIgnoreCase(usuario)) {
			System.out.println("Dados invalidos! Seguraça de acesso ameaçada digite novamente os dados de acesso:  ");
			System.out.println("====================================================================================");
			System.out.print("Digite um novo usuario ");
			usuario = leitor.next();
			System.out.print("Digite uma nova senha ");
			senha = leitor.next();
			System.out.println("====================================================================================");
		}
		System.out.print("Dados cadastrado com sucesso! Bem vindo " + usuario);

	}

}
