package Herança.Carro;

public class ExecutarAcoes {

	public static void main(String[] args) {
		
		
		ExemploBasico simples = new ExemploBasico();
		ExemploCarroAvancado especiais = new ExemploCarroAvancado();
		
		
		simples.ligar();
		simples.desligar();
		especiais.ligar();


	}

}
