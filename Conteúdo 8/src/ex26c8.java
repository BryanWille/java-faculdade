//Esse programa vai uma piramide de caracteres apartir da exponencia��o da base 2
public class ex26c8 {
    public static void main(String[] args) {
        for (int cont = 0; 10 > cont; cont++) { //Isso aqui vai repetir a dez vezes a sequ�ncia
            for (int c = 0; 7 >= c; c++) { //Apartir disso nos vamos calcular a pot�ncia
                //Nesse for abaixo, come�amos com contador 0, e enquanto a pot�ncia elevada que c, o contador vai continuar repetindo.
                //ex 4>1 *, 4>2 **, 4>3 ***, 4>4 ****, e toda vez que o contador fica maior que c, o loop acaba, e c fica maior, ent�o volta o loop pra 5...
                //Ent�o chegamos ao padr�o de 2 ao quadrado
                for (int contador = 0; Math.pow(2, c) > contador; contador++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            for (int c = 0; 7 >= c; c++) { //Apartir disso nos vamos calcular a pot�ncia
                for (int contador = 128; Math.pow(2, c) <= contador; contador -= Math.pow(2, c)) {
                    //O contador j� come�a no 128, e enquanto ele for maior que a pot�ncia elevada a 2, ele vai subtrair dessa pot�ncia e fazer a repeti��o at�
                    // o contador ser menor.
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
