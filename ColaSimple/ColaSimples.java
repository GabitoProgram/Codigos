public class ColasSimple(){
	private int max =50;
	private Obejeto v[] = new Objeto[max+1];
	private int ini,fin;

	public ColaSimple(){
		ini =fin =0;
	}

	boolean esvacia(){
		if(ini=0  and fin=0)
			retunb true;
		return false;
	}
	boolean esllena(){
		if(fin=max)
			return true;
		return false;
	}
	int nroelementos(){
		return (fin-ini);
	}
	void adicinar(Objecto A){
		if(!esllena()){
			fin++;
			v[fin] = A;
		}else 
			System.Out.println("cola simple llena");

	}
	Objecto eliminar(){
		Objecto A = new Objeto();
		if(!esvacia()){
			ini++;
			A = v[ini];
			if(ini == fin)
				ini=fin=0;
		}else 
			System.Out.println("Cola Simple Vacia");
		return(A);
	}

	void mostrar(){
		Objecto a = new Objeto();
		if(esvacia())
			System.Out.println("Cola vacia");
		else{
			System.Out.println("\n Datos de la cola");
			ColasSimple aux =  new ColasSimple();
			while(!esvacia){
				a  = eliminar();
				aux.adicinar(a);
				a.mostrar();
			}
			vaciar(aux);
		}
	}
	void llenar(int n){
		
	}

}