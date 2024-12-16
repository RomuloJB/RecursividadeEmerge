package exercicios.model;

public class InverteString {
    public static void executarInverteString() {
        String str = "exemplo";
        String invertida = inverterString(str);
        System.out.println("String original: " + str);
        System.out.println("String invertida: " + invertida);
    }

    public static String inverterString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return inverterString(str.substring(1)) + str.charAt(0);
        //substring pega a string a partir do indice 1 enquanto o chatAt pega a o caractere da posição 0 e vai retornando ele até que a str fique vazia
    }
}
