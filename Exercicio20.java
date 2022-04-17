package EstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um numero inteiro positivo menor do que 16 para calculo do fatorial. Digite 0(zero) para sair");
		int numero = scan.nextInt();

		while (numero > 0 && numero < 16) {
			int resultado = 1;
				for (int i = numero; i >= 1; i--) {
				resultado = resultado * i;
				}
			System.out.println("Fatorial de " + numero + " é igual a: " + resultado);
			System.out.println("Informe um numero inteiro positivo menor do que 16 para calculo do fatorial. Digite 0(zero) para sair");
			numero = scan.nextInt();
		}
		System.out.println("Programa encerrado!");
		scan.close();

	}

}
