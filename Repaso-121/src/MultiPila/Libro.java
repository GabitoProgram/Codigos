package MultiPila;

import ColaCircular.Leer;

public class Libro {
	private String titulo,autor;
	private int nro_paginas;
	public Libro() {
		
	}
	
	public void leer() {
		System.out.println("titulo,autor,nro_paginas");
		titulo = Leer.dato();
		autor = Leer.dato();
		nro_paginas = Leer.datoInt();
	}
	
	public void mostrar() {
		
		System.out.println("["+titulo+","+autor+","+nro_paginas+"]");
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNro_paginas() {
		return nro_paginas;
	}

	public void setNro_paginas(int nro_paginas) {
		this.nro_paginas = nro_paginas;
	}
	

}
