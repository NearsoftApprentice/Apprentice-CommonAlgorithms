package common.algorithms;

import java.util.Arrays;

public class CommonAlgorithms {

    public static void main(String[] args) {

        //Ordenamiento
        int[] array1 = new int[]{9,8,7,6,5,4,3,2,1};
        int[] array2 = new int[]{9,8,7,6,5,4,3,2,1};

        //Primer implementacion
        System.out.println("Original: ");
        printArray(array1);
        //ClaseOrdenamiento.ordenar(array1)
        System.out.println("Ordenado:");
        printArray(array1);

        //Segunda implementacion
        System.out.println("Original: ");
        printArray(array2);
        //ClaseOrdenamiento.ordenar(array2)
        System.out.println("Ordenado:");
        printArray(array2);

        //Busqueda
        //int t = 5;
        //int indice = ClaseBusqueda.buscar(array, t);
        //System.out.println("Elemento " + t + " ubicado en indice " + indice);

        //t = 7;
        //indice = ClaseBusqueda.buscar(array, t);
        //System.out.println("Elemento " + t + " ubicado en indice " + indice);

    }


    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
