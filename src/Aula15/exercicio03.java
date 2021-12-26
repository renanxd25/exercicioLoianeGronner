package Aula15;
import java.util.Scanner;

public class exercicio03 {
	public static void main(String[] args) {
		String letra;
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite F ou M para informar se é masculino ou feminino ");
		 letra = leitor.next();
			if (letra.equalsIgnoreCase("F") ) {
				System.out.print("Sexo feminino");
			} else if(letra.equalsIgnoreCase("M") ) {
				System.out.print("Sexo masculino");
			} else {
				System.out.print("Sexo invalido!");
			}

	}

}
