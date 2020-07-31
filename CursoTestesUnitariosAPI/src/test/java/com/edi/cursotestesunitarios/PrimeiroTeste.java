package com.edi.cursotestesunitarios;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrimeiroTeste {
	
	Calculadora calculadora;
	int num1 = 10, num2 = 5;
	
	@Before
	public void setup() {
		calculadora = new Calculadora();
	}

	@Test
	public void deveSomarDoisNumeros() {

		// 1 - Cen�rio	
		calculadora.somar(10,5);

		// 2- Execu��es
		int resultado = calculadora.somar(num1,num2);

		// 3 - Verifica��es
		Assert.assertEquals(15, resultado);
		Assertions.assertThat(resultado).isEqualTo(15);
	}
	
	
	@Test//(expected = RuntimeException.class)
	public void naoDeveSomarNumerosNegativos() {
		// 2- Execu��es
		calculadora.somar(-10,-5);
		
	}
	
	@Test
	public void deveSubtrairDoisNumeros() {
		// 2- Execu��es
		int resultado = calculadora.subtrair(num1,num2);
		Assertions.assertThat(resultado).isEqualTo(5);
		
	}
	
	@Test
	public void deveMultiplicarDoisNumeros() {
		// 2- Execu��es
		float resultado = calculadora.multiplicar(num1,num2);
		Assertions.assertThat(resultado).isEqualTo(50);
		
	}
	
	@Test//(expected = ArithmeticException.class)
	public void naoDeveDividirPorZero() {

		// 2- Execu��es
		calculadora.dividir(10,0);	
	}

}

class Calculadora{
	
	int somar(int num1, int num2) {
		if(num1<0 || num2 <0) {
			throw new RuntimeException("N�o � permitido somar n�meros negativos!");
		}
		return num1 + num2;
	}
	
	int subtrair(int num1, int num2) {
		return num1 - num2;
	}
	
	float multiplicar(int num1, int num2) {
		return num1 * num2;
	}
	
	int dividir(int num1, int num2) {
		if (num2 == 0) {
			throw new ArithmeticException();
		}
		return num1 / num2;
	}
}
