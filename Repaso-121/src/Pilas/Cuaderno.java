package Pilas;
import java.util.*;
public class Cuaderno {
	private String marca ,tipo,tamaño;
	private int nroHojas ;
	public Cuaderno() {
		marca = "Winner";
		nroHojas = 250;
		tipo = "Empastado";
		tamaño = "Carta";
	}
	public void cuaderno(String marca , String tipo,int nroHojas , String tamaño) {
		marca=this.marca;
		tipo =this.tipo;
		nroHojas = this.nroHojas;
		tamaño=this.tamaño;
	}
	public void leer() {
		Scanner lee =  new Scanner(System.in);
		System.out.println("marca, tipo , nroHojas, tamaño");
		 marca = lee.next();
		 tipo = lee.next();
		 nroHojas = lee.nextInt();
		 tamaño = lee.next();
	}
	
	public void mostrar() {
		System.out.println("[ " + marca + ", " + nroHojas + ", " + tipo + ", " + tamaño + " ]");
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getNroHojas() {
		return nroHojas;
	}
	public void setNroHojas(int nroHojas) {
		this.nroHojas = nroHojas;
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	

}
