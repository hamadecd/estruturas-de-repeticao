package EstruturasDeRepeticao;

public class Exercicio16 {

	public static void main(String[] args) {

		int anterior = 0, atual = 1, proximo = 0;
		System.out.print(anterior+" "+atual+" ");
		
		while (proximo <= 500) {
			proximo = anterior + atual;
			System.out.print(proximo+" ");
			anterior = atual;
			atual = proximo;
		}

		
	}

}
