package ListasSimpleCircular;

public class NodoN {
	private int numero;
	private NodoN sig;

	public NodoN() {
		sig = null;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public NodoN getSig() {
		return sig;
	}

	public void setSig(NodoN sig) {
		this.sig = sig;
	}

}
