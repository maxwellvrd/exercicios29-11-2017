package exercicios;

import java.util.Scanner;
public class Exercicio10 {
	
	public static void main(String[] args) {
		
		float salario;
		float prestacao;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o seu sálario: ");
		salario = scan.nextFloat();
		System.out.print("Digite o valor da presteção do empréstimo: ");
		prestacao = scan.nextFloat();
		scan.close();
		if(prestacao > (salario* 20/100)) {
			System.out.println("O empréstimo não pode ser concedido!");
		}if (prestacao ==(salario* 20/100)) {
			System.out.println("Empréstimo em analise");
		}if(prestacao < (salario*20/100)) {
			System.out.println("O empréstimo pode ser concedido!");
		}
	}
	
}
