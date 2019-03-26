package PILHA;

public class Pilha {
	private No  topo;
	
	public Pilha(){
		
	}
/*
 * FUCAO RESPONSAVEL POR ADICONAR UM NUMERO INTEIRO AO TOPO DA PILHA.
 * VERIFICA SE A PILHA ESTA VAZIA OU NAO.
 * (1) CASO ESTEJA VAZIA,
 * 	   E CRIADO O ELEMENTO "TOPO" E ADICIONA AO ATRIBUTO NUMERO O SEU
 * 	   RESPECTIVO VALOR INTEIRO (n); (LINHAS 17,18);
 * (2) CASO NAO    VAZIA,
 *     E CRIADO UM NOVO NO, CUJO SEU ANTERIOR SER� O ELEMENTO TOPO.
 *     ASSIM, O TOPO DA PILHA SER� O NOVO ELEMENTO. ISSO FOI NECES
 *     SESS�RIO PARA NAO PERDER OS DADOS ANTERIORES DA PILHA. 
 */

	public void Push(int n) {			
		if(isEmpyt() == true) {
			topo = new No(n);
			System.out.println("TOPO = "+topo.getNumero()+" ANTERIOR: "+topo.getAnterior());
		}
		else {
			No novoNo = new No(n);
			novoNo.setAnterior(topo);
			topo = novoNo;		
			System.out.println("TOPO = "+topo.getNumero()+" ANTERIOR: "+topo.getAnterior().getNumero());
		}	
	}
	
/* FUNCAO RESPONSAVEL POR REMOVER UM NUMERO DO TOPO DA PILHA. 
 * OBSERVER QUE SAO REALIZADOS TR�S TESTES. 
 *    (1) VERIFICA SE O TOPO ESTA VAZIO; (LINHA 33)
 *    (2) CASO CONTRARIO,
 *        VERIFICA SE O TOPO � O UNICO ELEMENTO NA PILHA,
 *        CASO N�O TENHA UM ELEMENTO ANTERIOR, O TOPO � REMOVIDO (LINHA 35,36).
 *    (3) O TOPO POSSUI UM ELEMENTO ANTERIOR: (LINHA 38)
 *    	  O ELEMENTO ANTERIOR AGORA SER� O TOPO (LINHA 39,40)	
 */
	
	public void Pop() {					
		No noAnterior; 
		if(isEmpyt() == true)
			System.out.println("N�O H� ELEMENTOS NA PILHA");
		else {
			if(topo.getAnterior() == null) {
				topo = null;
			}else {
				noAnterior= topo.getAnterior();
				topo = noAnterior;
			}
		}
	}
	
//FUNCAO RESPONSAVEL POR RETORNAR O ELEMENTO DO TOPO DA PILHA
	
	public No top() {					
		return topo;
	}
	
//FUNCAO RESPONSAVEL POR VERIFICAR SE A PILHA EST� VAZIA OU NAO.
	public boolean isEmpyt() {
		return (topo == null);
	}
}
