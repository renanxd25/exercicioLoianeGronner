package Aula33ex2;
import java.util.Scanner;

public class caixaEletronico {

	public static void main(String[] args) {
		
			Scanner leitor = new Scanner(System.in);
			contaCorrente minhaConta = new contaCorrente(1000);
			float saque;
			String validacao;
			System.out.print("voc� que ver o valor do saldo? ");
			validacao = leitor.next();
			if(validacao.equalsIgnoreCase("Sim")) {
				System.out.println(minhaConta.getSaldo());
			}
			
			System.out.println("voc� que sacar? ");
			validacao = leitor.next();
			if(validacao.equalsIgnoreCase("Sim")) {
				System.out.println("Quanto voc� quer sacar?  ");
				saque = leitor.nextFloat();
				minhaConta.realizarSaque(saque);
				
			}
			leitor.close();
	}
	

}
