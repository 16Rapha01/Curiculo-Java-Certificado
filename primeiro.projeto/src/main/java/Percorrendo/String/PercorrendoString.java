package Percorrendo.String;

public class PercorrendoString {

	public static void main(String[] args) {

		String mensagem = "Eu amo trbalhar com softwear ";
		char letra = 'r';
		int contador = 0;

		for (int i = 0; i < mensagem.length(); i++) {

			if (mensagem.charAt(i) == letra){
				contador++;
				

			}

		}
		System.out.println("A letra " + letra + " Aparcece " + contador + " vezes ");

	}

}
