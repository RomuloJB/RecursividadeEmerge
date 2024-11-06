package exercicios.comparacao.sort;

public class BubbleSort {
    static boolean trocou = true;
    static int cont = 0;

    public static void executarBubbleSort(int[] vetor){
        do{
            trocou = false;
            for(int i = 0; i < vetor.length -1; i++){
                if(vetor[i] > vetor[i + 1]){
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    cont++;

                    trocou = true;
                }
            }
        }
        
    while(trocou);
    }

}
