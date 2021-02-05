package edu.escuelaing.arep.sparkWeb.Calculos.app;
import java.util.List;


public class App 
{
    
    public static double media( List<Double> listaMedia ){
    	double cont=0.0;
        for(double i: listaMedia) {
        	cont+=i;
        }
        return cont/listaMedia.size();
    }
    
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
