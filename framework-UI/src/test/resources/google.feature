#Author: e2etreinamentos@e2etreinamentos.com.br


Feature: pesquisar google 
  Eu como usuario quero acessar o site para realizar uma pesquisa 

  
  Scenario: pesquisar o nome da escola no google
    Given dado que eu esteja no "https://www.e2etreinamentos.com.br"
    When pesquisar o nomde da escola 
    Then valido as informacoes 
    


