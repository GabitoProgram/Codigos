package ListasSimpleCircular;

public class Main {

	public static void main(String[] args) {
		ListaSimpleCircularN a = new ListaSimpleCircularN();
		a.adiprimero(1);
		a.adiprimero(2);
		a.adiprimero(3);
		a.adiprimero(4);
		a.adiprimero(5);
		a.mostrar();
		
		System.out.println("\ninciso 1");
		inciso1(a);
		
		System.out.println("\nInciso 2");
		inciso2(a);
		a.mostrar();
		
		
		System.out.println("\nEliminar");
		eliminar(a, 5);
		eliminar(a, 3);
		a.mostrar();

	}
	
	public static void inciso1(ListaSimpleCircularN a) {
		NodoN r = a.getP();
		while(r.getSig()!=a.getP()) {
			System.out.println(r.getNumero());
			r=r.getSig();
		}
		System.out.println(r.getNumero());
	}
	
	
	public static void inciso2(ListaSimpleCircularN A) {
		NodoN r = A.getP();
		while(r.getSig()!= A.getP()) {
			if(fibonaci(r.getNumero())) {
				NodoN a= new NodoN();
				a.setNumero(-1);
				a.setSig(r.getSig());
				r.setSig(a);
				r = a.getSig();
			}else
				r = r.getSig();
		}
		if(fibonaci(r.getNumero())) {
			NodoN a = new NodoN();
			a.setNumero(-1);
			r.setSig(a);
			a.setSig(A.getP());
		}
		
		
		
	}
	
	public static void eliminar(ListaSimpleCircularN A,int x) {
		NodoN r = A.getP();
		NodoN aux = r;
		while(r.getSig()!=A.getP()) {
			if(r.getNumero() ==x) {
				if(r ==A.getP()) {
					r=r.getSig();
					A.setP(r);
					aux=r;
				}else {
					aux.setSig(r.getSig());
					r.setSig(null);
					r = aux.getSig();
				}
			}else {
				aux=r;
				r=r.getSig();
			}
		}
		aux.setSig(r.getSig());
		r.setSig(null);
	}
	
	public static  boolean fibonaci(int x) {
		int a = -1;
		int b =1;
		int c=a+b;
		while(c<=x) {
			if(c==x)
				return true;
			a=b;
			b=c;
			c=a+b;
		}
		return false;
	}

}
