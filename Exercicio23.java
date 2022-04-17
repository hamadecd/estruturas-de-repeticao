package EstruturasDeRepeticao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número inteiro maior do que 1: ");
		int numero = scan.nextInt();
		List<Integer> lista = new ArrayList<>();
		
		// PRECISA OTIMIZAR

		if(numero == 2) {
			System.out.println("2 é primo e não foi preciso nenhuma divisão para achar a resposta.");
		} else if(numero == 3) {
			System.out.println("2 e 3 são números primos e não foi preciso nenhuma divisão para achar a resposta.");
		} else if(numero <= 5) {
			System.out.println("2, 3 e 5 são números primos e não foi preciso nenhuma divisão para achar a resposta.");
		} else if(numero <= 7) {
			System.out.println("2, 3, 5 e 7 são números primos e não foi preciso nenhuma divisão para achar a resposta.");
		} else if(numero > 7) {
			lista.add(2);
			lista.add(3);
			lista.add(5);
			lista.add(7);
			for(int i = 8; i <= numero; i++) {
				if(i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
					lista.add(i);
				}
			}
			System.out.println("números primos: \n"+lista);
			System.out.println("Núumero de divisões realizadas: " + (numero-7));
		} else {
			System.out.println("Programa encerrado. Digite um número válido!");
		}
		scan.close();

	}

}
