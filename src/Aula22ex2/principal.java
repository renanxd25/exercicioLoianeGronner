package Aula22ex2;

public class principal {
	public static void main(String[] args) {
		livro book = new livro();
		
		book.codigo = 542;
		book.genero = "Romance";
		book.idioma = "Portugues";
		
		
		System.out.print(book.codigo + "\n" + book.genero + "\n" + book.idioma );
	}

}
