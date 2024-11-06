package exercicios.comparacao.sort;

import java.util.Arrays;

public class CompararSorts {

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000, 1000000};
        int numExecutions = 10;

        for (int size : sizes) {
            long mergeSortTime = 0;
            long bubbleSortTime = 0;
            long selectionSortTime = 0;
            long insertionSortTime = 0;

            for (int i = 0; i < numExecutions; i++) {
                int[] array = GerarVetor.gerarVetor(size);

                int[] arrayCopy = Arrays.copyOf(array, array.length);
                long inicio = System.nanoTime();
                MergeSort.executarMergeSort(arrayCopy);
                long fim = System.nanoTime();
                mergeSortTime += (fim - inicio);

                arrayCopy = Arrays.copyOf(array, array.length);
                inicio = System.nanoTime();
                BubbleSort.executarBubbleSort(arrayCopy);
                fim = System.nanoTime();
                bubbleSortTime += (fim - inicio);

                arrayCopy = Arrays.copyOf(array, array.length);
                inicio = System.nanoTime();
                SelectionSort.executarSelectionSort(arrayCopy);
                fim = System.nanoTime();
                selectionSortTime += (fim - inicio);

                arrayCopy = Arrays.copyOf(array, array.length);
                inicio = System.nanoTime();
                InsertionSort.executarInsertionSort(arrayCopy);
                fim = System.nanoTime();
                insertionSortTime += (fim - inicio);

            }

            System.out.println("\nTamanho do vetor: " + size);
            System.out.println("MergeSort tempo: " + (mergeSortTime / numExecutions) + " ns");

            System.out.println("BubbleSort tempo: " + (bubbleSortTime / numExecutions) + " ns");

            System.out.println("SelectionSort tempo: " + (selectionSortTime / numExecutions) + " ns");

            System.out.println("InsertionSort tempo: " + (insertionSortTime / numExecutions) + " ns");
        }
    }
}
