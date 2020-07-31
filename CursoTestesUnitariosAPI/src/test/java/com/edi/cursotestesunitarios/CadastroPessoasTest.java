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
		// o banco pessoas de getpessoas ainda n�o existe e o eclipse deve cri�-la

		// 2- Verifica��o
		Assertions.assertThat(cadastro.getPessoas()).isEmpty();
		// A primeira execu��o vai dar falha, ent�o � preciso ir na classe
		// CadastroPessoas
		// E criar um construtor com um arrayList dentro dele e a� sim, o teste vai
		// passar

	}

	@Test
	public void deveAdicionarUmaPessoa() {
		
		//o m�todo "adicionar" da classe Pessoa n�o existe ainda,
		//mas � escrito aqui primeiro e criado somente depois
		
		// Execu��o
		pessoa.setNome("Edi");
		cadastro.adicionar(pessoa);
		
		//Valida��o
		Assertions
			.assertThat(cadastro.getPessoas())
			.isNotEmpty() //n�o seja vazio
			.hasSize(1) //tem um elemento
			.contains(pessoa); //tem uma pessoa dentro do elemento
		
		//ao executar essa assertiva pela primeira vez vai dar que n�o est� vazio
		// vai falhar, pois o m�todo adicionar ainda n�o foi criado
		//dentro do m�todo, chame o this.pessoas.add(pessoa)	 
		
	}
	
	@Test//(expected = PessoaSemNotException.class)
	public void naoDeveAdicionarPessoaComNomeVazio() {
		//para este cenario falhar � preciso fazer a implementa��o
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
