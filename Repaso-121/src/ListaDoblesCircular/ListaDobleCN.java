package ListaDoblesCircular;

public class ListaDobleCN {

	private NodoN p;
    ListaDobleCN(){
        p=null;
    }

    public NodoN getP() {
        return p;
    }

    public void setP(NodoN p) {
        this.p = p;
    }
    void adifinal (int b)
    {
        NodoN nue = new NodoN ();
        nue.setNumero(b);
        if (getP()==null)
        {
            setP(nue);
            nue.setSig(nue); //getP().setSig(getP());
            nue.setAnt(nue);
        }
        else
        {
            NodoN r=getP().getAnt();
            r.setSig(nue);
            nue.setAnt(r);
            nue.setSig(getP());
            getP().setAnt(nue);
            
        }
    }
    void mostrar()
    {
        NodoN r = getP();
        int N = nroelem();
        for(int i=1;i<=N;i++) {
        	r = r.getSig();
        	System.out.println(r.getNumero());
        }

    } 
    int nroelem() {
    	NodoN r = getP();
    	int cont=0;
    	while(r.getSig()!= getP()) {
    		cont=cont+1;
    		r=r.getSig();
    	}
    	cont=cont+1;
    	return cont;
    }
}
