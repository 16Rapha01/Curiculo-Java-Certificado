package primeiro.projeto;

public class Aprovacao {

	public static void main(String[] args) {

		double nota1 = 10.0;
		double nota2 = 10.0;
		double nota3 = 10.0;
		double media = (nota1+nota2+nota3)/3;
		double notaAprovacao = 8.0;
		boolean falta = true;
		
		if (media >= notaAprovacao && falta ) {
			
			System.out.println("Aluno aprovado ");
			
		}else {
			
			System.out.println("Aluno reprovado ");
			
			
		}
		
	}

}
