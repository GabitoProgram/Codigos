import java.util.*;
public class Archivo {
	private String nombre;
	private String tipo;
	private int tamaño;
	private String fecha;
	public Archivo() {
		nombre ="mac";
		tipo ="seguridad";
		tamaño = 45;
		fecha ="15/02/2003";
	}
	

	
	public void leer() {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduzca su nombre");
		nombre = in.next();
		System.out.println("Introduzca su tipo");
		tipo = in.next();
		System.out.println("Introduzaca su tamaño");
		tamaño = in.nextInt();
		System.out.println("Introduzaca su fecha");
		fecha = in.next();
	}
	
	public void mostrar() {
		System.out.println("["+ nombre +","+tipo+","+tamaño+","+fecha+"]");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	

}
