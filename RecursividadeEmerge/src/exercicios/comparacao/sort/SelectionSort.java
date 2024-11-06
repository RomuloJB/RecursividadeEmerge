package exercicios.comparacao.sort;

public class SelectionSort {
    public static int cont = 0;

    public static void executarSelectionSort(int[] vetor) {
        int tamanho = vetor.length;

        for (int i = 0; i < tamanho; i++) {
            int menorIndice = i;
            for (int j = i + 1; j < tamanho; j++) {
                if (vetor[j] < (vetor[menorIndice])) {
                    menorIndice = j;
                }
            }
            if (menorIndice != i) {
                int temp = vetor[i];
                vetor[i] = vetor[menorIndice];
                vetor[menorIndice] = temp;
                cont++;
            }
        }
    }
}