package exercicios;

import java.util.Scanner;
public class Exercicio10 {
	
	public static void main(String[] args) {
		
		float salario;
		float prestacao;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o seu s�lario: ");
		salario = scan.nextFloat();
		System.out.print("Digite o valor da preste��o do empr�stimo: ");
		prestacao = scan.nextFloat();
		scan.close();
		if(prestacao > (salario* 20/100)) {
			System.out.println("O empr�stimo n�o pode ser concedido!");
		}if (prestacao ==(salario* 20/100)) {
			System.out.println("Empr�stimo em analise");
		}if(prestacao < (salario*20/100)) {
			System.out.println("O empr�stimo pode ser concedido!");
		}
	}
	
}
