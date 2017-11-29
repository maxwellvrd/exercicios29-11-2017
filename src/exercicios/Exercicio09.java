package exercicios;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		int numerador;
		int denominador;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o valor do numerador: ");
		numerador = scan.nextInt();
		System.out.print("Digite o valor do denominador: ");
		denominador = scan.nextInt();
		scan.close();
		
		if(denominador == 0){
			System.out.println("O denominador é igual a zero!");
		}else {
			System.out.println(numerador / denominador);
		}
	}
}
