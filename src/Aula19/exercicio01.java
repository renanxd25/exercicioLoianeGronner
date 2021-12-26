package Aula19;

public class exercicio01 {

	public static void main(String[] args) {
		int[] a = new int[5]; 
		int[] b = new int[5];
		
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		for(int i = 0; i<= 4 ; i++) {
			b[i] = a[i];
		} 
		
		System.out.print(b[0]);
		System.out.print(b[1]);
		System.out.print(b[2]);
		System.out.print(b[3]);
		System.out.print(b[4]);

	}

}
