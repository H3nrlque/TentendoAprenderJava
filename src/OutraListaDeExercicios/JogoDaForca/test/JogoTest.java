package OutraListaDeExercicios.JogoDaForca.test;

import java.util.Random;
import java.util.Scanner;

public class JogoTest {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("===== JOGO DA FORCA ======");
        String palavraSorteada = sortearPalavra(numeroAleatorio());
        String progresso = "-".repeat(palavraSorteada.length());
        System.out.println("Tente acertar a palavra");
        System.out.println("Palavra sorteada: " + progresso);
        String palavraDigitada;
        int tentativas = 5;
        do {
            System.out.print("Digite uma letra: ");
            char l = tc.next().charAt(0);
            progresso = atualizarPalavra(palavraSorteada, l, progresso);
            System.out.println("Palavra: " + progresso);
            System.out.print("Deseja digitar a palavra: ");
            char res = tc.next().charAt(0);
            tentativas--;
            if (res == 'n') {
                System.out.println("Tentativas restantes: "+tentativas);
                return;
            }
            System.out.print("Digite qual é a palavra: ");
            palavraDigitada = tc.nextLine();
            verificarPalavra(palavraSorteada, palavraDigitada);
        } while ((!palavraDigitada.equalsIgnoreCase(palavraSorteada)) || tentativas >= 5);
        System.out.println("Tentativas restantes: "+tentativas);
    }

    private static int numeroAleatorio() {
        Random random = new Random();
        int min = 1;
        int max = 5;
        return random.nextInt((max - min) + 1) + min;
    }

    private static String sortearPalavra(int n) {
        String[] palavras = {"Força", "Aumento", "Futebol", "Garimpo", "Arcar", "Combate"};


        return palavras[n];
    }

    private static String atualizarPalavra(String palavraSorteada, char l, String progresso) {
        StringBuilder temp = new StringBuilder(progresso);
        for (int i = 0; i < palavraSorteada.length(); i++) {
            if (palavraSorteada.charAt(i) == l) {
                temp.setCharAt(i, l);
            }
        }
        return temp.toString();
    }

    private static void verificarPalavra(String palavraSorteada, String palavraDigitada) {
        if (palavraDigitada.equalsIgnoreCase(palavraSorteada)) {
            System.out.println("Parabéns, você acertou!!!");
            System.out.println("Palavra sorteada: " + palavraSorteada);
        } else {
            System.out.println("HAAHAHAHA, você errou!!!!!");
        }
    }
}
