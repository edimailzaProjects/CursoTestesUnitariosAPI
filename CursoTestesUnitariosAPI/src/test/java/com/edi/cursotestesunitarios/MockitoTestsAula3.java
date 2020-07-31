/*
 * AULA DE VERIFICAR SE UM M�TODO FOI CHAMADO
 * */

package com.edi.cursotestesunitarios;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTestsAula3 {
	
	@Mock
	List<String> lista;

	@Test
	public void terceiroTesteMockito() {

		//int size = lista.size(); //aqui o m�todo foi chamado diretamente dentro do teste

		
		//feature de verificar se o m�todo foi chamado � o verify
		//Mockito.verify(lista).size();
		
		//vamos supor que se tenha uma classe que chame o m�todo dentro da execu��o
		//vai verificar se chamou o m�todo size da lista
		//Este m�todo � �til para condicionais, exemplo:
		//�til para verificar m�todos void foram executados
		
		int size = 0;
//		if (1==2) {
//			lista.size(); // <--- aqui n�o vai chamar o m�todo size da lista
//		}
		
		if (1==1) {
			lista.size(); // <--- aqui vai chamar o m�todo size da lista
		}
		
		Mockito.verify(lista).size();
		
	}

}
