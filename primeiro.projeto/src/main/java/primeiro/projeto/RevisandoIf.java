package primeiro.projeto;

public class RevisandoIf {

	public static void main(String[] args) {
		
		int mediaPassar = 7;
		int notaUm = 3;
		int notaDois = 5;
		int notaTres = 6;
		int media = (notaUm + notaDois + notaTres) / 3;
		
		if(media >= mediaPassar) {
			
			System.out.println("Parabéns fez sua obrigação, sua media é " + (notaUm+notaDois+notaTres)/3);
			
		}else {
			
			System.out.println("infelizmente você é burro. sua media é " + (notaUm+notaDois+notaTres)/3); 
			
		}
		

	}

}
