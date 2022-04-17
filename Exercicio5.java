package EstruturasDeRepeticao;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// variável para verificar se usuário vai querer executar novamente
		String repetir = "";

		do {
			System.out.println("Informe a população da cidade A");
			double a = scan.nextDouble();
			
			System.out.println("Informe a população da cidade B");
			double b = scan.nextDouble();
			// sai do loop e encerra a aplicação se populações forem iguais
			if (a == b) {
				System.out.println("Os valores informados para as cidades foram iguais.");
				break;
			}
			// divide por 100 para transformar em porcentagem
			System.out.println("Informe a taxa de crescimento da cidade A");
			double taxaA = scan.nextDouble() / 100;
			
			System.out.println("Informe a taxa de crescimento da cidade B");
			double taxaB = scan.nextDouble() / 100;
			// armazena a quantidade que representa os anos passados
			int i = 0;

			if (a < b) {
				do {
					i ++;
					a += (a * taxaA);
					b += (b * taxaB);
				} while (a < b);
				System.out.println("Quantidade de anos passados para que a população da cidade A seja igual ou maior que da cidade B: "+i);
			}
			if (b > a) {
				do {
					i ++;
					a += (a * taxaA);
					b += (b * taxaB);
				} while (b > a);
				System.out.println("Quantidade de anos passados para que a população da cidade B seja igual ou maior que da cidade A: "+i);
			}
			
			System.out.println("Deseja realizar mais uma operação S/N?");
			repetir = scan.next();
		// caso usuário digite qualquer outro valor diferente de 's' a aplicação encerra	
		} while (!repetir.equalsIgnoreCase("n") && (repetir.equalsIgnoreCase("s")));
		
		
		System.out.println("Programa encerrado!");
		scan.close();

	}

}
