public class GoldenBach {
    public static void main(String[] args){
        //numeroPrimo();
    }

    public static int numeroPrimo(int numero) {
        int primo = 0, numPrim = 0;
        if (numero == 2) {
            primo = 1;
        } else if (numero % 2 == 0 || numero <= 1) {
            return primo;
        } else {
            for (int cont = 1; cont <= numero; cont += 2) {
                if (numero % cont == 0) {
                    numPrim++;
                }
            }
            if (numPrim == 2) {
                primo = 1;
            }
        }
        return primo;
    }

    /* public static void numeroPrimo(){
        int[] numPrimo = new int[1200]; //Vai armazenar quais valores entre 0 e 1200 são primos, sendo a posição o valor, e atributo se é primo ou não
        boolean[] check = new boolean[1201]; //Vai checar se a soma dos primos já foi assinada
        int[][] numPares = new int[251][3]; //Vai armazanar na primeira fila, um primo, na segunda outro primo, na terceira a soma desses primos.
        int somador = 0, somaPrimo;
        numPrimo[2] = 1;
        for(int cont = 1; cont < numPrimo.length; cont+= 2){
            numPrimo[cont] = numeroPrimo(cont); //Atribuição dos valores primos
        }
        for(int cont = 0; cont < numPrimo.length; cont++){
            if(numPrimo[cont] == 1){ // Remove todas os números não primos
                for(int aux = 0; aux < numPrimo.length; aux++){
                    if(numPrimo[aux] == 1){ // Remove todos os números não primos
                        somaPrimo = cont + aux; // Soma dos números primos
                        //Checa se a soma é par e esta entre 700 e 1200
                        if(somaPrimo % 2 == 0 && (somaPrimo <= 1200 && somaPrimo >= 700)){
                            //Checa se ja foi assinado o número (posição é igual a soma)
                            if(!check[somaPrimo]) {
                                check[somaPrimo] = true;
                                numPares[somador][0] = cont;
                                numPares[somador][1] = aux;
                                numPares[somador][2] = somaPrimo;
                                somador++;
                            }
                        }
                    }
                }
            }
        }

        //Bubble Sort

        int tempPrimoU, tempPrimoDois, tempSoma;

        for(int i = 0; i < numPares.length; i++ ){
            for(int j = 0; j < numPares.length-1; j++){
                if(numPares[j][2] > numPares[j+1][2]){
                    tempSoma = numPares[j][2];
                    numPares[j][2] = numPares[j+1][2];
                    numPares[j+1][2] = tempSoma;

                    tempPrimoU = numPares[j][0];
                    numPares[j][0] = numPares[j+1][0];
                    numPares[j+1][0] = tempPrimoU;

                    tempPrimoDois = numPares[j][1];
                    numPares[j][1] = numPares[j+1][1];
                    numPares[j+1][1] = tempPrimoDois;
                }
            }
        }


        for(int cont = 0; cont < numPares.length; cont++){
            System.out.println(numPares[cont][0] +" + " +numPares[cont][1] +" = " +numPares[cont][2]);
        }
    } */
}
