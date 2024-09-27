package MultiPila;

public class Main {

	public static void main(String[] args) {
		MultiPilaL a  = new MultiPilaL();
		int n =Leer.datoInt();
		a.llenar(n);
		a.mostrar();
		
		System.out.println("inciso 1");
		String x = Leer.dato();
		inciso1(a, x);
	}
	
	
	
	
	
	
	public static void inciso1(MultiPilaL A,String x){
		int cont=0;
		int n=A.np;
		for (int i=1 ;i<=n;i++) {
			PilaL aux = new PilaL();
			while(!A.esvacia(i)) {
				Libro elem = A.eliminar(i);
				if(elem.getAutor().equals(x))
					cont=cont+elem.getNro_paginas();
				aux.adicionar(elem);
			}
			A.vaciar(i, aux);
		}
		System.out.println(cont);
	}

}
