package exercicios.comparacao.sort;

public class InsertionSort {
    public static int cont = 0;

    public static void executarInsertionSort(int[] vetor) {
        int tamanho = vetor.length;

        for (int i = 1; i < tamanho; i++) {
            int chave = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
                cont++;

            }
            vetor[j + 1] = chave;

        }
    }
}
