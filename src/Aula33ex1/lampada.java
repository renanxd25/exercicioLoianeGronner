package Aula33ex1;

import java.util.Scanner;

public class lampada {
	private String nome;
	private String tipo;
	private int potencia;
	private float preco;
	private String cor;
	private String[] tipos;
	private boolean ligada;
	private String sinal;
	
	
	
	public String getSinal() {
		return sinal;
	}
	public void setSinal(String sinal) {
		this.sinal = sinal;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String[] getTipos() {
		return tipos;
	}
	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}
	public boolean isLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	 void ligarLampada() {
		Scanner acenderLampada = new Scanner(System.in);
		System.out.println("========== Quer ligar a lampada? ==========");
		System.out.println("Digite L pra ligar ou D pra desligar a lampada ");
		sinal = acenderLampada.next();
		if(sinal.equalsIgnoreCase("l")) {
			System.out.printf("A lampada foi ligada! ");

		} else if(sinal.equalsIgnoreCase("d")) {
			System.out.printf("A lampada foi desligada!");

		} else {
			System.out.printf("Lampada em curto!");
		}
		acenderLampada.close();
	}
	
}
