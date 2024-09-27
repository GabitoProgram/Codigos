package ListasSimpleCircular;

public class ListaSimpleCircularN {
    private NodoN p;
    ListaSimpleCircularN()
    {
        p=null;
    }

    public NodoN getP() {
        return p;
    }

    public void setP(NodoN p) {
        this.p = p;
    }
    void adiprimero (int a)
    {
    	NodoN nue = new NodoN();
    	nue.setNumero(a);
	if (getP()==null)
	{
	    setP(nue);
	    getP().setSig(getP());//nue.setSig(nue)
	}
	else
	{
            nue.setSig(getP());
	    NodoN r = getP();
	    while (r.getSig() != getP())
		r = r.getSig();
	    r.setSig(nue);
            setP(nue);
	}
    }
    void mostrar()
    {
        NodoN r = getP();
		while (r.getSig() != getP()){
	            System.out.println(r.getNumero());
	            r = r.getSig();
	    }
	    System.out.println(r.getNumero());
	}
}
