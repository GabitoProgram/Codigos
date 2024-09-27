package Arbol;

public class NodoA {
	private int num;
	private NodoA izq,der;
	public NodoA() {
		izq=der=null;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public NodoA getIzq() {
		return izq;
	}
	public void setIzq(NodoA izq) {
		this.izq = izq;
	}
	public NodoA getDer() {
		return der;
	}
	public void setDer(NodoA der) {
		this.der = der;
	}
	

}
