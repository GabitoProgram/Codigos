import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in   = new Scanner(System.in);
		PilaA a  = new PilaA();
		int n =in.nextInt();
		a.llenar(n);
		a.mostrar();
	}
	////MOSTRAR EL MAYOR TAMAÑO DE LOS ARCHIVOS
	public void mayor(PilaA a) {
		PilaA aux = new PilaA();
		int may=0;
		while(!a.esvacia()) {
			Archivo x =a.eliminar();
			if(x.getTamaño()>may)
				may=x.getTamaño();
			aux.adicionar(x);
		}
		System.out.println(may);
		a.vaciar(aux);
		
	}
	
	///TAMBIEN SE PUEDE HACER CON UN RETURN
	public int mayor2(PilaA a) {
		PilaA aux =  new PilaA();
		int may=0;
		while(!a.esvacia()) {
			Archivo x = a.eliminar();
			if(x.getTamaño()>may)
				may=x.getTamaño();
			aux.adicionar(x);
		}
		a.vaciar(aux);
		return may;
	}
	///MOSTRR LOS NOMBRE DE ARCHIVOS  CON EL MAYOR TAMAÑO m
	public void ejercicio3(PilaA a) {
		int m = mayor2(a);
		PilaA aux = new PilaA();
		while(!a.esvacia()) {
			Archivo x = a.eliminar();
			if(x.getTamaño()==m)
				System.out.println(x.getNombre());
			aux.adicionar(x);
				
		}
		a.vaciar(aux);
	}
	
	
	

}
