/*
 * AULA INTRODUTÓRIA
 * */


package com.edi.cursotestesunitarios;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;

public class MockitoTestsAula1 {
	
	@Test
	public void primeiroTesteMockito() {
		//Esta forma de lista abaixo não funciona para a aplicação abaixo pois
		//pois define-se que ela é da instância lista
		//se eu chamar de outra instância ela não retornará 20
		
		List<String> outraLista = new ArrayList();
		
		//Ele vai criar uma instância de ArrayList Mockada
		List<String> lista = Mockito.mock(ArrayList.class);
		
		//quando se cria a lista, ela é vazia
		//O mockito permite manipular os elementos dentro da lista
		
		//Simular que a lista possui 20 elementos
		//quando eu executar o método lista.size()
		//então retorne 20
		
		Mockito.when(lista.size()).thenReturn(20);
		
		//aqui se faz a chamada para o mock
		int size = lista.size();
		
		Assertions.assertThat(size).isEqualTo(20);
		
		//demonstrativo das duas listas
		//a primeira retorna o valor default
		//a segunda retorna os vinte elementos
		System.out.println(outraLista);
		System.err.println("--------");
		System.out.println(size);
		
		
		//O mock não é um objeto real
		//ele vai retornar os objetos default a menos que
		//os objetos dejam definidos
	}

}
