package exercicios.model;

public class ContagemCaracteres {

    public static void executarContagemCaracteres() {
        String texto = "exemplo de string";
        char caractere = 'e';
        int contagem = contarOcorrencias(texto, caractere, 0);
        System.out.println("O caractere '" + caractere + "' aparece " + contagem + " vezes na string.");
    }

    public static int contarOcorrencias(String texto, char caractere, int indice) {
        if (indice >= texto.length()) {
            return 0;
        }
        int contagemAtual = (texto.charAt(indice) == caractere) ? 1 : 0;
        return contagemAtual + contarOcorrencias(texto, caractere, indice + 1);
    }
}
