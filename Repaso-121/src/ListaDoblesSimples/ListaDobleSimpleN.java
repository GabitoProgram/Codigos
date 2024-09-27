package ListaDoblesSimples;

public class ListaDobleSimpleN {
	private NodoN p;
    
    ListaDobleSimpleN() //crea lista vacia
    {
        p=null;
    }

    public NodoN getP() {
        return p;
    }

    public void setP(NodoN p) {
        this.p = p;
    }
    public void adifinal(int h)
    {
        NodoN nue=new NodoN();
        nue.setNumero(h);
        
        if(getP()==null)
            setP(nue);
        else{
            NodoN x=getP();
            while(x.getSig()!=null)
                x=x.getSig();
            x.setSig(nue);
            nue.setAnt(x);
        }
    }
    public void mostrar()
    {
        NodoN q=getP();
        while(q!=null)
        {
            System.out.println(q.getNumero());
            q=q.getSig();
        }
    }
    
    public int nronodos() {
    	NodoN r = getP();
    	int count =0;
    	while(r!=null) {
    		count+=1;
    		r=r.getSig();
    	}
    	return count;
    }

}
