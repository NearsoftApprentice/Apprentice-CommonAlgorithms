package common.algorithms.ordenamiento;

import common.algorithms.ordenamiento.utileria.Utileria;

import java.util.Arrays;

public class HeapSort {

    /**
     * <p>Ordena el arreglo de forma ascendente utilizando el algoritmo <b>Heap Sort</b></p>
     *
     * @param array Array a ordenar
     */
    public static void ordenar(int[] array) {
        int heapSize = array.length - 1;
        buildHeap(array, heapSize);

        for(int i=heapSize; i>0; i--) {
            Utileria.swap(array, 0, i);
            heapSize=heapSize-1;
            maxHeap(array, 0, heapSize);
        }
    }

    private static void buildHeap(int[] array, int heapSize) {
        for (int i=heapSize; i>=0; i--) {
            maxHeap(array, i, heapSize);
        }
    }

    private static void maxHeap(int[] array, int i, int heapSize) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int max = i;

        if ((left <= heapSize) && (array[left] > array[i])) {
            max = left;
        }

        if ((right <= heapSize) && (array[right] > array[max])) {
            max = right;
        }

        if(max != i) {
            Utileria.swap(array, i, max);
            maxHeap(array, max, heapSize);
        }
    }
}
