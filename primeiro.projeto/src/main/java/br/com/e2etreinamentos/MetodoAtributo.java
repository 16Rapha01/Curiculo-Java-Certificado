package br.com.e2etreinamentos;

public class MetodoAtributo {
	
	int idade;
	String nome;

	public void digiteSuaIdade(int idade) {

		System.out.println("A idade digitada é " + idade);

	}

	public String digiteSeunome(String nome) {

		System.out.println("O nome digitado é " + nome);

		return nome;

	}

	public void informeDados(int idade, String nome) {
		this.nome = nome;
		this.idade = idade;
		System.out.println("O nomde cadastrado é " + this.nome + "e a idade " + this.idade);
		
	}
	
         public void consultaDados() {
	    System.out.println("Nome cadastrado foi " + this.nome + "A idade cadastrada foi " + this.idade);
	
}

}
