package common.algorithms.ordenamiento;

public class CountingSort {

    /**
     * <p>Ordena el arreglo de forma ascendente utilizando el algoritmo <b>Counting Sort</b></p>
     *
     * @param array Array a ordenar
     * @param k Valor maximo presente en el array
     */
    public static void ordenar(int[] array, int k) {
        int buckets[] = new int[k+1];

        for(int i=0; i<array.length; i++) {
            buckets[array[i]]++;
        }

        int index = 0;
        for(int i=0; i<buckets.length; i++) {
            while (buckets[i] > 0) {
                array[index] = i;
                buckets[i]--;
                index++;
            }
        }
    }
}
