package exercicios.model;

public class MergeString {

    public static void mergeString(String[] vetor) {
        if (vetor.length < 2) {
            return;
        }
        int meio = vetor.length / 2;
        String[] esquerda = new String[meio];
        String[] direita = new String[vetor.length - meio];

        System.arraycopy(vetor, 0, esquerda, 0, meio);
        System.arraycopy(vetor, meio, direita, 0, vetor.length - meio);

        mergeString(esquerda);
        mergeString(direita);
        intercalacao(vetor, esquerda, direita);
    }

    private static void intercalacao(String[] vetor, String[] esquerda, String[] direita) {
        
        int i = 0, j = 0;
        for (int k = 0; k < vetor.length; k++) {
            if (i >= esquerda.length) {
                vetor[k] = direita[j++];

            } else if (j >= direita.length) {
                vetor[k] = esquerda[i++];

            } else if (esquerda[i].compareTo(direita[j]) <= 0) {
                vetor[k] = esquerda[i++];

            } else {
                vetor[k] = direita[j++];
            }
        }
    }

    public static void executarMergeString(String[] vetor) {
        mergeString(vetor);
        System.out.println("Vetor ordenado: ");
        for (String v : vetor) {
            System.out.println(v);
        }
    }
}
