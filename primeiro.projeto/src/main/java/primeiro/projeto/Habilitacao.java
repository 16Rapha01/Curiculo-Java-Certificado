package primeiro.projeto;

public class Habilitacao {

	public static void main(String[] args) {
	
		String nome = "Lorenzo";
		int idade = 16;
		int idadePermitida = 18;
		boolean emancipado = true;
		
		//Valida a primeira condišao ou segunda condišao
		if (idade >= idadePermitida || emancipado ) {
			
			System.out.println("Voce pode tirar habilitašao " + nome + ".");
		}else {
			
			System.out.println("Voce nao pode tirar habilitacao " + nome + ".");
		}
		

	}

}
