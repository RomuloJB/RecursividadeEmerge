package exercicios.model;

import java.util.Arrays;


public class MergeSortObjetos {
    public static void executarMergeSortObjetos() {
        System.out.println("Início");

        Pessoa[] pessoas = {
            new Pessoa("Morgan Wallen", 31),
            new Pessoa("Tyler Childers", 33),
            new Pessoa("Colter Wall", 29),
            new Pessoa("Chris Stapleton", 46)
        };

        Pessoa[] auxiliar = new Pessoa[pessoas.length];
        mergeSort(pessoas, auxiliar, 0, pessoas.length - 1, "idade");
        System.out.println(Arrays.toString(pessoas));
    }

    private static void mergeSort(Pessoa[] array, Pessoa[] auxiliar, int inicio, int fim, String atributo) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(array, auxiliar, inicio, meio, atributo);
            mergeSort(array, auxiliar, meio + 1, fim, atributo);
            merge(array, auxiliar, inicio, meio, fim, atributo);
        }
    }

    private static void merge(Pessoa[] array, Pessoa[] auxiliar, int inicio, int meio, int fim, String atributo) {
        for (int i = inicio; i <= fim; i++) {
            auxiliar[i] = array[i];
        }

        int esquerda = inicio;
        int direita = meio + 1;
        int k = inicio;

        while (esquerda <= meio && direita <= fim) {
            if (compare(auxiliar[esquerda], auxiliar[direita], atributo) <= 0) {
                array[k] = auxiliar[esquerda];
                esquerda++;
            } else {
                array[k] = auxiliar[direita];
                direita++;
            }
            k++;
        }

        while (esquerda <= meio) {
            array[k] = auxiliar[esquerda];
            esquerda++;
            k++;
        }

        while (direita <= fim) {
            array[k] = auxiliar[direita];
            direita++;
            k++;
        }
    }

    private static int compare(Pessoa p1, Pessoa p2, String atributo) {
        switch (atributo) {
            case "idade":
                return Integer.compare(p1.idade, p2.idade);
            default:
                throw new IllegalArgumentException("Atributo não suportado: " + atributo);
        }
    }
}

class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome +" "+ idade;
    }
}

