package common.algorithms.ordenamiento;

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
                swap(array, i, pIndex);
                pIndex++;
            }
        }
        swap(array, pIndex, fin);
        return pIndex;
    }

    private static void swap(int[] array, int indice1, int indice2) {
        int temp = array[indice1];
        array[indice1] = array[indice2];
        array[indice2] = temp;
    }
}
