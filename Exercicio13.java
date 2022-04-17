package EstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número, que será a base: ");
		int base = scan.nextInt();
		System.out.print("Digite um número, que será o expoente: ");
		int expoente = scan.nextInt();
		// inicia variável com valor 1, para que ao multiplicá-la pela base, armazena o valor de base para referência
		int calculo = 1;
		// vai percorrer o laço de repetição até o valor de expoente
		for(int i = 1; i <= expoente; i++) {
			// calculo recebe ele mesmo vezes o valor de base, a cada iteração é atualizado
			calculo *= base;
		}
		System.out.println(calculo);
		scan.close();
	}

}
