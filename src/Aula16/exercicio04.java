package Aula16;

public class exercicio04 {

	public static void main(String[] args) {
		int paisA = 80000;
		int paisB = 200000;
		int anos = 0;
		
		
		while(paisA < paisB) {
			paisA += (paisA/100) * 3;
			paisB += (paisB/100) *1.5;
			anos++;
		}
		System.out.println("O PaisA superou o PaisB em " + anos + " anos");
		System.out.println("Em " + anos +" anos a população do Pais A terá: " + paisA );
		System.out.println("E a do Pais B terá: " + paisB );
		

	}

}
