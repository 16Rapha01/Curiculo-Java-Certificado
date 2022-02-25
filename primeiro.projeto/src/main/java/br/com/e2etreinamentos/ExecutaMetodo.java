package br.com.e2etreinamentos;

public class ExecutaMetodo {

	public static void main(String[] args) {

		MetodoVazio metodo = new MetodoVazio();
		MetodoRetorono retorno = new MetodoRetorono();
        MetodoAtributo atributo = new MetodoAtributo();
        
        
		// metodo.mensagem();
		//System.out.println("O nome retornado pelo metodo é " + retorno.nome()); 
        //atributo.digiteSeunome("rapha");
        //atributo.digiteSuaIdade(19);
        atributo.informeDados(19, "rapha");
        atributo.consultaDados();
        

	}

}
