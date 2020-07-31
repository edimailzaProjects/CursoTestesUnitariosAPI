package com.edi.cursotestesunitarios;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {

	private List<Pessoa> pessoas;
	
	//Atl+Shift+S pra criar o construtor vazio
	//� preciso que ele receba um ArrayList
	public CadastroPessoas() {
		this.pessoas = new ArrayList<>();
	}


	//A classe Pessoa ainda n�o existia e teve que ser criada
	//a vari�vel do this chamada pessoas tamb�m n�o existia, e teve que ser criada
	public List<Pessoa> getPessoas() {
		return this.pessoas;
	}

	//esse This significa:
	//Adicione uma pessoa na lista de pessoas
	public void adicionar(Pessoa pessoa) {
		if(pessoa.getNome() == null) {
			throw new PessoaSemNotException();
		}
		this.pessoas.add(pessoa);
		
	}


	public void remover(Pessoa pessoa){
		if(!this.pessoas.contains(pessoa)) {
			throw new CadastroVazioException();
		}
		this.pessoas.remove(pessoa);
	}

	

}
