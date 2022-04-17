package EstruturasDeRepeticao;

public class Exercicio4 {

	public static void main(String[] args) {

		double a = 80000;
		double b = 200000;
		double taxaA = 0.03;
		double taxaB = 0.015;

		int qtde_anos = 0;
		while (a < b) {
			// toda vez que entra no loop, quantidade de anos incrementa 1
			qtde_anos ++;
			a += (a * taxaA);
			b += (b * taxaB);
		}

		String resultado_a = String.format("%.0f", a); // formatando para que não apareça nenhuma casa decimal
		String resultado_b = String.format("%.0f", b);
		System.out.println("Quantidade de anos passados para que a população de A ultrapasse ou iguale a população de B: " + qtde_anos);
		System.out.println("A população de A agora é " + resultado_a);
		System.out.println("A população de B agora é " + resultado_b);

	}

}
