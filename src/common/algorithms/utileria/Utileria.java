package common.algorithms.utileria;

public class Utileria {

    public static void swap(int[] array, int indice1, int indice2) {
        int temp = array[indice1];
        array[indice1] = array[indice2];
        array[indice2] = temp;
    }

}
