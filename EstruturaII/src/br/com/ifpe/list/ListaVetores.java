package br.com.ifpe.list;

import java.util.Arrays;

public class ListaVetores<T> {
    int DEFAULT_CAPACITY = 4;
    Object[] array;
    int size;

    public ListaVetores() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void insert(int position, T element) throws MyException {
        if (position < 0 || position > size) {
            throw new MyException("Posição inválida");
        } 
        resize();
        for (int i = size; i > position; i--) {
            array[i] = array[i - 1];
        }

        array[position] = element;
        size++;
    }
    
   
    public void resize() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            array = Arrays.copyOf(array, newCapacity);
        }
    }

	@Override
	public String toString() {
		return "ListaVetores [DEFAULT_CAPACITY=" + DEFAULT_CAPACITY + ", array=" + Arrays.toString(array) + ", size="
				+ size + "]";
	}

	
    
    


   }