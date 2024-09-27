package ListaDoblesSimples;

public class NodoN {
    private int numero;
    private NodoN ant,sig;
    NodoN()
    {
        ant=sig=null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public NodoN getAnt() {
        return ant;
    }

    public void setAnt(NodoN ant) {
        this.ant = ant;
    }

    public NodoN getSig() {
        return sig;
    }

    public void setSig(NodoN sig) {
        this.sig = sig;
    }

}
