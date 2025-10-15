package aed;

public class ListaEnlazada<T> {
    private Nodo primer;
    private Nodo ultimo;
    private int longitud;

    private class Nodo {
        T valor;
        Nodo anterior;
        Nodo siguiente;
        Nodo(T v) { valor = v; }
    }

    public ListaEnlazada() {
        primer = null;
        ultimo = null;
        longitud = 0;
    }

    public int longitud() {
        return longitud;
    }

    public void agregarAdelante(T elem) {
        Nodo nuevo = new Nodo(elem);
        if (longitud == 0) {
            primer = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.siguiente = primer;
            primer.anterior = nuevo;
            primer = nuevo;
        }
        longitud++;
    }

    public void agregarAtras(T elem) {
        Nodo nuevo = new Nodo(elem);
        if (longitud == 0) {
            ultimo = nuevo;
            primer = nuevo;
        } else {
            nuevo.anterior = ultimo;
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
        longitud++;
    }

    public T obtener(int i) {
        Nodo nodo = primer; 
        int j = 0;
        while (j<i){ 
            nodo = nodo.siguiente; 
            j++; 
        }
        return nodo.valor;
    }

    public void eliminar(int i) {
        if (i == 0) {
            if (longitud == 1) {
                primer = null; 
                ultimo = null;
            } else {
                primer = primer.siguiente;
                primer.anterior = null;
            }
        } else {
            Nodo actual = primer;
            int j = 0;
            while (j < i) { actual = actual.siguiente; j++; }

            Nodo anterior = actual.anterior;
            Nodo proximo = actual.siguiente;

            anterior.siguiente = proximo;
            if (proximo != null) {
                proximo.anterior = anterior;
            } else {
                ultimo = anterior;
            }
        }

        longitud--;
    }


    public void modificarPosicion(int indice, T elem) {
        Nodo n = primer;
        for (int i = 0; i < indice; i++){
            n = n.siguiente;
        }
        n.valor = elem;
    }

    public ListaEnlazada(ListaEnlazada<T> lista) {
        Nodo actual = lista.primer;
        while (actual != null) {
            this.agregarAtras(actual.valor);
            actual = actual.siguiente;
        }
    }
    
    @Override
    public String toString() {
        String res = "[";
        Nodo nodoActual = primer;
        while (nodoActual != null) {
            res = res + nodoActual.valor;
            if (nodoActual.siguiente != null){
                res = res + ", ";
            } 
            nodoActual = nodoActual.siguiente;
        }
        res = res + "]";
        return res;
    }

    public class ListaIterador{
    	private Nodo siguiente;
        private Nodo anterior;

        public ListaIterador() {
            this.siguiente = primer;
            this.anterior = null;
        }

        public boolean haySiguiente() {
	        return siguiente != null;
        }
        
        public boolean hayAnterior() {  
	        return anterior != null;
        }

        public T siguiente() {
            T res = siguiente.valor;
            anterior = siguiente;
            siguiente = siguiente.siguiente;
            return res;
        }
        

        public T anterior() {
            if (anterior != null) {
                T valor = anterior.valor;
                siguiente = anterior;
                anterior = anterior.anterior;
                return valor;
            }
            if (siguiente != null && siguiente.anterior != null) {
                Nodo prev = siguiente.anterior;
                T valor = prev.valor;
                siguiente = prev;
                anterior = prev.anterior;
                return valor;
            }
            return null;
        }
    }

    public ListaIterador iterador() {
	    return new ListaIterador();
    }

}
