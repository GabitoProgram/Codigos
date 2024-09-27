package Arbol;
import java.util.*;
public class ArbolBinario {
	private NodoA raiz;
	
	public ArbolBinario() {
		raiz = null;
	}

	public NodoA getRaiz() {
		return raiz;
	}

	public void setRaiz(NodoA raiz) {
		this.raiz = raiz;
	}
	
	void crear(NodoA r) {
		if(r==null) {
			Scanner lee = new Scanner(System.in);
			int elem = lee.nextInt();
			r.setNum(elem);
			System.out.println("tendra izq? s/n");
			String resp = lee.next();
			if(resp.equals("s")) {
				NodoA nue = new NodoA();
				r.setIzq(nue);
				crear(r.getIzq());
			}
			System.out.println("tendra der? s/n");
			String resp1= lee.next();
			if(resp1.equals("s")) {
				NodoA nue = new NodoA();
				r.setDer(nue);
				crear(r.getDer());
			}
		}
	}
	void preorden(NodoA r) {
		System.out.println(r.getNum());
		preorden(r.getIzq());
		preorden(r.getDer());
	}
	
	void inorden(NodoA r) {
		if(r!=null) {
			inorden(r.getIzq());
			System.out.println(r.getNum());
			inorden(r.getDer());
		}
	}
	
	void postorden(NodoA r) {
		if(r!=null) {
			postorden(r.getIzq());
			postorden(r.getDer());
			System.out.println(r.getNum());
		}
	}
	
	

}
