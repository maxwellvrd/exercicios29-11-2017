package exercicios;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		int valor;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		valor = scan.nextInt();
		scan.close();
		if(valor % 2 == 0) {
			System.out.println("O n�mero " + valor + " � par!");
		} else {
			System.out.println("O n�mero " + valor + " � impar!");
		}
	}

}
