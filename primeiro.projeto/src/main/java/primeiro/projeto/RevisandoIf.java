package primeiro.projeto;

public class RevisandoIf {

	public static void main(String[] args) {
		
		int mediaPassar = 7;
		int notaUm = 3;
		int notaDois = 5;
		int notaTres = 6;
		int media = (notaUm + notaDois + notaTres) / 3;
		
		if(media >= mediaPassar) {
			
			System.out.println("Parab�ns fez sua obriga��o, sua media � " + (notaUm+notaDois+notaTres)/3);
			
		}else {
			
			System.out.println("infelizmente voc� � burro. sua media � " + (notaUm+notaDois+notaTres)/3); 
			
		}
		

	}

}
