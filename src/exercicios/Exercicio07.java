package exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		int num1;
		int num2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		num1 = scan.nextInt();
		
		System.out.print("Digite o segundo número: ");
		num2 = scan.nextInt();
		scan.close();
		
		if(num1 > num2) {
			System.out.println(num1 + " é maior que " +num2 );
		}
		if(num1 == num2) {
			System.out.println(" Os dois números são iguais!");
		}
		if(num1 < num2) {
			System.out.println(num2 + " é maior que " +num1 );
		}
	}
}
