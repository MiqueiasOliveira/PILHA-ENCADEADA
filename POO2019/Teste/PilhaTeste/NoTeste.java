package PilhaTeste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Pilha.No;

class NoTeste {
	
	@Test
	public void testeNo() {
		//CRIANDO NOS COM OS SEUS VALORES NUMERICOS
		No no1 = new No(1);
		No no2 = new No(0);
		No no3 = new No(-1);
		No no4 = new No(15);
		
		assertEquals(1,no1.getNumero());
		assertEquals(0,no2.getNumero());
		assertEquals(-1,no3.getNumero());
		assertEquals(15,no4.getNumero());
	}
}

