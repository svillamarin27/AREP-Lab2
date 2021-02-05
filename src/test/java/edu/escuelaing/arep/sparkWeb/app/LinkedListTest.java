package edu.escuelaing.arep.sparkWeb.app;
import edu.escuelaing.arep.sparkWeb.Calculos.util.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


import junit.framework.TestCase;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class LinkedListTest extends TestCase {
    public void testAdd() {
        Double val = null;
        LinkedList<Double> test3 = new LinkedList<Double>();
        int exp = 1;
        test3.add(val);
        int result = test3.size();
        assertEquals(exp, result);
    }
	
    public void testSize() {
        LinkedList<Double> listaSize = new LinkedList<Double>();
        listaSize.add(160.0);
        listaSize.add(591.0);
        listaSize.add(114.0);
        listaSize.add(229.0);
        listaSize.add(230.0);
        listaSize.add(270.0);
        listaSize.add(128.0);
        listaSize.add(1657.0);
        listaSize.add(624.0);
        listaSize.add(1503.0);        
        int result = listaSize.size();
        int expResult = 10;
        assertEquals(expResult, result);
    }
    public void testIterador() {
        LinkedList<Double> lista1 = new LinkedList<Double>();
        lista1.add(160.0);
        lista1.add(591.0);
        lista1.add(114.0);
        lista1.add(229.0);
        lista1.add(230.0);
        lista1.add(270.0);
        lista1.add(128.0);
        lista1.add(1657.0);
        lista1.add(624.0);
        lista1.add(1503.0);
         Double suma =0.0;
         try{
               for(Double x:lista1){
                    suma += x;
                }
         }catch(Exception e){
         }
      
    }

    public void testPrint() {
        LinkedList print4 = new LinkedList();
        print4.print();
    }
}	
