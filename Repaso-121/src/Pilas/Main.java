package Pilas;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		PilaC c =  new PilaC();
		Scanner lee =  new Scanner(System.in);
		System.out.println("numero de cuadernos");
		int n = lee.nextInt();
		c.llenar(n);
		c.mostrar();
		/* 
		System.out.println("\nINCISO 1");
		String x = lee.next();
		
		inciso1(c, x);
		*/
		
		
		/*
		inciso2(c, "lider");
		System.out.println("inciso 2");
		c.mostrar();
		*/
		
		
		//inciso 3
		/*
		System.out.println("\nincisio 3");
		inciso3b(c);
		c.mostrar();
		*/
		
		eliminar(c,"lider");
		c.mostrar();
	}
	
	//inciso 1
	public static void inciso1(PilaC A,String x) {
		PilaC aux =  new PilaC();
		int cont =0;
		while(!A.esvacia()) {
			Cuaderno elem = A.eliminar();
			if(elem.getMarca().equals(x)) {
				cont +=1;
			}
			aux.adicionar(elem);
		}
		A.vaciar(aux);
		System.out.println("La marca "+x+" tiene "+cont);
	}
	
	//inciso 2
	public static void inciso2(PilaC A , String x) {
		PilaC aux2 =  new PilaC();
		PilaC aux1 =  new PilaC();
		while(!A.esvacia()) {
			Cuaderno elem = A.eliminar();
			if(elem.getMarca().equals(x))
				aux1.adicionar(elem);
			else
				aux2.adicionar(elem);
		}
		A.vaciar(aux2);
		A.vaciar(aux1);
	}
	
	public static int  mayor(PilaC A) {
		int n = 0;
		PilaC aux =  new PilaC();
		while(!A.esvacia()) {
			Cuaderno elem = A.eliminar();
			if(elem.getNroHojas()>n)
				n = elem.getNroHojas();
			aux.adicionar(elem);
		}
		A.vaciar(aux);
		return n;
	}
	
	public static void inciso3(PilaC A) {
		PilaC aux  =  new PilaC();
		PilaC aux1 = new PilaC();
		while(!A.esvacia()) {
			Cuaderno elem = A.eliminar();
			int m = mayor(A);
			if(elem.getNroHojas()==m) {
				System.out.println("a");
				aux.adicionar(elem);
			}
			else
				aux1.adicionar(elem);
		}
		A.vaciar(aux);
	}
	
	public static void inciso3b(PilaC A) {
		PilaC aux =  new PilaC();
		PilaC aux1 = new PilaC();
		while(A.esvacia()) {
			while(!A.esvacia()) {
				Cuaderno elem = A.eliminar();
				if(elem.getNroHojas() == mayor(A)) {
					aux.adicionar(elem);
				}
				else {
					aux1.adicionar(elem);
				}
					
			}
			A.vaciar(aux1);
		}
		A.vaciar(aux);
	}
	
	
	public static void eliminar(PilaC A,String x) {
		PilaC aux =  new PilaC();
		while(!A.esvacia()) {
			Cuaderno elem=  A.eliminar();
			if(!elem.getMarca().equals(x))
				aux.adicionar(elem);
		}
		A.vaciar(aux);
	}
	
	
	
	

}
