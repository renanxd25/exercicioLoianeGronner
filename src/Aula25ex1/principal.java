package Aula25ex1;

public class principal {

	public static void main(String[] args) {
		
		lampada luz = new lampada();
		
		luz.ligada = false;
		
		if(luz.ligada == true){
			luz.ligarLampada();
			}else if(luz.ligada == false) {
				luz.DesligarLampada();
			}
		}

}
