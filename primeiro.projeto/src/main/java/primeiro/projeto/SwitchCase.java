package primeiro.projeto;

public class SwitchCase {

	public static void main(String[] args) {

		// 1 Vista |2 Credito | 3 Boleto

		int opcao = 1;
		double valorProduto = 5.000;
		double saldoCliente = 4.999;

		switch (opcao) {

		case 1:
			System.out.println("voce escolheu a op��o vista");

			if (saldoCliente >= valorProduto) {

				System.out.println("compra reliazda com sucesso,  seu saldo � de " + saldoCliente);

			} else {

				System.out.println("compra negada, consulte ao banco");

			}

			break;
		case 2:
			System.out.println("voce escolheu a op��o credito");

			if (saldoCliente >= valorProduto) {

				System.out.println("compra reliazda com sucesso");

			} else {

				System.out.println("compra negada, consulte ao banco");

			}
			break;

		case 3:
			System.out.println("voce escolheu a op��o boleto");

			if (saldoCliente >= valorProduto) {

				System.out.println("compra reliazda com sucesso");

			} else {

				System.out.println("compra negada, consulte ao banco");

			}
			break;
		default:
			System.out.println("op��o inavlida ");
			break;

		}

	}

}
