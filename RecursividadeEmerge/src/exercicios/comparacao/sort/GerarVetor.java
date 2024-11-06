package exercicios.comparacao.sort;

import java.util.Random;

public class GerarVetor {

    public static int[] gerarVetor(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

}
