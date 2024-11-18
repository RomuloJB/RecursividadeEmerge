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
    }
}
