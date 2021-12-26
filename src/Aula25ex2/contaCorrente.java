package Aula25ex2;

public class contaCorrente {
	float saldo;
	float saque;
	int numerodeconta;
	boolean statusEspecial;
	float limitedesaque;
	boolean chequeespecial;
	float deposito;
	
	float realizarSaque() {
		saldo = saldo - saque;
		return saldo;
	}
	
	float depositarDinheiro() {
		saldo = saldo + deposito;
		return saldo;
	}
	
	void consultarsaldo() {
		System.out.print("Seu saldo atual é de: " + saldo);
	}
	
	void estarUsandochequeespecial() {
		if (chequeespecial == true) {
			System.out.print("Esta usando cheque especial");

		}else if(chequeespecial == false) {
			System.out.print("Não esta usando cheque especial");
		}
	}

}
