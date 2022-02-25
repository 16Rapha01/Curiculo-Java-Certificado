package Scanner.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArreyList {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<String> cursos = new ArrayList<String>();
		cursos.add("Automação de testes de UI");
		cursos.add("Automação de testes de API");
		cursos.add("Automação de testes Unitarios");

		String opcao;
		System.out.println("Digite 1 para cadastrar um curso ou qualquer tecla para exibir lista ");
		opcao = scanner.nextLine();

		while (opcao.equals("1")) {
			cursos.remove(1);
			System.out.println(" Digite o curso desejado");
			String curso = scanner.nextLine();
			cursos.add(curso);
			
			

			System.out.println("Digite 1 para cadastrar um curso ou qualquer tecla para exibir lista ");
			opcao = scanner.nextLine();
			
			
		}
		System.out.println("Cursos cadatrados: \n" + cursos);
		

	}

}
