package common.algorithms.ordenamiento;

import common.algorithms.utileria.Utileria;

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
            heapSize--;
            buildHeap(array, heapSize);
        }
    }

    private static void buildHeap(int[] array, int heapSize) {
        for (int i=heapSize; i>=0; i--) {
            maxHeap(array, i, heapSize);
        }
    }

    private static void maxHeap(int[] array, int nodeIndex, int heapSize) {
        int left = 2 * nodeIndex + 1;
        int right = 2 * nodeIndex + 2;
        int max = nodeIndex;

        if ((left <= heapSize) && (array[left] > array[nodeIndex])) {
            max = left;
        }

        if ((right <= heapSize) && (array[right] > array[max])) {
            max = right;
        }

        if(max != nodeIndex) {
            Utileria.swap(array, nodeIndex, max);
            maxHeap(array, max, heapSize);
        }
    }
}
