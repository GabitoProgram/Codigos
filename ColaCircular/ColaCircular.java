public class ColaCircular{
	private int max=200;
	private  char v[] = new char[max+1];
	private int ini , fin;

	ColaCircular(){
		ini = fin =0;
	}
	int nroelementos(){
		return ((max+fin-ini)%max);
	}
	boolean esvacia(){
		if(nroelementos() ==0)
			return true;
		return false;
	}

	boolean esllena(){
		if(nroelementos()==max-1)
			return true;
		return false;
	}

	void adicionar(char elem){
		if(!esllena()){
			fin=(fin+1) % max;
			v[fin] = elem;
		}else 
			System.out.println("Cola circular llena");
	}
	char eliminar(){
		char elem=' ';
		if(!esvacia()){
			ini  =(ini+1) %max;
			elem = v[ini];
			if(nroelementos()==0)
				ini=fin=0;
		}else 
			System.out.println("Cola circular vacia");
		return elem;
	}
	void llenar(int n){
		int i;
		for(i=1;i<=n;i++){
			char x = ' ';
			x.Leer().dato().charAt(0);
			adicionar(x);
		}
	}
	void mostrar(){
		aux =  new ColaCircular();
		while(!esvacia()){
			x = eliminar();
			aux.adicionar(x);
			System.out.println(x);
		}
		while(!aux.esvacia()){  ///procedimiento de vaciar
			x = aux.eliminar(); 
			adicionar(x);
		}
	}
	void vaciar(ColaCircular a){
		while(!a.esvacia()){
			adicionar(a.eliminar());
		}
	}

}