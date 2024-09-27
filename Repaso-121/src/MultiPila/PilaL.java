package MultiPila;

import Pilas.Cuaderno;
import Pilas.PilaC;

public class PilaL {
	private int max = 30;
	private Libro v[] = new Libro[max + 1];
	int tope;

	PilaL() {
		tope = 0;
	}

	boolean esvacia() {
		if (tope == 0)
			return (true);
		return (false);
	}

	boolean esllena() {
		if (tope == max)
			return (true);
		return (false);
	}

	int nroelem() {
		return (tope);
	}

	void adicionar(Libro elem) {
		if (!this.esllena()) {
			tope++;
			v[tope] = elem;
		} else
			System.out.println("Pila llena");
	}

	Libro eliminar() {
		Libro elem = new Libro();
		if (!this.esvacia()) {
			elem = v[tope];
			tope--;
		} else
			System.out.println("Pila vacia");
		return (elem);
	}

	void mostrar() {
		Libro elem = new Libro();
		if (this.esvacia())
			System.out.println("Pila vacia");
		else {
			System.out.println("\n Libros de la Pila ");
			PilaL aux = new PilaL();
			while (!this.esvacia()) {
				elem = this.eliminar();
				aux.adicionar(elem);
				elem.mostrar();
			}
			this.vaciar(aux);
		}
	}

	void llenar(int n) {
		for (int i = 1; i <= n; i++) {
			Libro elem = new Libro();
			elem.leer();
			this.adicionar(elem);
		}
	}

	void vaciar(PilaL a) {
		while (!a.esvacia())
			this.adicionar(a.eliminar());

	}
}
