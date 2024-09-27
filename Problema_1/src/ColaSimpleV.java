
public class ColaSimpleV {
	private int max =100;
	private Ventas v[]= new Ventas[max+1];
	private int ini, fin;
	
	public ColaSimpleV() {
		ini = fin =0;
	}
	
	boolean esvacia() {
		if(ini ==0  && fin ==0)
			return true;
		return false;
	}
	
	boolean esllena() {
		if(fin == max)
			return true;
		return false;
	}
	
	int nroelem() {
		return fin-ini; 
	}
	
	void adicionar(Ventas A) {
		if(esllena())
			System.out.println("Cola Simple llena");
		else {
			fin = fin+1;
			v[fin] = A;
		}
	}
	
	Ventas eliminar() {
		Ventas elem =  new Ventas();
		if(!esvacia()) {
			ini++;
			elem = v[ini];
			if(ini==fin)
				ini=fin=0;
		}else
			System.out.println("Cola Simple vacia");
		return elem;
		
	}
	void mostrar() {
		Ventas elem =  new Ventas();
		if(esvacia()) {
			System.out.println("Cola Simple vacia");
		}else {
			System.out.println("\n Datos de la Cola Simple");
			ColaSimpleV aux = new ColaSimpleV();
			while(!esvacia()) {
				elem  = eliminar();
				aux.adicionar(elem);
				elem.mostrar();
			}
			vaciar(aux);
		}
	}
	
	void vaciar(ColaSimpleV A) {
		while(!A.esvacia())
			adicionar(A.eliminar());
	}
	void llenar(int n) {
		int i;
		for(i=1;i<=n;i++) {
			Ventas x = new Ventas();
			x.leer();
			adicionar(x);
		}
	}
	

}
