package ListaDoblesSimples;

public class Main {

	public static void main(String[] args) {
		ListaDobleSimpleN a = new ListaDobleSimpleN();
		a.adifinal(1);
		a.adifinal(2);
		a.adifinal(3);
		a.adifinal(4);
		a.adifinal(5);
		a.mostrar();
		
		
		System.out.println("\nEliminar");
		eliminar(a,1);
		eliminar(a,3);
		a.mostrar();
	
		/*
		System.out.println("\nAdicionar");
		adicionr(a);
		a.mostrar();
		*/
	
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
	
	public static void eliminar(ListaDobleSimpleN A, int t) {
		NodoN r = A.getP();
		while(r!=null) {
			if(r.getNumero() == t) {
				if(r==A.getP()) {
					
					if(A.nronodos() == 1) {
						r.setSig(null);
						r.setAnt(null);
						r=null;
						A.setP(null);
					}else {
						A.setP(r.getSig());
						A.getP().setAnt(null);
						r.setSig(null);
						r.setAnt(null);
						r=A.getP();
					}
				}else {
					NodoN aux =  r.getAnt();
					aux.setSig(r.getSig());
					if(r.getSig() != null) {	
						r.getSig().setAnt(aux);
					}
					r.setAnt(null);
					r.setSig(null);
					r = aux.getSig();
				}
			}else {
				r=r.getSig();
			}
			
		}
	}
	
	public static void adicionr(ListaDobleSimpleN A) {
		NodoN r = A.getP();
		while(r!=null) {
			if(fibonaci(r.getNumero())) {

					NodoN aux = r.getSig();
					NodoN elem = new NodoN();
					elem.setNumero(-1);
					if(aux!=null) {
						elem.setSig(aux);
						aux.setAnt(elem);
					}else {
						elem.setSig(null);
					}
					r.setSig(elem);
					elem.setAnt(r);
					r=elem.getSig();
			}else {
				r=r.getSig();
			}
		}
	}
}
