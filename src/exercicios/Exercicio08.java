package exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		int ano;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um ano: ");
		ano = scan.nextInt();
		scan.close();
		
		if((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0) )  {
			System.out.println("O Ano " + ano + " é bissexto");
		}else {
			System.out.println("O ano " + ano + " não é bissexto");
		}
	}
	
	
}
