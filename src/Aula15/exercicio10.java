package Aula15;
import java.util.Scanner;
public class exercicio10 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String turno;
		System.out.print("Que turno você estuda? ");
		turno = leitor.next();
		if(turno.length() > 1) {
			System.out.print(" Caractere Invalido! ");
		} else {
			switch(turno) {
				case "t":
					System.out.print("Estudo a tarde! ");
					break;
				case "T":
					System.out.print("Estudo a tarde! ");
					break;
				case "m":
					System.out.print("Estudo pela manhã! ");
					break;
				case "M":
					System.out.print("Estudo pela manhã! ");
					break;
				case "N":
					System.out.print("Estudo a noite! ");
					break;
				case "n":
					System.out.print("Estudo a noite! ");
					break;
			
			}
		}

	}

}
