package exercicios;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		int n;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		n = scan.nextInt();
		scan.close();
		if(n < 0) {
			System.out.println("O n�mero " + n +   " � negativo");
		}if(n == 0) {
			System.out.println("O n�mero " + n +   " � igual a 0");
		}else {
			System.out.println("O n�mero " + n +   " � positivo");
		}
	}
}
