package exercicios;

import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		num1 = scan.nextInt();
		System.out.print("Digite o segundo valor: ");
		num2 = scan.nextInt();
		scan.close();
		if(num1 % num2 == 0) {
			System.out.println("O número " + num1 + " é multiplo de " + num2);
		}else {
			System.out.println("O número " + num1 + " não é multiplo de " + num2);
		}
	}
}
