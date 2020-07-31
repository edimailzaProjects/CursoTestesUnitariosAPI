/*
 * AULA DE PASSAGEM DE PARÂMETROS
 * */

package com.edi.cursotestesunitarios;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTestsAula4 {
	
	@Mock
	List<String> lista;

	@Test
	public void quartoTesteMockito() {
		
		int size = 0;
	

//--------------------------TIMES------------------------------------
		
//		É possível verificar quantas vezes um método foi chamado
//		aqui eu quero que ele seja chamado uma única vez e o teste vai passar
//		
//		if (1==1) {
//		lista.size(); 
//		}
		//Mockito.verify(lista, Mockito.times(1)).size();

//		Aqui eu quero que ele seja chamado duas vezes e o teste não vai passar
//		pois eu quero que ele seja executado duas vezes
//		
//		Mockito.verify(lista, Mockito.times(2)).size();
		
//		Se eu fizer a chamada duas vezes, agora ele vai passar
//
//		if (1==1) {
//			lista.size();
//			lista.size();
//		}
//		
//		Mockito.verify(lista, Mockito.times(2)).size();
//
		
//-----------------------NEVER-------------------------------------------------
		
//		Se quiser que o método nunca tenha sido executado usa-se o Mockito.never()
//		Muito útil para a verificação de if's, por exemplo o if acima
		
		
//		if (1==2) {
//			lista.size();
//			lista.size();
//		}
		
		
//		Mockito.verify(lista, Mockito.never()).size();
//
		
//------------------------IN ORDER-------------------------------------------------
		
		//Exibe a quantidade de interações com o mock
		//Aqui eu não estou chamando nada do meu objeto lista
		//Estou verificando se utilizou o método size e o método add
		//Passa-se a instância mockada e ele retorna o inorder
		//O teste abaixo não vai passar porque nenhum dos métodos foram executados
		
//		InOrder inOrder = Mockito.inOrder(lista);
//		inOrder.verify(lista).size();
//		inOrder.verify(lista).add("");
		
		//Mas se os métodos forem chamados, então o teste passa
		//por serem executados nesta exata ordem
//		
//		lista.size();
//		lista.add("");
//		InOrder inOrder = Mockito.inOrder(lista);
//		inOrder.verify(lista).size();
//		inOrder.verify(lista).add("");
		
		//Já aqui abaixo, o teste falha por não estar na ordem correta
		
		lista.add("");
		lista.size();
		InOrder inOrder = Mockito.inOrder(lista);
		inOrder.verify(lista).size();
		inOrder.verify(lista).add("");

		
	}

}
