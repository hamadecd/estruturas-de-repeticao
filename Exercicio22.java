package EstruturasDeRepeticao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		// variável para armazenar vários valores do tipo inteiro
		List<Integer> lista = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int numero = scan.nextInt();
		boolean varialvelControle = true;
		for(int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				lista.add(i);
				varialvelControle = false;
			}
		}
		if(varialvelControle) {
			System.out.println(numero+" é um número primo!");
		} else {
			System.out.println(numero+" não é número primo porque é divisível também por: \n"+lista);
		}
		scan.close();

	}

}
