package zad4;

import java.util.ArrayList;

public class GenericQueue <T>{
    private ArrayList<T> lista;

    public GenericQueue() {
        lista = new ArrayList<>();
    }

    public void enqueue(T element){
       lista.add(element);
   }

   public T dequeue(){
       T temp = lista.getFirst();
       lista.remove(0);
       return temp;
   }

    public ArrayList<T> getLista() {
        return lista;
    }

    public void setLista(ArrayList<T> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "GenericQueue{" +
                "lista=" + lista +
                '}';
    }
}
