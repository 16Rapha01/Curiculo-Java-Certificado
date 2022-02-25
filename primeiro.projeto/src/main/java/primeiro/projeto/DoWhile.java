package primeiro.projeto;

public class DoWhile {

	public static void main(String[] args) {

		int numero1 = 20;
		int numero2 = 20;

		do {
			System.out.println("entrei no while, o numero 1 vale " + numero1);

			numero1++;

		} while (numero1 < numero2);

		System.out.println("sai do while, o numero 1 vale " + numero1);

	}

}
