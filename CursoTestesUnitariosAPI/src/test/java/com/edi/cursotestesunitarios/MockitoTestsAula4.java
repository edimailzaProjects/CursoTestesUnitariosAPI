/*
 * AULA DE PASSAGEM DE PAR�METROS
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
		
//		� poss�vel verificar quantas vezes um m�todo foi chamado
//		aqui eu quero que ele seja chamado uma �nica vez e o teste vai passar
//		
//		if (1==1) {
//		lista.size(); 
//		}
		//Mockito.verify(lista, Mockito.times(1)).size();

//		Aqui eu quero que ele seja chamado duas vezes e o teste n�o vai passar
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
		
//		Se quiser que o m�todo nunca tenha sido executado usa-se o Mockito.never()
//		Muito �til para a verifica��o de if's, por exemplo o if acima
		
		
//		if (1==2) {
//			lista.size();
//			lista.size();
//		}
		
		
//		Mockito.verify(lista, Mockito.never()).size();
//
		
//------------------------IN ORDER-------------------------------------------------
		
		//Exibe a quantidade de intera��es com o mock
		//Aqui eu n�o estou chamando nada do meu objeto lista
		//Estou verificando se utilizou o m�todo size e o m�todo add
		//Passa-se a inst�ncia mockada e ele retorna o inorder
		//O teste abaixo n�o vai passar porque nenhum dos m�todos foram executados
		
//		InOrder inOrder = Mockito.inOrder(lista);
//		inOrder.verify(lista).size();
//		inOrder.verify(lista).add("");
		
		//Mas se os m�todos forem chamados, ent�o o teste passa
		//por serem executados nesta exata ordem
//		
//		lista.size();
//		lista.add("");
//		InOrder inOrder = Mockito.inOrder(lista);
//		inOrder.verify(lista).size();
//		inOrder.verify(lista).add("");
		
		//J� aqui abaixo, o teste falha por n�o estar na ordem correta
		
		lista.add("");
		lista.size();
		InOrder inOrder = Mockito.inOrder(lista);
		inOrder.verify(lista).size();
		inOrder.verify(lista).add("");

		
	}

}
