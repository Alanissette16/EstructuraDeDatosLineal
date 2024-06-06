package Materia;
import java.util.NoSuchElementException;
import Materia.Models.NodoGenerico;

public class ColaGenerica<T> {
    private NodoGenerico<T> first;
    private NodoGenerico<T> last;
    int size;

    

    public ColaGenerica() {
        this.first = null;
        this.last = null;
        
    }
    public void addNode(T data){
        NodoGenerico<T> nuevoNodo = new NodoGenerico<>(data);
        if(isEmpty()){
            first = nuevoNodo;
            last = nuevoNodo;

        }else{
            last.next = nuevoNodo;
            last = nuevoNodo;
            
        }
        size ++;
    }
    public T remove(){
        if (isEmpty()){
            throw new NoSuchElementException("la cola esta vacia");
        }
        T data = first.data;
        first= first.next;
        if(first==null){
            last = null;
        }
        size --;
        return data;
        
    }
    public boolean isEmpty(){
        return first == null;
    }
    public T peek(){
        if (isEmpty()){
            throw new NoSuchElementException("la cola esta vacia");
        }
        return first.data;
    }
    public int size(){
        return size;
    }
    
}
