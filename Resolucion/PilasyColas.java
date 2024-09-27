///llevar al principio

incisoA(PilaA A, ColaSimpleA B, double x){
	int num = B.getnumelem()
	PilaA aux =  new PilaA()
	while not A.esvacia(){
		Artesania elem= A.eliminar()
		if(elem.getPrecioArte()=x){
			B.adicionar(elem)
		}else{
			aux.adicionar(elem)
		}
	}
	for i=1  to num{
		y = B.eliminar()
		if(y.getPrecioArte()=x){
			A.adicionar(y)
		}else{
			B.adicionar(y)
		}
	}
	A.vaciar(aux)
}

//llevar al final 

incisoA(PilaA A,ColaSimpleA B , int x){
	num = B.getnumelem()
	aux = new PilaA()
	int n =0
	while not A.esvacia(){
		y= A.eliminar()
		if(y.getnroPuesto()=x){
			B.adicionar(y)
			n+=1 //n=n+1
		}
		else{
			aux.adicionar(y)
		}
	}
	A.vaciar(aux)
	for i=1 to num{
		a = B.eliminar()
		if(a.getnroPuesto() =x){
			A.adicionar(a)
		}else{
			B.adicionar(a)
		}
	}
	for i=1 to n {
		a = B.eliminar()
		B.adicionar(a)
	}
}






BEGIN
PilaA A = new PilaA()
int n
READ(n)
A.llenar(n)
A.mostrar()

ColaSimpleA B = new ColaSimpleA();
int n
READ(n)
B.llenar(n)
B.mostrar()

//inciso A
double x
READ(x)
incisoA(A,B,x)
A.mostrar()
B.mostrar()
END