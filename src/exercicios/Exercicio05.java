package exercicios;

import java.util.Scanner;
public class Exercicio05 {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		n = scan.nextInt();
		scan.close();
		if((n >= 5) && (n <= 20)) {
			System.out.println("O valor digitado est� entre 5 e 20");
		}else {
			System.out.println("O valor digitado n�o est� entre 5 e 20");
		}
	}
}
