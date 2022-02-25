package condicoesEslseIf;

public class Pagamento {

	public static void main(String[] args) {

		/*
		 * 1-Debito 2-Pix 3-Ted 4-Credito 5-boleto
		 */

		int opcPagamento = 7;

		if (opcPagamento == 1) {

			System.out.println("pagamento realizado no debito");

		} else if (opcPagamento == 2) {

			System.out.println("pagamento realizado via pix");

		} else if (opcPagamento == 3) {

			System.out.println("pagamento realizado via ted");

		} else if (opcPagamento == 4) {

			System.out.println("pagamento realizado via Credito");

		} else if (opcPagamento == 5) {

			System.out.println("pagamento realizado via Boleto");

		} else {
			System.out.println("opcao invalida digite 1 a 5");

		}

	}

}
