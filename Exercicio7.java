package EstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double maior = 0;
		for(int i = 1; i <= 5; i++) {
			System.out.println("Digite um número: ");
			double numero = scan.nextDouble();
			if(numero > maior) maior = numero;
		}
		System.out.println("O maior número informado foi: "+maior);
		scan.close();
	}

}
