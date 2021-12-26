package Aula15;
import java.util.Scanner;

public class exercicio11 {
	public static void main(String[] args) {
	float salario, percentual, aumento1,aumento2,aumento3, aumento4;
	Scanner leitor = new Scanner(System.in);
	try {
		System.out.print("Qual o salario do colaborador? ");
		salario = leitor.nextFloat();
		leitor.close();
		
	} finally {
		leitor.close();
	}
	
	aumento1 = (salario* 20/100);
	aumento2 = (salario* 15/100);
	aumento3 = (salario* 10/100);
	aumento4 = (salario* 5/100);
	
	if(salario >=0 && salario<=208) {
		percentual = salario + aumento1 ;
		System.out.print("O seu salario atual é R$" + salario + " e o percentual aumentado foi de 20% que conrresponde a R$" + aumento1 + " e seu salario ficou R$" + percentual);
	}else if(salario >280 && salario<=700) {
		percentual = salario + aumento2;
		System.out.print("O seu salario atual é R$" + salario + " e o percentual aumentado foi de 15% que conrresponde a R$" + aumento2 + " e seu salario ficou R$" + percentual);
	}else if(salario >700 && salario<=1500) {
		percentual = salario + aumento3;
		System.out.print("O seu salario atual é R$" + salario + " e o percentual aumentado foi de 10% que conrresponde a R$" + aumento3 + " e seu salario ficou R$" + percentual);
	}else if(salario >1500) {
		percentual = salario + aumento4;
		System.out.print("O seu salario atual é R$" + salario + " e o percentual aumentado foi de 5% que conrresponde a R$" + aumento4 + " e seu salario ficou R$" + percentual);
	}
		
	}

}
