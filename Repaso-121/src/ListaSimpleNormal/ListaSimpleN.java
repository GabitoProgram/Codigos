package ListaSimpleNormal;
import java.util.*;

public class ListaSimpleN {

	private NodoN p;

	public ListaSimpleN() {
		p = null;
	}

	public NodoN getP() {
		return p;
	}

	public void setP(NodoN p) {
		this.p = p;
	}

	public int nroNodos() {
		NodoN w = getP();
		int c = 0;
		while (w != null) {
			c = c + 1;
			w = w.getSig();
		}
		return c;
	}

	public void adifinal(int z) {
		NodoN nue = new NodoN();
		nue.setNumero(z);
		if (getP() == null)
			setP(nue);
		else {
			NodoN w = getP();
			while (w.getSig() != null)
				w = w.getSig();
			w.setSig(nue);
		}
	}

	public void leer2(int n) {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			adifinal(x);
		}
	}

	public void mostrar() {
		NodoN k = getP();
		while (k != null) {
			System.out.println(k.getNumero());
			k = k.getSig();
		}
	}
}
