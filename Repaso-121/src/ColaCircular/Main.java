package ColaCircular;
import java.util.*;

import Pilas.PilaC;
public class Main {

	public static void main(String[] args) {
		ColaCircularC c =  new ColaCircularC();
		int n = Leer.datoInt();
		c.llenar(n);
		c.mostrar();
		
		/*
		System.out.println("inciso 1");
		inciso1(c);
		c.mostrar();
		*/
		
		inciso2(c);
		c.mostrar();
	}
	
	
	public static int repeticion(ColaCircularC A , char x) {
		int cont =0;
		int n= A.nroelem();
		for(int i=0;i<=n;i++) {
			char c = A.eliminar();
			if(x==c) {
				cont+=1;
			}
			A.adicionar(c);
		}
		return cont;
	}
	
	public static char MayorRepeticion(ColaCircularC A) {
		ColaCircularC aux = new ColaCircularC();
		aux =A;
		int cont=0;
		char c =' ';
		int n= A.nroelem();
		for(int i=1;i<=n;i++) {
			char elem = A.eliminar();
			if(repeticion(aux, elem) > cont) {
				cont = repeticion(aux, elem);
				c = elem;
			}
			A.adicionar(elem);
		}
		return c;
	}
	
	
	
	public static void inciso1(ColaCircularC A) {
		char c = MayorRepeticion(A);
		ColaCircularC aux =  new ColaCircularC();
		int n= A.nroelem();
		for(int i=1;i<=n;i++) {
			char elem = A.eliminar();
			if(elem == c)
				aux.adicionar(elem);
			else
				A.adicionar(elem);
		}
		A.vaciar(aux);
	}
	
	public static void inciso2(ColaCircularC a) {
		int n = a.nroelem();
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n - i - 1; j++)
				a.adicionar(a.eliminar());
			char x = a.eliminar();
			for (int j = 0; j < i; j++)
				a.adicionar(a.eliminar());
			a.adicionar(x);
		}
	}
}
