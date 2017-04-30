package common.algorithms;

import common.algorithms.busqueda.BFS;
import common.algorithms.busqueda.BinarySearch;
import common.algorithms.busqueda.DFS;
import common.algorithms.busqueda.LinearSearch;
import common.algorithms.ordenamiento.CountingSort;
import common.algorithms.ordenamiento.HeapSort;
import common.algorithms.ordenamiento.MergeSort;
import common.algorithms.ordenamiento.QuickSort;
import common.algorithms.utileria.Nodo;

import java.util.Arrays;

public class CommonAlgorithms {

    public static void main(String[] args) {

        //Ordenamiento
        int array1[];

        //int[] array1 = new int[]{8,7,6,5,4,3,2,1};
        //int[] array1 = new int[]{1,2,3,4,5,6,7,8};

//        int size = 20;
//        array1[] = new int[size];
//        for(int i=0; i<size; i++) {
//            array1[i] = size-i;
//        }

        array1 = new int[]{1,4,1,2,7,5,2,6,0,5,2};


        //Primer implementacion
        System.out.println("Original: ");
        printArray(array1);
        System.out.println("*************");

        CountingSort.ordenar(array1, 20);

        System.out.println("************");
        System.out.println("Ordenado:");
        printArray(array1);

        //Segunda implementacion
//        System.out.println("Original: ");
//        printArray(array1);
        //ClaseOrdenamiento.ordenar(array2)
//        System.out.println("Ordenado:");
//        printArray(array1);

        //Busqueda
        array1 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int t = 11;
        int indice = BinarySearch.buscar(array1, t);
        System.out.println("Elemento " + t + " ubicado en indice " + indice);

        //t = 7;
        //indice = ClaseBusqueda.buscar(array, t);
        //System.out.println("Elemento " + t + " ubicado en indice " + indice);

        Nodo s = new Nodo("S");
        Nodo a = new Nodo("A");
        Nodo b = new Nodo("B");
        Nodo c = new Nodo("C");
        Nodo d = new Nodo("D");
        Nodo e = new Nodo("E");
        Nodo f = new Nodo("F");
        Nodo g = new Nodo("G");
        Nodo h = new Nodo("H");
        Nodo i = new Nodo("I");
        Nodo j = new Nodo("J");

        s.agregarAdyacente(a);
        s.agregarAdyacente(f);
        s.agregarAdyacente(h);

        a.agregarAdyacente(b);
        a.agregarAdyacente(c);

        c.agregarAdyacente(d);

        d.agregarAdyacente(e);

        e.agregarAdyacente(f);
        e.agregarAdyacente(i);

        f.agregarAdyacente(g);

        g.agregarAdyacente(h);

        i.agregarAdyacente(j);

        System.out.println("Recorrido: " + DFS.recorrer(s));

    }


    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
