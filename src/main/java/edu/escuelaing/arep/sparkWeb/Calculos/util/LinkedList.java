package edu.escuelaing.arep.sparkWeb.Calculos.util;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList<E> implements List<E> {
	Node<E> first=null;
    Node<E> last=null;
    int size=0;
    
    @Override
    public int size() {
		int ext = 0;
		Node nodo = first;
        while (nodo != null ) {
            nodo = nodo.getNext();
            ext+=1;
        }
        return ext;
	}
        @Override
    	public boolean isEmpty() {
		return first==null && last==null;
	}
        @Override
	public boolean contains(Object o) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
        @Override
	public Iterator<E> iterator() {
		 Iterator<E> iterador;
	        iterador = new Iterator<E>() {
	            Node primero=first;
	            public boolean hasNext() {
	                boolean bandera=false;
	                if(primero!=null){
	                    bandera=true;
	                }
	                return bandera;
	            }
	            public E next(){
	               E cont =(E)primero.getT();
	               if(primero.equals(last)){
	                   primero=null;
	                }else{
	                   primero=primero.getNext();
	               }
	                return cont;  
	            }
	        };
	    return iterador;
		
		
	}
        @Override
	public Object[] toArray() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
        @Override
	public <T> T[] toArray(T[] a) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
        @Override
	public boolean add(E e) {
		Node n = new Node(e);
        n.setNext(first);
        first = n;
        size++;
        return true;
	}
        @Override
	public boolean remove(Object o) {
		Node nodo = first;
        Node ant=null;
        E cont=null;
        int tam = size();
        boolean bandera=false;
        while (nodo != null && tam != size()){
            cont = (E) nodo.getT();
            if(cont.equals(o)){
                bandera=true;
                if(ant!=null){
                    ant.setNext(nodo.getNext());
                    first=ant;
                }else{
                   first=first.getNext();
                }
            }else {
                tam--;
                ant = nodo;
                nodo = nodo.getNext();
            }
	}
        return bandera;
    

	}
        @Override
	public boolean containsAll(Collection<?> c) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
        @Override
	public boolean addAll(Collection<? extends E> c) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
        @Override
	public boolean addAll(int index, Collection<? extends E> c) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
        @Override
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
        @Override
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	public void print(){
		Node nodo = first;
		while (nodo != null) nodo = nodo.getNext();
		System.out.println(nodo);
	}
        @Override
	public void clear() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
		
	}
        @Override
	public E get(int index) {
		E cont = null;
		Node nodo = first;
		int longitud = size();
		while ( nodo != null && longitud != index) {
	            cont = (E) nodo.getT();
	            longitud--;
	            nodo = nodo.getNext();
		}
		return cont;
	}
        @Override
	public E set(int index, E element) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
        @Override
	public void add(int index, E element) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
		
	}
        @Override
	public E remove(int index) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
        @Override
	public int indexOf(Object o) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
        @Override
	public int lastIndexOf(Object o) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
        @Override
	public ListIterator<E> listIterator() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
        @Override
	public ListIterator<E> listIterator(int index) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
        @Override
	public List<E> subList(int fromIndex, int toIndex) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

}
