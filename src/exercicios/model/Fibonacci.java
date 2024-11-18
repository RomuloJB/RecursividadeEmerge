package exercicios.model;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 0) {
            System.out.println("O valor de n deve ser maior que zero.");
            return 0;
        }
        else if (n == 1 || n == 2) {
            return 1;
        }else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void executarFibonacci() {
        int n = 10; //exemplo
        int result = fibonacci(n);
        System.out.println("O " + n + "-ésimo termo da sequência de Fibonacci é: " + result);
    }
}
