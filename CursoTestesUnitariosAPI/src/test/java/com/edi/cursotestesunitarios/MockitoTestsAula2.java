/*
 * AULA DE ANOTATIONS
 * */


package com.edi.cursotestesunitarios;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class) // <---------------------------
public class MockitoTestsAula2 {

	// � poss�vel mockar uma lista fazendo uso de anotations
	//Por�m, para rodar, � preciso colocar o @RunWith em cima da classe
	//com isto ele processar� as anotations @Mocks e vai criar todos os mocks
	
	@Mock// <-----------------------------------------------
	List<String> lista;

	@Test
	public void segundoTesteMockito() {

		Mockito.when(lista.size()).thenReturn(20);

		int size = lista.size();

		Assertions.assertThat(size).isEqualTo(20);
	}

}
