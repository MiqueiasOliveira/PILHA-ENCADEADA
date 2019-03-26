package PILHA;

public class No {
	
	private int numero;
	private No  anterior;
	
	public No(int numero) { 
		this.numero   = numero;
		this.anterior = null;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public No getAnterior() {
		return anterior;
	}

	public void setAnterior(No proximo) {
		this.anterior = proximo;
	}
}
