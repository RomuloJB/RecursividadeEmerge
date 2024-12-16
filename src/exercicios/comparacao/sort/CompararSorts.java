package exercicios.comparacao.sort;

import java.util.Arrays;

public class CompararSorts {

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000, 1000000};
        int numExecutions = 1;

        for (int size : sizes) {
            double mergeSortTime = 0;
            double bubbleSortTime = 0;
            double selectionSortTime = 0;
            double insertionSortTime = 0;

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
            System.out.println("MergeSort tempo: " + (mergeSortTime / numExecutions / 1000000000) + " s");

            System.out.println("BubbleSort tempo: " + (bubbleSortTime / numExecutions / 1000000000) + " s");

            System.out.println("SelectionSort tempo: " + (selectionSortTime / numExecutions / 1000000000) + " s");

            System.out.println("InsertionSort tempo: " + (insertionSortTime / numExecutions / 1000000000) + " s");
        }
    }
}
