package EstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero1 = scan.nextInt();
		System.out.print("Digite outro número: ");
		int numero2 = scan.nextInt();
		int soma = 0;
		
		for(int i = numero1+1; i < numero2; i++) {
			System.out.print(i + " ");
			soma += i;
		}
		
		//Altere o programa anterior para mostrar no final a soma dos números.
		
		System.out.print("\nA soma dos números "+soma);
		scan.close();
	}

}
