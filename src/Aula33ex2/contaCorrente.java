package Aula33ex2;

public class contaCorrente {
	private int numeroConta;
	private float saldo;
	private boolean especial;
	private float limite;
	private float saque; 
	private float deposito; 
	
	
	contaCorrente(float saldo){
		this.saldo = 1000;
		saldo = this.saldo;
	}
		
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isEspecial() {
		return especial;
	}
	public void setEspecial(boolean especial) {
		this.especial = especial;
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	float realizarSaque(float saque) {
			System.out.println("Seu saldo anterior era de " + saldo);
			this.saque = saque;
			saldo = saldo - saque;
			System.out.println("Você sacou um total de  " + this.saque);
			System.out.println("Seu saldo atual agora é " + saldo);
			System.out.println("====================================== ");
			return saldo;
		}
	
	float realizarDoposito(float deposito) {
		this.deposito = deposito;
		saldo = saldo + deposito;
		System.out.println("Você depositou um total de  " + this.deposito);
		System.out.println("Seu saldo atual agora é " + saldo);
		return saldo;
		
		}
	
	boolean contaEspecial(boolean especial) {
			this.especial = true;
			System.out.print("Esta é uma conta especial");
			return this.especial;
		}

}
