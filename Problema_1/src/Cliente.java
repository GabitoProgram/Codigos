
public class Cliente {
	private int ci;
	private String nombre;
	public Cliente() {
		ci=0;
		nombre="";
	}
	void leer() {
		System.out.println("---into CI, nombre");
		ci = Leer.datoInt();
		nombre=Leer.dato();
	}
	void mostrar() {
		System.out.println("["+ci+","+nombre+"]");
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
