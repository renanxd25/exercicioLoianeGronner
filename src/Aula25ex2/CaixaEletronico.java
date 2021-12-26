package Aula25ex2;

class CaixaEletronico {

	public static void main(String[] args) {
		contaCorrente conta = new contaCorrente();
		
		conta.saldo = 1000;
		conta.saque = 5000;
		conta.deposito = 3000;
		
		if(conta.saldo <= conta.saque) {
			System.out.println(" Seu saldo atual é de " + conta.saldo + " e você quer sacar " + conta.saque + " dessa maneira seu saldo é insuficiente");
		}else if(conta.saldo > conta.saque) {
			conta.realizarSaque();
		}
		conta.depositarDinheiro();
		conta.consultarsaldo();
	}
}
