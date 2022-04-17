package EstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		int numero = scan.nextInt();
		boolean varialvelControle = true;
		// se for informado numero 1 e 2 o programa já informa que é número primo sem entrar dentro do loop
		for(int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				System.out.println("Não é um número primo");
				varialvelControle = false;
				break;
			}
		}
		if(varialvelControle) System.out.println(numero+" é um número primo!");
		scan.close();
		
	}

}
