package edu.escuelaing.arep.sparkWeb.Calculos.util;

public class Node<T> {

	private T primero= null; 
    private Node siguiente= null; 
    
    public Node(T t){
        this.primero = t;
    }
    public void setNext(Node n){
        this.siguiente=n;
    }
    public Node getNext(){
        return siguiente;
    }
    public T getT(){
        return primero;
    }
    public void setT(T elemento){
       this.primero=elemento ;
    }
}
