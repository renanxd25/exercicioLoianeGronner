package Aula15;
import java.util.Scanner;

public class exercicio04 {
	public static void main(String[] args) {
		String letra;
		Scanner leitor = new Scanner(System.in);
		letra = leitor.next();
		/*if(
				letra.equalsIgnoreCase("a") || 
				letra.equalsIgnoreCase("e") ||
				letra.equalsIgnoreCase("i") ||
				letra.equalsIgnoreCase("o") ||
				letra.equalsIgnoreCase("u")) 
		{
			System.out.print("A letra " + letra + " é uma vogal");
		} else {
			System.out.print("A letra " + letra + " é uma consoante");
		}*/
		if(letra.length() > 1) {
			System.out.print(letra + "Não é uma letra valida! ");
		}else {
			switch(letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U": System.out.print(letra + " é uma vogal"); break;
			default: System.out.print(letra + " é uma consoante");
			}
		}
		
	}
}
