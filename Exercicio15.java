package EstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = scan.nextInt();
		// declaração das variáveis, e inicialização dos valores de anterior e atual
		int anterior = 1, atual = 1, proximo;
		// imprime na tela os dois primeiros valores da sequência já definidos na declaração da variável
		System.out.print(anterior+" "+atual+" ");
		// i recebe 3 porque os 2 primeiros números da sequência já estão definidos
		for (int i = 3; i <= numero; i++) {
			proximo = anterior + atual;
			System.out.print(proximo+" ");
			anterior = atual;
			atual = proximo;
		}

		scan.close();

	}

}
