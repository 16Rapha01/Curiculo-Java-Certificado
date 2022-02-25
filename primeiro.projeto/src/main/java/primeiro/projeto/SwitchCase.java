package primeiro.projeto;

public class SwitchCase {

	public static void main(String[] args) {

		// 1 Vista |2 Credito | 3 Boleto

		int opcao = 1;
		double valorProduto = 5.000;
		double saldoCliente = 4.999;

		switch (opcao) {

		case 1:
			System.out.println("voce escolheu a opção vista");

			if (saldoCliente >= valorProduto) {

				System.out.println("compra reliazda com sucesso,  seu saldo é de " + saldoCliente);

			} else {

				System.out.println("compra negada, consulte ao banco");

			}

			break;
		case 2:
			System.out.println("voce escolheu a opção credito");

			if (saldoCliente >= valorProduto) {

				System.out.println("compra reliazda com sucesso");

			} else {

				System.out.println("compra negada, consulte ao banco");

			}
			break;

		case 3:
			System.out.println("voce escolheu a opção boleto");

			if (saldoCliente >= valorProduto) {

				System.out.println("compra reliazda com sucesso");

			} else {

				System.out.println("compra negada, consulte ao banco");

			}
			break;
		default:
			System.out.println("opção inavlida ");
			break;

		}

	}

}
