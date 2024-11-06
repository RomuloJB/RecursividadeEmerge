package exercicios.model;

public class MergeSoma {

    public static void mergeSort(int[] vetor, int[] auxiliar, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, auxiliar, inicio, meio);
            mergeSort(vetor, auxiliar, meio + 1, fim);
            merge(vetor, auxiliar, inicio, meio, fim);
        }
    }

    private static void merge(int[] vetor, int[] auxiliar, int inicio, int meio, int fim) {
        for (int i = inicio; i <= fim; i++) {
            auxiliar[i] = vetor[i];
        }

        int esquerda = inicio;
        int direita = meio + 1;

        for (int j = inicio; j <= fim; j++) {
            if (esquerda > meio) {
                vetor[j] = auxiliar[direita++];
            } else if (direita > fim) {
                vetor[j] = auxiliar[esquerda++];
            } else if (auxiliar[esquerda] < auxiliar[direita]) {
                vetor[j] = auxiliar[esquerda++];
            } else {
                vetor[j] = auxiliar[direita++];
            }
        }
    }

    public static int mergeSoma(int[] vetor) {
        return mergeSoma(vetor, 0);
    }

    private static int mergeSoma(int[] vetor, int indice) {
        if (indice == vetor.length) {
            return 0;
        }
        return vetor[indice] + mergeSoma(vetor, indice + 1);
    }

    public static void executarMergeSoma(int[] vetor) {
        int[] auxiliar = new int[vetor.length];

        mergeSort(vetor, auxiliar, 0, vetor.length - 1);
        System.out.println("Array ordenado: " + java.util.Arrays.toString(vetor));

        int soma = mergeSoma(vetor);
        System.out.println("Soma dos elementos: " + soma);
    }
}