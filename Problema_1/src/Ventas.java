
public class Ventas {
	private int ci,idProd,cantidad;
	private String fecha;
	public Ventas() {
		ci = 0;
		idProd =0;
		cantidad =0;
		fecha="";
	}
	
	public void leer() {
		System.err.println(" Into ci , idProd  cantidad,fecha");
		ci = Leer.datoInt();
		idProd = Leer.datoInt();
		cantidad = Leer.datoInt();
		fecha = Leer.dato();
	}
	
	public void mostrar() {
		System.out.println("["+ci+","+idProd+","+cantidad+","+fecha+"]");
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public int getIdProd() {
		return idProd;
	}

	public void setIdProd(int idProd) {
		this.idProd = idProd;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	

}
