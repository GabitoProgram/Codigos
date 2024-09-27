
//De la fase X mostrar los nombre de los trabajadores  
//tipo X  con la mayor edad 
incisoB(PilaFases A , PilaTTrab B, String FaseX , String tipoX){
	aux =  new PilaFases()
	id= buscar(B,tipoX)
	while( not A.esvacia()){
		fase x = A.eliminar()
		if(x.getNombre()== FaseX){
			menores(x.getA())
		}
		aux.adicionar(x)
	}
	A.vaciar(aux)

}

buscar(PilaTTrab B,String tipoX){
	id=""
	aux =  new PilaTTrab()
	while(not B.esvacia()){
		tipoTrabajador a = B.eliminar()
		if(a.getTipoT()=tipoX)
			id=tx.getidTipoT()
		aux.adicionar(a)
	}
	B.vaciar(aux)
	return id
}

mayores(MultiPilaT A){
	aux = new PilaT()
	

}