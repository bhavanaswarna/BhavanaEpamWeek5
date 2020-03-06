package Epam.Collections;
import java.util.*;
public class List <E>{
	    private int size = 0;
	    private static final int INIT_CAPACITY = 10;
	    private Object listOfElements[];
	 
	    public List() {
	        listOfElements = new Object[INIT_CAPACITY];
	    }
	 
	    public void add(E e) {
	        if (size == listOfElements.length) {
	            ensureCapacity();
	        }
	        listOfElements[size++] = e;
	    }
	     
	    @SuppressWarnings("unchecked")
	    public E get(int i) {
	        if (i >= size || i < 0) {
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        }
	        return (E) listOfElements[i];
	    }
	    @SuppressWarnings("unchecked")
	    public E remove(int i) {
	        if (i >= size || i < 0) {
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        }
	        Object item = listOfElements[i];
	        int numElts = listOfElements.length - ( i + 1 ) ;
	        System.arraycopy( listOfElements, i + 1, listOfElements, i, numElts ) ;
	        size--;
	        return (E) item;
	    }
	     
	    public int Size() {
	        return size;
	    }
	     
	   
	    public String toString() {
	         StringBuilder sb = new StringBuilder();
	         for(int i = 0; i < size ;i++) {
	             sb.append(listOfElements[i].toString());
	             if(i<size-1){
	                 sb.append(",");
	             }
	         }
	         return sb.toString();
	    }
	     
	    private void ensureCapacity() {
	        int newSize = listOfElements.length * 2;
	        listOfElements = Arrays.copyOf(listOfElements, newSize);
	    }
}
