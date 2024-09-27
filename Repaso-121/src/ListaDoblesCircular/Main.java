package ListaDoblesCircular;

public class Main {

	public static void main(String[] args) {
		ListaDobleCN a = new ListaDobleCN();
		a.adifinal(1);

		a.mostrar();
		
		
		/*
		System.out.println("\nAdicionar");
		adicionar(a);
		a.mostrar();
		*/

		
		System.out.println("\nEliminar");
		eliminar(a, 1);
		a.mostrar();
		
	}
	
	public static void eliminar(ListaDobleCN A,int n) {
		NodoN r = A.getP();
		int N = A.nroelem();
		for(int i=1;i<=N;i++) {
			if(r.getNumero() == n) {
				if(r==A.getP()) {
					if(A.nroelem() ==1) {
						r.setAnt(null);
						r.setSig(null);
						A.setP(null);
					}else {
						NodoN aux = r.getAnt();
						aux.setSig(r.getSig());
						r.getSig().setAnt(aux);
						r.setAnt(null);
						r.setSig(null);
						A.setP(aux.getSig());
						r=A.getP();
					}
				}
				else {
					NodoN aux = r.getAnt();           
					aux.setSig(r.getSig());
					r.getSig().setAnt(aux);
					r.setAnt(null);
					r.setSig(null);
					r = aux.getSig();
				}
			}else {
				r=r.getSig();
			}
		}

	}
	public static boolean fibonaci(int n) {
		int a =-1;
		int b = 1;
		int c =a+b;
		while(c<=n) {
			if(c==n)
				return true;
			a=b;
			b=c;
			c=a+b;
		}
		return false;
	}
	public static void  adicionar(ListaDobleCN A) {
		NodoN r = A.getP();
		while(r.getSig()!=A.getP()) {
			if(fibonaci(r.getNumero())) {
				if(A.nroelem()==1) {
					NodoN elem = new NodoN();
					elem.setNumero(-1);
					A.getP().setSig(elem);
					A.getP().setAnt(elem);
					elem.setAnt(A.getP());
					elem.setSig(A.getP());
				}else {
					NodoN elem =  new NodoN();
					elem.setNumero(-1);
					NodoN aux= r.getSig();
					r.setSig(elem);
					elem.setAnt(r);
					elem.setSig(aux);
					aux.setAnt(elem);
					r=aux;
				}
			}else {
				r=r.getSig();
			}
		}
		if(fibonaci(r.getNumero())) {
			NodoN elem = new NodoN();
			elem.setNumero(-1);
			r.setSig(elem);
			elem.setAnt(r);
			elem.setSig(A.getP());
			A.getP().setAnt(elem);
		}
	}

	
}
