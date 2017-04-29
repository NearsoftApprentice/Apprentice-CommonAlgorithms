package common.algorithms.busqueda;

import common.algorithms.ordenamiento.QuickSort;

public class BinarySearch {

    /**
     * <p>Busca el elemento <b>target</b> dentro del <b>array</b> utilizando el algoritmo <b>Binary Search</b></p>
     *
     * @param array Array para buscar
     * @param target Elemento a buscar
     * @return Indice del element <b>target</b> si esta contenido en <b>array</b>. De otra manera retorna -1
     */
    public static int buscar(int[] array, int target) {
        QuickSort.ordenar(array);
        int inicio = 0;
        int fin = array.length-1;
        while(inicio <= fin) {
            int medio = (inicio+fin)/2;
            if(target == array[medio]) {
                return medio;
            } else if (target < array[medio]) {
                fin = medio-1;
            } else {
                inicio = medio+1;
            }
        }
        return -1;
    }
}
