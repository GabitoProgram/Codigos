package MultiPila;

public class MultiPilaL {
	 
    PilaL pm [] = new PilaL [20];
    int np;
    
    MultiPilaL ()
    {
	int i;
	for (i = 1 ; i < 20 ; i++)
	    pm [i] = new PilaL ();
    }


    int NroPilas ()
    {
	return (np);
    }
    
    
	int nroelem(int i)
	{
		return (pm[i].nroelem());
	}

    boolean esvacia (int i)
    {
	if (pm [i].esvacia ())
	    return true;
	return false;
    }


    boolean esllena (int i)
    {
	if (pm [i].esllena ())
	    return true;
	return false;
    }


    void adicionar (int i, Libro L)
    {
	if (!pm [i].esllena ())
	    pm [i].adicionar (L);
	else
	    System.out.print ("Pila " + i + " esta llena");
    }


    Libro eliminar (int i)
    {
	Libro e = new Libro ();
	if (!pm [i].esvacia ())
	    e = pm [i].eliminar ();
	else
	    System.out.print ("Pila " + i + " esta vacia");
	return e;
    }


    void llenar (int n)
    {
	int i, m;

	np = n;
	for (i = 1 ; i <= n ; i++)
	{
	    System.out.print ("\nNro. elementos Pila " + i + " :");
	    m = Leer.datoInt ();
	    pm [i].llenar (m);
	}
    }


    void mostrar ()
    {
	int i;
	for (i = 1 ; i <= np ; i++)
	{
	    System.out.println ("\n\nDatos Pila " + i + " ");
	    pm [i].mostrar ();
	}
    }
    
    void vaciar(int i,PilaL Z)
    {
    	while(!Z.esvacia())
    	      adicionar(i,Z.eliminar());
    }

}
