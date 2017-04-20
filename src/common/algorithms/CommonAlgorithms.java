package common.algorithms;

import common.algorithms.busqueda.Busqueda;
import common.algorithms.ordenamiento.Ordenamiento;

import java.util.Arrays;

public class CommonAlgorithms {

    public static void main(String[] args) {
        int[] array = new int[]{9,8,7,6,5,4,3,2,1};

        System.out.println("Initial: ");
        printArray(array);

        Ordenamiento.QuickSort(array);

        System.out.println("Sorted:");
        printArray(array);

    }


    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
