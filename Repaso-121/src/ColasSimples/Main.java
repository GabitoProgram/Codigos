package ColasSimples;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		ColaSimpleV a = new ColaSimpleV();
		Scanner lee =  new Scanner(System.in);
		int n = lee.nextInt();
		a.llenar(n);
		a.mostrar();
		 /*
		System.out.println("inciso 1");
		inciso1(a);
		*/
		
		
		System.out.println("inciso 2");
		inciso2(a);
		a.mostrar();
	}
	
	
	public static void inciso1(ColaSimpleV A) {
		int n = A.nroelem();
		for(int i=1 ;  i<=n;i++) {
			Vehiculo elem = A.eliminar();
			if(i==n) {
				elem.mostrar();
			}
			A.adicionar(elem);
		}
	}
	
	public static void inciso2(ColaSimpleV A) {
		Vehiculo primero  = A.eliminar();
		int n = A.nroelem();
		for(int i=1;i<=n-1;i++) {
			Vehiculo elem = A.eliminar();
			A.adicionar(elem);
		}
		A.adicionar(primero);
	}

}
