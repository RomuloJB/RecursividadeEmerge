package exercicios.model;

public class MergeString {

    public static void mergeString(String[] vetor) {
        if (vetor.length < 2) {
            return;
        }
        int mid = vetor.length / 2;
        String[] esquerda = new String[mid];
        String[] direita = new String[vetor.length - mid];

        System.arraycopy(vetor, 0, esquerda, 0, mid);
        System.arraycopy(vetor, mid, direita, 0, vetor.length - mid);

        mergeString(esquerda);
        mergeString(direita);
        merge(vetor, esquerda, direita);
    }

    private static void merge(String[] vetor, String[] esquerda, String[] direita) {
        int i = 0, j = 0, k = 0;
        while (i < esquerda.length && j < direita.length) {
            if (esquerda[i].compareTo(direita[j]) <= 0) {
                vetor[k++] = esquerda[i++];
            } else {
                vetor[k++] = direita[j++];
            }
        }
        while (i < esquerda.length) {
            vetor[k++] = esquerda[i++];
        }
        while (j < direita.length) {
            vetor[k++] = direita[j++];
        }
    }

    public static void executarMergeString(String[] vetor) {
        //String[] vetor = {"banana", "apple", "orange", "grape", "pear"};
        mergeString(vetor);
        System.out.println("Sorted array: ");
        for (String v : vetor) {
            System.out.println(v);
        }
    }
}
