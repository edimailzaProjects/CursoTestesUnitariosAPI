package com.edi.cursotestesunitarios;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class CadastroPessoasTest {

	CadastroPessoas cadastro;
	Pessoa pessoa;

	@Before
	public void setup() {
		cadastro = new CadastroPessoas();
		pessoa = new Pessoa();
	}

	@Test
	public void deveCriarOCadastroDePessoas() {
		// No TDD, a classe CadastroPessoas ainda nem deve existir
		// A classe deve ser criada na src/main/java
		// CadastroPessoas cadastro new CadastroPessoas();

		// O banco de pessoas deve estar vazio
		// o banco pessoas de getpessoas ainda não existe e o eclipse deve criá-la

		// 2- Verificação
		Assertions.assertThat(cadastro.getPessoas()).isEmpty();
		// A primeira execução vai dar falha, então é preciso ir na classe
		// CadastroPessoas
		// E criar um construtor com um arrayList dentro dele e aí sim, o teste vai
		// passar

	}

	@Test
	public void deveAdicionarUmaPessoa() {
		
		//o método "adicionar" da classe Pessoa não existe ainda,
		//mas é escrito aqui primeiro e criado somente depois
		
		// Execução
		pessoa.setNome("Edi");
		cadastro.adicionar(pessoa);
		
		//Validação
		Assertions
			.assertThat(cadastro.getPessoas())
			.isNotEmpty() //não seja vazio
			.hasSize(1) //tem um elemento
			.contains(pessoa); //tem uma pessoa dentro do elemento
		
		//ao executar essa assertiva pela primeira vez vai dar que não está vazio
		// vai falhar, pois o método adicionar ainda não foi criado
		//dentro do método, chame o this.pessoas.add(pessoa)	 
		
	}
	
	@Test//(expected = PessoaSemNotException.class)
	public void naoDeveAdicionarPessoaComNomeVazio() {
		//para este cenario falhar é preciso fazer a implementação
		cadastro.adicionar(pessoa);
	}
	
	@Test
	public void deveRemoverUmaPessoa() {
		pessoa.setNome("Flunano");
		cadastro.adicionar(pessoa);
		cadastro.remover(pessoa);
		
		Assertions.assertThat(cadastro.getPessoas()).isEmpty();
	}
	
	@Test//(expected = CadastroVazioException.class)
	public void deveLancarErroPessoaInexistente() {
		cadastro.remover(pessoa);
		
	}

}
