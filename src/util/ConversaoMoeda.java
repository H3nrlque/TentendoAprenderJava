package util;

public class ConversaoMoeda {
    public  double valor;
    public  double cotacao;
    public int opcaoMoeda;
    public int opcaoConverter;


    public void Escolha() {

        if (opcaoMoeda == 1) {
            System.out.println("[2] Dólar");
            System.out.println("[3] Euro");
            System.out.println("[4] Libra");
            System.out.println("[5] Iene");
            System.out.println("[6] Peso Argentino");
            System.out.println("[7] Sair");
        } else if (opcaoMoeda == 2) {
            System.out.println("[1] Real");
            System.out.println("[3] Euro");
            System.out.println("[4] Libra");
            System.out.println("[5] Iene");
            System.out.println("[6] Peso Argentino");
            System.out.println("[7] Sair");
        } else if (opcaoMoeda == 3) {
            System.out.println("[1] Real");
            System.out.println("[2] Dólar");
            System.out.println("[4] Libra");
            System.out.println("[5] Iene");
            System.out.println("[6] Peso Argentino");
            System.out.println("[7] Sair");
        } else if (opcaoMoeda == 4) {
            System.out.println("[1] Real");
            System.out.println("[2] Dólar");
            System.out.println("[3] Euro");
            System.out.println("[5] Iene");
            System.out.println("[6] Peso Argentino");
            System.out.println("[7] Sair");
        } else if (opcaoMoeda == 5) {
            System.out.println("[1] Real");
            System.out.println("[2] Dólar");
            System.out.println("[3] Euro");
            System.out.println("[4] Libra");
            System.out.println("[6] Peso Argentino");
            System.out.println("[7] Sair");
        } else if (opcaoMoeda == 6) {
            System.out.println("[1] Real");
            System.out.println("[2] Dólar");
            System.out.println("[3] Euro");
            System.out.println("[4] Libra");
            System.out.println("[5] Iene");
            System.out.println("[7] Sair");
        }
    }

    public String Info() {
        return switch (opcaoConverter) {
            case 1 -> "Cotação do Real: R$ ";
            case 2 -> "Cotação do dólar: U$ ";
            case 3 -> "Cotação do euro: € ";
            case 4 -> "Cotação da libra: £ ";
            case 5 -> "Cotação do iene: ¥ ";
            case 6 -> "Cotação do peso argentino: $ ";
            default -> "Saindo...";
        };
    }

    public  String Valor() {
        return switch (opcaoMoeda) {
            case 1 -> "Digite o valor em Reais: R$ ";
            case 2 -> "Digite o vaor em Dolares: U$ ";
            case 3 -> "Digite o valor em Euros: € ";
            case 4 -> "Digite o valor em Libra: £ ";
            case 5-> "Digite o valor em Iene: ¥ ";
            case 6 -> "Digite o valor em Peso Argentino: $ ";
            default -> "Saindo...";
        };
    }

    public double Final() {
        return Math.round(valor * cotacao);
    }

    public String Resultado() {
         return switch (opcaoConverter) {
             case 1 -> "Valor em Real: R$: ";
             case 2 -> "Valor em dólar: U$ ";
             case 3 -> "Valor eu euro: € ";
             case 4 -> "Valor em libra: £ ";
             case 5 -> "Valor em iene: ¥ ";
             case 6 -> "Valor em peso argentino: $ ";
             default -> "Saindo...";
        };
    }

    @Override
    public String toString() {
        return Resultado()
               +String.format("%.2f",Final());
    }
}
