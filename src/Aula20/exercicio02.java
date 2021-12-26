package Aula20;

import java.util.Random;

public class exercicio02 {

	public static void main(String[] args) {
		int M[][] = new int[10][10];
		Random aleatorios = new Random(10);
		for(int i=0; i< M.length; i++ ){
			for(int j=0; i<= M[i].length; j++ ){
				M[i][j] = aleatorios.nextInt(10);
			}
		}
		
		int maior = 0;
		int linha = 0;
		int col = 0;
		for(int i=0; i<M.length; i++) {
			for(int j=0; j<M[i].length; j++) {
				if(M[i][j]>maior) {
					maior = M[i][j];
					linha = i;
					col = j;
				}
			}
		}
		for(int i=0; i<M.length; i++) {
			for(int j=0; j<M[i].length; j++) {
				System.out.print(M[i][j] + " | ");
			}
			System.out.println();
		}
		System.out.println("Maior valor = " + maior);
		System.out.println("Linha = " + linha);
		System.out.println("Coluna = " + col);
		
	}
}
