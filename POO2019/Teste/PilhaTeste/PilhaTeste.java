package PilhaTeste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Pilha.Pilha;

class PilhaTeste {
	@Test
	public void testCriaPilha() {
		Pilha p = new Pilha();
		
/*
 * ADICIONA UM ELEMENTO NA PILHA, OU SEJA, ADICONA O NUMERO AO TOPO DA PILHA. 
 */
		/**ADD PRIMEIRO NUMERO: 2**/
		p.Push(2);
		assertEquals(2,p.top().getNumero());
		
		/**ADD SEGUNDO NUMERO: 4**/
		p.Push(4);
		assertEquals(4,p.top().getNumero());
		
		/**ADD TERCEIRO NUMERO: -1**/
		p.Push(-1);
		assertEquals(-1,p.top().getNumero());
		
		/**ADD QUARTO NUMERO: -10**/
		p.Push(-10);
		assertEquals(-10,p.top().getNumero());
		
		/**ADD QUINTO NUMERO: 35**/
		p.Push(35);
		assertEquals(35,p.top().getNumero());
		
		/**ADD SEXTO NUMERO: 45**/
		p.Push(45);
		assertEquals(45,p.top().getNumero());
		
		/*
		 *	EXCLUI O ELEMENTO QUE ESTÁ NO TOPO DA PILHA.
		 *  OBSERVAR QUE O TOPO ATUAL ESTA COM O VALOR = 45.
		 *  A ORDEM DA PILHA É: 2 -> 4 -> -1 -> -10 -> 35 -> [45]
		 */
		
		/**EXCLUI SEXTO NUMERO: 45.
		 * A ORDEM DA PILHA AGORA É: 2 -> 4 -> -1 -> -10 -> [35]**/
		p.Pop();
		assertEquals(35, p.top().getNumero());
		
		/**EXCLUI QUINTO NUMERO: 35
		 * A ORDEM DA PILHA É: 2 -> 4 -> -1 -> [-10]**/
		p.Pop();
		assertEquals(-10, p.top().getNumero());
		
		/**EXCLUI QUARTO NUMERO: -10
		 * A ORDEM DA PILHA É: 2 -> 4 -> [-1]**/
		p.Pop();
		assertEquals(-1, p.top().getNumero());
		
		/**EXCLUI TERCEIRO NUMERO: -1
		 * A ORDEM DA PILHA É: 2 -> [4]**/
		p.Pop();
		assertEquals(4, p.top().getNumero());
		
		/**EXCLUI SEGUNDO NUMERO: 4
		 * A ORDEM DA PILHA É: [2]**/
		p.Pop();
		assertEquals(2, p.top().getNumero());
		
		/**EXCLUI PRIMEIRO NUMERO: 2
		 * A ORDEM DA PILHA É: [2]**/
		p.Pop();
		assertEquals(null, p.top());
	}
}
