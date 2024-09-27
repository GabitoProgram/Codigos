package ListaSimpleNormal;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		ListaSimpleN a  =  new ListaSimpleN();
		a.adifinal(1);
		a.adifinal(2);
		a.adifinal(3);
		a.adifinal(4);
		a.adifinal(5);
		a.mostrar();
		
		System.out.println("\nInciso 1");
		inciso1(a, 3);
		
		System.out.println("\nInciso 2");
		inciso2(a);
		
		
		System.out.println("\nInciso 3");
		inciso3(a);
		a.mostrar();
		
		System.out.println("\nBorrar");
		eliminar(a, 1);
		eliminar(a, 4);
		a.mostrar();
	}
	
	
	public static void inciso1(ListaSimpleN a,int n) {
		NodoN r = a.getP();
		int cont=0;
		while(r!=null) {
			if(r.getNumero()==n)
				cont+=1;
			r=r.getSig();
		}
		System.out.println("el numero "+n+"aparece "+cont);
	}
	
	
	public static void inciso2(ListaSimpleN A) {
		NodoN r=A.getP();
		while(r.getSig() != null) {
			r=r.getSig();
		}
		System.out.println(r.getNumero());
	}
	
	public static boolean fibonaci(int x) {
		int a = -1;
		int b = 1;
		int c = a + b;
		while (c <= x) {
			if (c == x)
				return true;
			a = b;
			b = c;
			c = a + b;
		}
		return false;
	}
	
	public static void inciso3(ListaSimpleN A) {
		NodoN r = A.getP();
		while(r!=null) {
			if(fibonaci(r.getNumero()) == true) {
				NodoN a =  new NodoN();
				a.setNumero(-1);
				a.setSig(r.getSig());
				r.setSig(a);
			}
				
			r = r.getSig();
		}
	}
	public static void eliminar(ListaSimpleN A ,int x) {
		NodoN r = A.getP();
		if(r ==A.getP()) {
			if(x==r.getNumero())
				A.setP(r.getSig());
		}
		NodoN aux = r;
		r=r.getSig();
		while(r!=null) {
			if(r.getNumero()==x) {
				aux.setSig(r.getSig());
				r.setSig(null);
			
			}
			aux = r;
			r=aux.getSig();
			
		}
	}
}
