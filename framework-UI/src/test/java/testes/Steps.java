package testes;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {

	Metodos Metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();
	
	
	

	@Given("dado que eu esteja no {string}")
	public void dado_que_eu_esteja_no(String appUrl) {
		Metodos.abrirNavegador(appUrl, "https://www.E2ETreinamentos.com.br");
		
		
		
		
	}

	@When("pesquisar o nomde da escola")
	public void pesquisar_o_nomde_da_escola() {
		
		Metodos.escrever("E2E treinamentos", el.getPesquisar());
		Metodos.submit(el.getPesquisar());
		
		
		
		

	}

	@Then("valido as informacoes")
	public void valido_as_informacoes() {

		Metodos.fecharNavegador("encerrando o teste"); 

	}

}
