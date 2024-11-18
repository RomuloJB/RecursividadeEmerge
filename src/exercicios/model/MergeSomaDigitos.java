package exercicios.model;

public class MergeSomaDigitos {
    public static void executarMergeSomaDigitos() {
        int numero = 12345;
        int soma = somaDigitos(numero);
        System.out.println("A soma dos dígitos de " + numero + " é: " + soma);
    }

    public static int somaDigitos(int numero) {
        if (numero == 0) {
            return 0;
        }
        return (numero % 10) + somaDigitos(numero / 10);
    }
}
