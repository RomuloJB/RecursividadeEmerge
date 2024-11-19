package exercicios.main;

import exercicios.model.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] matriz = {
            {5, 4, 3, 2, 1},
            {10, 9, 8, 7, 6},
            {15, 14, 13, 12, 11}
        };

        int vetor[] = { 2, 1, 4, 5, 3 };

        String[] vetorString = { "Romulo", "Messi", "Neymar", "Cristiano", "Ronaldo" };


        // ex 1
        System.out.println("-----------Exercicio 1-----------");
        MergeSortMatriz.executarMergeSortMatriz(matriz);
        // ex 2
        System.out.println("\n-----------Exercicio 2-----------");
        MergeSortObjetos.executarMergeSortObjetos();
        // ex 3
        System.out.println("\n-----------Exercicio 3-----------");
        MergeString.executarMergeString(vetorString);
        // ex 4
        System.out.println("\n-----------Exercicio 4-----------");
        Palindromo.executarPalindromo();
        // ex 5
        System.out.println("\n-----------Exercicio 5-----------");
        MergeSoma.executarMergeSoma(vetor);
        // ex 6
        System.out.println("\n-----------Exercicio 6-----------");
        ContagemCaracteres.executarContagemCaracteres();
        // ex 7
        System.out.println("\n-----------Exercicio 7-----------");
        Fibonacci.executarFibonacci();
        // ex 8
        System.out.println("\n-----------Exercicio 8-----------");
        MergeSomaDigitos.executarMergeSomaDigitos();
        // ex 9
        System.out.println("\n-----------Exercicio 9-----------");
        InverteString.executarInverteString();
        
    }
}
