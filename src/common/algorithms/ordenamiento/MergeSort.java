package common.algorithms.ordenamiento;

import java.util.Arrays;

public class MergeSort {

    /**
     * <p>Ordena el arreglo de forma ascendente utilizando el algoritmo <b>Merge Sort</b></p>
     *
     * @param array Array a ordenar
     */
    public static void ordenar(int[] array) {
        int n = array.length;
        if (n >= 2) {
            int mid = n/2;
            int[] L = new int[mid];
            int[] R = new int[n-mid];

            for(int i=0; i<mid; i++) {
                L[i] = array[i];
            }

            for(int i=mid; i<n; i++) {
                R[i-mid] = array[i];
            }

            ordenar(L);
            ordenar(R);
            merge(array, L, R);
        }
    }

    private static void merge(int[] array, int[] L, int[] R) {
        int nL = L.length;
        int nR = R.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < nL && j < nR) {
            if(L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < nL) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < nR) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
}
