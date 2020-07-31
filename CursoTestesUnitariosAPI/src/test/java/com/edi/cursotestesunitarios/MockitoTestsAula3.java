/*
 * AULA DE VERIFICAR SE UM MÉTODO FOI CHAMADO
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

		//int size = lista.size(); //aqui o método foi chamado diretamente dentro do teste

		
		//feature de verificar se o método foi chamado é o verify
		//Mockito.verify(lista).size();
		
		//vamos supor que se tenha uma classe que chame o método dentro da execução
		//vai verificar se chamou o método size da lista
		//Este método é útil para condicionais, exemplo:
		//útil para verificar métodos void foram executados
		
		int size = 0;
//		if (1==2) {
//			lista.size(); // <--- aqui não vai chamar o método size da lista
//		}
		
		if (1==1) {
			lista.size(); // <--- aqui vai chamar o método size da lista
		}
		
		Mockito.verify(lista).size();
		
	}

}
