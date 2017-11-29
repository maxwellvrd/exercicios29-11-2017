package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		double valor;
		double desconto;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		valor = scan.nextDouble();
		scan.close();
		desconto = valor * 0.09;
		System.out.println("O novo valor do produto  com desconto será: " + (valor - desconto));
	}
}
