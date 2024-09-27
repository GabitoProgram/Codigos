
public class PilaA {
	private int max=30;
	private Archivo v[] =  new Archivo[max+1];
	int tope;

	PilaA() {
		tope=0;
	}
	
	boolean esvacia() {
		if(tope==0) {
			return true;
		}
		return false;
	}
	
	boolean esllena() {
		if (tope==max) {
			return true;
		}
		return false;
	}
	
	int nroelementos() {
		return tope;
	}
	
	void adicionar(Archivo  a) {
		if (!this.esllena()) {
			tope++;  ///tope=tope+1;
			v[tope] = a;
		}
		else {
			System.out.println("La Pila LLena");
		}
	}
	
	Archivo eliminar() {
		Archivo a  = new Archivo();
		if(!esvacia()) {
			a=v[tope];
			tope--; //  tope=tope-1;
		}else {
			System.out.println("Pila vacia");
		}
		return (a);
	}
	void llenar(int c) {
		for(int i=1; i<=c;i++) {
			Archivo a = new Archivo();
			a.leer();
			this.adicionar(a);
		}
	}
	
	void mostrar() {
		Archivo a = new Archivo();
		if(this.esvacia())
			System.out.println("pila vacia");
		else {
			System.out.println("\n Archivos de la Pila");
			PilaA aux =  new PilaA();
			while(!esvacia()) {
				a = eliminar();
				aux.adicionar(a);
				a.mostrar();
			}
			vaciar(aux);
		}
	}
	
	void vaciar(PilaA a) {
		while(!a.esvacia())
			adicionar(a.eliminar());
	}

}
