package ExerciciosRegex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificandoNumeroHexaDecimal {
    public static void main(String[] args) {
        // Padrão para encontrar um número hexadecimal
        String regex2 = "0[xX]([0-9a-fA-F])+(\\s|$)";

        // texto onde devo procurar
        String texto2 = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex2); // passando o padrão
        Matcher matcher = pattern.matcher(texto2); // chamando o buscador e passando o texto

        // Definindo o número de posições que precisarei nos meus vetores
        int c = contador(matcher);

        // criando meus vetores de n posições = c
        String[] stringHex = new String[c];
        int[] numeroHex = new int[c];

        // Passando o valores encontrados no meu buscador para o meu vetor de Strings
        stringHex = stringHex(stringHex, matcher);

        // Transformando os valores dentro do vetor de Strings para inteiro e passando para o vetor de inteiros
        numeroHex = numerosHex(numeroHex, stringHex);

        // Exibindo os números HexaDecimais encontrados
        System.out.println("Número HexaDecimais encontrados");
        for (int hex : numeroHex) {
            System.out.println(hex);
        }
    }

    private static int contador(Matcher matcher) {
        int c = 0;
        while (matcher.find()) {
            c++;
        }
        return c;
    }

    private static String[] stringHex(String[] stringsHex, Matcher matcher) {
        for (int i = 0; i < stringsHex.length; i++) {
            if (matcher.find()) {
                stringsHex[i] = matcher.group();
                stringsHex[i] = stringsHex[i].replace("0x", "");
            }
        }
        return stringsHex;

    }

    private static int[] numerosHex(int[] numerosHex, String[] stringsHex) {
        for (int i = 0; i < numerosHex.length; i++) {
            stringsHex[i] = stringsHex[i].trim();
            numerosHex[i] = Integer.parseInt(stringsHex[i], 16);
            System.out.println(numerosHex[i]);
        }
        return numerosHex;
    }
}
