package exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		int num1;
		int num2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		num1 = scan.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		num2 = scan.nextInt();
		scan.close();
		
		if(num1 > num2) {
			System.out.println(num1 + " � maior que " +num2 );
		}
		if(num1 == num2) {
			System.out.println(" Os dois n�meros s�o iguais!");
		}
		if(num1 < num2) {
			System.out.println(num2 + " � maior que " +num1 );
		}
	}
}
