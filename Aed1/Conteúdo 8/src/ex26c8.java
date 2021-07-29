//Esse programa vai uma piramide de caracteres apartir da exponenciação da base 2
public class ex26c8 {
    public static void main(String[] args) {
        for (int cont = 0; 10 > cont; cont++) { //Isso aqui vai repetir a dez vezes a sequência
            for (int c = 0; 7 >= c; c++) { //Apartir disso nos vamos calcular a potência
                //Nesse for abaixo, começamos com contador 0, e enquanto a potência elevada que c, o contador vai continuar repetindo.
                //ex 4>1 *, 4>2 **, 4>3 ***, 4>4 ****, e toda vez que o contador fica maior que c, o loop acaba, e c fica maior, então volta o loop pra 5...
                //Então chegamos ao padrão de 2 ao quadrado
                for (int contador = 0; Math.pow(2, c) > contador; contador++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            for (int c = 0; 7 >= c; c++) { //Apartir disso nos vamos calcular a potência
                for (int contador = 128; Math.pow(2, c) <= contador; contador -= Math.pow(2, c)) {
                    //O contador já começa no 128, e enquanto ele for maior que a potência elevada a 2, ele vai subtrair dessa potência e fazer a repetição até
                    // o contador ser menor.
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
