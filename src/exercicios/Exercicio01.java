package exercicios;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		int num;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um valor :");
		num = scan.nextInt();
		scan.close();
		if(num > 0) {
			System.out.println(num);
		}
		if(num < 0) {
			num = (num * -1);
			System.out.println(num);
		}
		
	}
}
