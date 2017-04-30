package common.algorithms.ordenamiento;

import common.algorithms.utileria.Utileria;

public class QuickSort {

    /**
     * <p>Ordena el arreglo de forma ascendente utilizando el algoritmo <b>Quick Sort</b></p>
     *
     * @param array Array a ordenar
     */
    public static void ordenar(int[] array) {
        quickSort(array, 0, array.length-1);
    }

    private static void quickSort(int[] array, int inicio, int fin) {
        if(inicio < fin) {
            int pIndex = particionar(array, inicio, fin);
            quickSort(array, inicio, pIndex-1);
            quickSort(array, pIndex+1, fin);
        }
    }

    private static int particionar(int[] array, int inicio, int fin) {
        int pivote = array[fin];
        int pIndex = inicio;
        for(int i=inicio; i <= fin-1; i++) {
            if(array[i] <= pivote) {
                Utileria.swap(array, i, pIndex);
                pIndex++;
            }
        }
        Utileria.swap(array, pIndex, fin);
        return pIndex;
    }

}
