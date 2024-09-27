
public class PilaC {
	private int max = 50;
	private Cliente v[] = new Cliente[max+1];
	private int tope;
	
	
	public PilaC() {
		tope=0;
	}
	
	boolean esvacia() {
		if(tope ==0)
			return true;
		return false;
	}
	boolean esllena() {
		if(tope == max)
			return true;
		return false;
	}
	 int nroelem() {
		 return tope;
	 }
	 
	 void adicionar(Cliente C) {
		 if(!esllena()) {
			 tope++;
			 v[tope] = C;
		 }else
			 System.out.println("pila llena");
		 
	 }
	 Cliente eliminar() {
		 Cliente c =  new Cliente();
		 if(!esvacia()) {
			 c = v[tope];
			 tope--;
		 }else
			 System.out.println("pila vacia");
		 return c;
	 }
	 
	 void mostrar() {
		 Cliente elem = new Cliente();
		 if(esvacia())
			 System.out.println("pila vacia");
		 else {
			 System.out.println("\n Datos de la Pila");
			 PilaC aux =  new PilaC();
			 while(!esvacia()) {
				 elem = eliminar();
				 aux.adicionar(elem);
				 elem.mostrar();
			 }
			 vaciar(aux);
		 }
	 }
	 void llenar(int n) {
		 for (int i=1;i<=n;i++) {
			 Cliente  elem = new Cliente();
			 elem.leer();
			 adicionar(elem);
		 }
	 }
	 
	 void vaciar(PilaC A) {
		 while(!A.esvacia())
			 adicionar(A.eliminar());
	 }

}
