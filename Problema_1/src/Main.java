
public class Main {

	public static void main(String[] args) {
		ColaCircularP a =  new ColaCircularP();
		ColaSimpleV b = new ColaSimpleV();
		PilaC c =  new PilaC();
		a.llenar(1);
		b.llenar(2);
		c.llenar(2);
		a.mostrar();
		b.mostrar();
		c.mostrar();
		
		//inciso A
		incisoA(a, b);
		//inciso B
		

	}
	///inciso a 
	public static int  maximoProducto(ColaSimpleV a, ColaCircularP b) {
		int maximo = 0;
		int nroProd = b.nroelem();
		for (int i=1;i<=nroProd;i++) {
			Productos x =  b.eliminar();
			b.adicionar(x);
			int  nroVen = a.nroelem();
			int count =0;
			for(int j=1 ; j<=nroVen;j++ ) {
				Ventas y = a.eliminar();
				a.adicionar(y);
				if(x.getIdProd() == y.getIdProd())
					count  = count+y.getCantidad();
			}
			if(count > maximo)
				maximo = count;
		}
		return maximo;
	}
	
	public static void incisoA(ColaCircularP a,ColaSimpleV b) {
		int maximo = maximoProducto(b, a);
		int nroPro = a.nroelem();
		for(int i=1;i<=nroPro;i++) {
			Productos x = a.eliminar();
			a.adicionar(x);
			int nroVen = b.nroelem();
			int cont = 0;
			for(int j=1;j<=nroVen;j++) {
				Ventas y = b.eliminar();
				b.adicionar(y);
				if(x.getIdProd() == y.getIdProd())
					cont = cont +y.getCantidad();
			}
			if(cont == maximo)
				x.mostrar();
		}
	}
	
	///inciso b 
	public  static int montoTotal(ColaCircularP a , ColaSimpleV b ,int ci) {
		int intoVentas = b.nroelem();
		int costo =0;
		for(int i=1;i<=intoVentas;i++) {
			Ventas x = b.eliminar();
			b.adicionar(x);
			if(x.getCi() == ci){
				int nroProducto  = a.nroelem();
				for(int j=1;j<=nroProducto;j++) {
					Productos y =  a.eliminar();
					a.adicionar(y);
					if(y.getIdProd() == x.getIdProd())
						costo=costo+(y.getPrecio()*x.getCantidad());
				}
			}
		}
		return costo;
	}
	
	public static void incisob(ColaCircularP a, ColaSimpleV b , PilaC c) {
		PilaC g = new PilaC();
		PilaC h = new PilaC();
		while(!c.esvacia()) {
			Cliente x = c.eliminar();
			while(!c.esvacia()) {
				Cliente y = c.eliminar();
				if(montoTotal(a, b, x.getCi()) > montoTotal(a, b, y.getCi())) {
					g.adicionar(y);
					y=x;
				}else {
					g.adicionar(x);
				}
			}
			c.vaciar(g);
			h.adicionar(x);
		}
		c.vaciar(h);
	}
}
