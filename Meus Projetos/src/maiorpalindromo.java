public class maiorpalindromo {
    public static void main(String[] args) {
        int maiorPali = 0, multiplicacao;
        int[] numeros = new int[2];
        for (int cont = 100; 999 > cont; cont++) {
            for (int aux = 100; 999 > aux; aux++) {
                multiplicacao = aux * cont;
                if (digito(multiplicacao, 1) == digito(multiplicacao, 6) &&
                        digito(multiplicacao, 2) == digito(multiplicacao, 5)
                        && digito(multiplicacao, 3) == digito(multiplicacao, 4)) {
                    if(multiplicacao > maiorPali){
                        maiorPali = multiplicacao;
                        numeros[0] = cont;
                        numeros[1] = aux;
                    }
                }
            }
        }
        System.out.printf("O maior palíndromo do produto de três algarismos é " +
                "%d * %d = %d ", numeros[0], numeros[1], maiorPali);
    }
    static int digito(int valor, int posicao) {
        int numero;
        numero = (valor / (int) Math.pow(10, (posicao - 1))) % 10;
        return numero;
    }
}
