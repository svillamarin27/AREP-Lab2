package edu.escuelaing.arep.sparkWeb.app;

import edu.escuelaing.arep.sparkWeb.Calculos.app.App;
import edu.escuelaing.arep.sparkWeb.Calculos.util.*;
import java.util.List;
import static junit.framework.Assert.assertEquals;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testCalcularMediaTabla1() {
        LinkedList<Double> listaMedia1 = new LinkedList<Double>();
        listaMedia1.add(160.0);
        listaMedia1.add(591.0);
        listaMedia1.add(114.0);
        listaMedia1.add(229.0);
        listaMedia1.add(230.0);
        listaMedia1.add(270.0);
        listaMedia1.add(128.0);
        listaMedia1.add(1657.0);
        listaMedia1.add(624.0);
        listaMedia1.add(1503.0);
        double result = Math.round(App.media(listaMedia1)*100.0)/100.0;
        double expResult = 550.6;
        assertEquals(expResult, result);
    }
    public void testCalcularMediaTabla2(){
        LinkedList<Double> listaMedia2 = new LinkedList<Double>();
        listaMedia2.add(15.0);
        listaMedia2.add(69.9);
        listaMedia2.add(6.5);
        listaMedia2.add(22.4);
        listaMedia2.add(28.4);
        listaMedia2.add(65.9);
        listaMedia2.add(19.4);
        listaMedia2.add(198.7);
        listaMedia2.add(38.8);
        listaMedia2.add(138.2);
        listaMedia2.print();
        double result = Math.round(App.media(listaMedia2)*100.0)/100.0;
        double expResult = 60.32;
        assertEquals(expResult, result);
    }
    public void testCalcularDesviacionTabla1() {
        LinkedList<Double> listaDesv1 = new LinkedList<Double>();
        listaDesv1.add(160.0);
        listaDesv1.add(591.0);
        listaDesv1.add(114.0);
        listaDesv1.add(229.0);
        listaDesv1.add(230.0);
        listaDesv1.add(270.0);
        listaDesv1.add(128.0);
        listaDesv1.add(1657.0);
        listaDesv1.add(624.0);
        listaDesv1.add(1503.0);
        double result = Math.round(App.desviacion(listaDesv1)*100.0)/100.0;
        double expResult = 572.03;        
        assertEquals(expResult, result);
    }
	public void testCalcularDesviacionTabla2() {
		LinkedList<Double> listaDesv2 = new LinkedList<Double>();
		listaDesv2.add(15.0);
		listaDesv2.add(69.9);
		listaDesv2.add(6.5);
		listaDesv2.add(22.4);
		listaDesv2.add(28.4);
		listaDesv2.add(65.9);
		listaDesv2.add(19.4);
		listaDesv2.add(198.7);
		listaDesv2.add(38.8);
		listaDesv2.add(138.2);
		double result = Math.round(App.desviacion(listaDesv2)*100.0)/100.0;
		double expResult = 62.26;
		assertEquals(expResult, result);
	}

}
