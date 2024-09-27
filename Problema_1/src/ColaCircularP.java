
public class ColaCircularP {
	private int max=50;
	private Productos v[]= new Productos[max+1];
	private int ini,fin;

	public ColaCircularP() {
		ini = fin =0;
	}
	int nroelem() {
		return((max+fin-ini)%max);
	}
	
	boolean esvacia() {
		if(nroelem()==0)
			return true;
		return false;
	}
	boolean esllena() {
		if(nroelem() == max-1)
			return true;
		return false;
	}
	void adicionar(Productos elem) {
		if(!esllena()) {
			fin=(fin+1)%max;
			v[fin] = elem;
		}else
			System.out.println("la cola circular esta llena");
	}
	Productos eliminar() {
		Productos elem=  new Productos();
		if(!esvacia()) {
			ini = (ini+1)%max;
			elem =v[ini];
			if(nroelem()==0)
				ini=fin=0;
		}else
			System.out.println("cola circular vacia");
		return elem;
	}
	void mostrar() {
		Productos  elem =  new Productos();
		if(esvacia())
			System.out.println("cola circualar vacia");
		else {
			System.out.println("\n Datos  de la Cola");
			ColaCircularP aux  =  new ColaCircularP();
			while(!esvacia()) {
				elem =  eliminar();
				aux.adicionar(elem);
				elem.mostrar();
			}
			while(!aux.esvacia()) {
				elem = aux.eliminar();
				adicionar(elem);
			}
		}
	}
	void llenar(int n) {
		int i;
		for(i=1;i<=n;i++) {
			Productos elem =  new Productos();
			elem.leer();
			adicionar(elem);
		}
	}
	void vaciar(ColaCircularP A) {
		while(!A.esvacia()) {
			adicionar(A.eliminar());
		}
	}

}
