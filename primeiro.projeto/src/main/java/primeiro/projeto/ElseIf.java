package primeiro.projeto;

public class ElseIf {
	
	
	private static int adicional;

	public static void main(String[] args) {
		
		
		boolean dinheiro = true;
		boolean credito = false;
		boolean boleto = false;
		int preco = 10000;
		
		
		System.out.println("********************************************");
		System.out.println("**************E2E Treinamentos**************");
		System.out.println("********************************************");
		System.out.println("");
		
		
		if(dinheiro ) { 
			int desconto = 100;
			preco = preco - desconto;
			
			System.out.println("Parabéns pela aquizição no valor R$ " +preco+ ".");
			
		}else if(credito) {
			int adicional = 1000;
			preco = preco + adicional;
			System.out.println("Parabéns pela aquizição no valor R$ " +preco+ ".");
			
		}else if(boleto) {
			System.out.println("Parabéns pela aquizição no valor R$ " +preco+ ".");
			
			
		}else {
			System.out.println("Você nao tem possibilidades de efetuar a compra no valor de R$ " +preco+ ".");
			
		}
			
    	}
	
	

}
