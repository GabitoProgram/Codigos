package ColasSimples;
import java.util.*;
public class Vehiculo {
	private String marca , color ,modelo;
	public Vehiculo() {
	}
	
	public void leer() {
		System.out.println("marca + color + modelo");
		Scanner  lee = new Scanner(System.in);
		marca= lee.next();
		color = lee.next();
		modelo = lee.next();
	}
	public void mostrar() {
		System.out.println("["+marca+", "+color+", "+modelo+"]");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	

}
