inciso2(PilaFase A, String x,PilaTipoTrabajador B,String y){
	aux  = new PilaFase()
	while not A.esvacia(){
		Fase a = A.eliminar()
		if(a.getnombre()=x){
			aux2= new PilaTipoTrabajador()
			while not B.esvacia(){
				TipoTrabajador b = B.eliminar()
				if(b.getTipot()=y){
					MultiColaTranajadores A1= a.getT()
					int N = A1.getNp()
					for i=1 to N{
						ColaSimpleTrabajador aux3 =  new ColaSimpleTrabajador()
						ColaSimpleTrabajador aux4 =  new ColaSimpleTrabajador()
						while not A1.esvacia(i){
							Trabajador elem = A1.eliminar(i)
							if(elem.getidTipT() = b.getidTipT()){
								aux3.adicionar(elem)
							}else{
								aux4.adicionar(elem)
							}
						}
						int mayor = Mayor(aux3)
						A1.vaciar(i,aux4)
						A1.vaciar(i,aux3)
						while not A1.esvacia(i){
							Trabajador elem =  A1.eliminar(i)
							if(elem.getedad()=mayor){
								print(elem.getnombre())
							}
							aux3.adicionar(elem)
						}
						A1.vaciar(i,aux3)

					}

				}
				aux2.adicionar(b)
			}
			B.vaciar(aux2)
		}
		aux.adicionar(a)
	}
	A.vaciar(aux)
}


int mayor(ColaSimpleTrabajador A){
 	int mayor =-100
 	int N = A.getnumelem()
 	for  i=1 to N{
 		Trabajador elem = A.eliminar()
 		if(elem.getedad()>mayor){
 			mayor = elem.getedad()
 		}
 		A.adicionar(elem)
 	}
 	return mayor

 }


inciso3(PilaTipoMaterial A, PilaTipoHerramienta B , PilaFase C,String x, String y){
	aux =  new PilaFase()
	while not C.esvacia(){
		elem = C.eliminar()
		sw1,sw2 = false
		MultiColaSimpleMateriales  m = elem.getM()
		MultiColaSimpleHerramientas h = elem.getH()
		N1= m.getNp()
		N2= h.getNp()
		for i=1 to N1{
			elem2= m.eliminar(i)
			if(elem2.getnombre()=x)
				sw1=true
			m.adicionar(i,elem2)
		}
		for i=1 to N2{
			elem3 = h-eliminar(i)
			if(elem3.getnombre=y)
				sw2=true
		}
		if(sw1 = true and sw2= true)
			print(elem.getnombre())

		aux.adicionar(elem)
	}
	c.vaciar(aux)
}

BEGIN




END