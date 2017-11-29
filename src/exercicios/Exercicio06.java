package exercicios;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		int x;
		int y;
		int valor;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o valor de x: ");
		x = scan.nextInt();
		System.out.print("Digite o valor de y: ");
		y = scan.nextInt();
		scan.close();
		if(x < y) {
			valor = (x + y);
		System.out.println( valor);
		}
		if(x > y) {
			valor = (x * y);
			System.out.println(valor);
			
		}
	}
}
