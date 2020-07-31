/*
 * AULA SOBRE O NOVO JUNIT 5 JUPTER
 * TESTE DE CADASTRO DE PESSOAS REESCRITO
 * */

package com.edi.cursotestesunitarios;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class JUnit5TestsAula1 {
	
	@Mock
	CadastroPessoas cadastro;
	Pessoa pessoa;


	@Test
	@DisplayName("Deve criar o cadastro de pessoas")
	public void deveCriarOCadastroDePessoas() {
		Assertions.assertThat(cadastro.getPessoas()).isEmpty();
	}

	@Test
	@DisplayName("Deve adicionar uma pessoa")
	public void deveAdicionarUmaPessoa() {
	
		pessoa.setNome("Edi");
		cadastro.adicionar(pessoa);
		
		Assertions
			.assertThat(cadastro.getPessoas())
			.isNotEmpty() //não seja vazio
			.hasSize(1) //tem um elemento
			.contains(pessoa); //tem uma pessoa dentro do elemento
	}
	
	
	@Test
	@DisplayName("Nao deve adicionar pessoa com nome vazio")
	public void naoDeveAdicionarPessoaComNomeVazio() {
		
		assertThrows(PessoaSemNotException.class, ()-> cadastro.adicionar(pessoa));
	}
	
	@Test
	@DisplayName("Deve remover uma pessoa")
	public void deveRemoverUmaPessoa() {

		pessoa.setNome("Flunano");
		cadastro.adicionar(pessoa);
		cadastro.remover(pessoa);
		
		Assertions.assertThat(cadastro.getPessoas()).isEmpty();
	}
	
	@Test
	@DisplayName("Deve lançar erro de pessoa inexistente")
	public void deveLancarErroPessoaInexistente() {
		assertThrows(CadastroVazioException.class, ()-> cadastro.remover(pessoa));
		
	}

}
