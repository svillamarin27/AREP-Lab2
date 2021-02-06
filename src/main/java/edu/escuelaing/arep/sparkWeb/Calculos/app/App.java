package edu.escuelaing.arep.sparkWeb.Calculos.app;
import java.util.List;


public class App 
{
	/**
	 * La funcion del metodo retornar la media de los datos de una lista encadenada.
	 * @param listaMedia que corresponde a una lista encadenada tipo LinkedListPropio en la cual estan almecenados todos los datos del archivo leido
	 * @return Double media de la lista de datos
	 */
    public static double media( List<Double> listaMedia ){
    	double cont=0.0;
        for(double i: listaMedia) {
        	cont+=i;
        }
        return cont/listaMedia.size();
    }
    /**
	 * La funcion del metodo es retornar la desviacion de una lista de numeros.
	 * @param listaDesviacion corresponde a una lista de datos de tipo Double.
	 * @return Double media de la lista de datos
	 */ 
	public static double desviacion( List<Double> listaDesviacion ){
		double cont = 0.0;
		double promedio= media(listaDesviacion);
		int tam = listaDesviacion.size();
		
		for(int i=0 ; i<tam;i++) {
			cont+=(double) Math.pow(listaDesviacion.get(i)-promedio, 2);
		}
		return (Double) Math.sqrt(cont / (tam - 1));
	}
	
}
