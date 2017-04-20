package common.algorithms;

import common.algorithms.busqueda.Busqueda;
import common.algorithms.ordenamiento.Ordenamiento;

import java.util.Arrays;

public class CommonAlgorithms {

    public static void main(String[] args) {

        //Ordenamiento
        int[] array1 = new int[]{9,8,7,6,5,4,3,2,1};
        int[] array2 = new int[]{9,8,7,6,5,4,3,2,1};

        //Primer implementacion
        System.out.println("Original: ");
        printArray(array1);
        //Ordenar array
        System.out.println("Ordenado:");
        printArray(array1);

        //Segunda implementacion
        System.out.println("Original: ");
        printArray(array2);
        //Ordenar array
        System.out.println("Ordenado:");
        printArray(array2);

        //Busqueda
        //int t = 5;
        //int indice = Busqueda.metodo(array, t);
        //System.out.println("Elemento " + t + " ubicado en indice " + indice);

        //t = 7;
        //indice = Busqueda.metodo(array, t);
        //System.out.println("Elemento " + t + " ubicado en indice " + indice);

    }


    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
