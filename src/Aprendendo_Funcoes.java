public class Aprendendo_Funcoes {
    public static void main(String[] args) {

        int primeiroNumero = 10;
        int segundoNumero = 20;

        int soma = primeiroNumero + segundoNumero;
        int subtracao = primeiroNumero - segundoNumero;
        int multiplicacao = primeiroNumero * segundoNumero;
        int divisao = primeiroNumero / segundoNumero;

        int somaViaFuncao = somarValores(primeiroNumero, segundoNumero);
        System.out.println("Valor soma: " + somaViaFuncao);

        int subtracaoViaFuncao = subtrairValores(-50,25);
        System.out.println("Valor subtração: " + subtracaoViaFuncao);

        int multiplicacaoViaFuncao = multiplicarValores(2,2);
        System.out.println("Valor multiplicação: " + multiplicacaoViaFuncao);

        int divisaoViaFuncao = dividirValores(100,2);
        System.out.println("Valor divisão: " + divisaoViaFuncao);
    }
    public static int somarValores(int numA, int numB) {
        return numA + numB;
    }

    public static int subtrairValores(int numA, int numB) {

        if (numA < 0){
            numA *= -1;
        }
        return numA - numB;
    }

    public static int multiplicarValores(int numA, int numB) {
        if (numA == 0 || numB == 0){
            return 0;
        }
        return numA * numB;
    }

    public static int dividirValores(int numA, int numB) {
        if (numA == 0 || numB == 0){
            return 0;
        }
        return numA / numB;
    }
}