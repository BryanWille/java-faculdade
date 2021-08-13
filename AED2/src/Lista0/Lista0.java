package Lista0;
import java.util.Scanner;

public class Lista0 {
    private static Scanner keyb;
    public static void main(String[] args){
        int opcao;
        keyb = new Scanner(System.in);
        do {
            System.out.println("\nQual exercício você quer selecionar?");
            System.out.print("\n[0]Sair \n[1]Valor Absoluto \n[2]Conversor de Temperaturas " +
                    "\n[3]Conversor de Medidas \n[4]Laços \n[5]Quadrado Perfeito " +
                    "\n[6]Furacões \n[7]Potência de Dois \n[8]Número Primo \n>>> ");
            opcao = keyb.nextInt();
            switch (opcao) {
                case 0:
                    System.out.println("Ok Fechando! :(");
                    break;
                case 1:
                    valorAbsoluto();
                    break;
                case 2:
                    conversorTemperatura();
                    break;
                case 3:
                    conversorMedidas();
                    break;
                case 4:
                    lacos();
                    break;
                case 5:
                    quadradoPerfeito();
                    break;
                case 6:
                    furacoes();
                    break;
                case 7:
                    potenciaDois();
                    break;
                case 8:
                    System.out.println("Digite um número inteiro: ");
                    int numInt = keyb.nextInt();
                    System.out.println((numeroPrimo(numInt) == 1 ? "Seu número é primo! " : "Seu número não é primo!"));
            }
        } while (opcao != 0);
    }

    public static void valorAbsoluto(){
        keyb = new Scanner(System.in);
        System.out.println("Digite o seu número: ");
        float num = keyb.nextFloat();
        if(num < 0){
            num *= -1;
        }
        System.out.println("Seu número fica: " +num);
    }

    public static void conversorTemperatura(){
        keyb = new Scanner(System.in);
        float temperatura, conversao = 0;
        String medida = "";
        System.out.println("O que você quer converte?");
        System.out.println("\n[1]Celsius -> Fahrenheit \n[2]Fahrenheit -> Celsius");
        System.out.print(">>> ");
        int opcao = keyb.nextInt();
        System.out.println("Digite a temperatura: ");
        temperatura = keyb.nextFloat();
        switch(opcao){
            case 1:
                medida = "C° F°";
                conversao = temperatura * (9/5f) + 32;
                break;
            case 2:
                medida = "F° C°";
                conversao = (temperatura - 32) * (5/9f);
                break;
        }
        System.out.println(temperatura +medida.substring(0, 2) +" fica: "
                    +Math.floor(conversao) +medida.substring(4));
    }

    public static void conversorMedidas(){
        String medida = "";
        float polCm = 2.54f, pePol = 12, jarPe = 3, milJar = 1760;
        float conversao, converter;
        keyb = new Scanner(System.in);
        System.out.println("Vamos transformar medidas em metros!");
        System.out.print("[1]Milhas \n[2]Jardas \n[3]Pés \n[4]Polegadas \n>>> ");
        int opcao = keyb.nextInt();
        System.out.println("Qual a medida: ");
        converter = keyb.nextFloat();
        conversao = converter;
        switch (opcao){
            case 1:
                medida = "milhas";
                conversao *= milJar * jarPe * pePol * polCm;
                break;
            case 2:
                medida = "jardas";
                conversao *= jarPe * pePol * polCm;
                break;
            case 3:
                medida = "pés";
                conversao *= pePol * polCm;
                break;
            case 4:
                medida = "polegadas";
                conversao *= polCm;
        }
        conversao /= 100;
        System.out.println(converter +" " +medida +" para metros é igual a: " +conversao);
    }

    public static void lacos(){
        keyb = new Scanner(System.in);
        System.out.println("Quantas repetições você quer? ");
        int repet = keyb.nextInt();
        System.out.println("\n For: ");
        for(int cont = repet; cont >= 0; cont--){
            System.out.print("*");
        }
        System.out.println("\n While: ");
        int conta = repet;
        while(conta >= 0){
            System.out.print("*");
            conta --;
        }
        System.out.println("\n Do While: ");
        do{
            System.out.print("*");
            repet --;
        } while (repet >= 0);
    }

    public static void quadradoPerfeito(){
        boolean quadrado = false;
        int somador = 0;
        keyb = new Scanner(System.in);
        System.out.println("Vamos descobrir se seu número é um quadrado perfeito!");
        System.out.println("Digite seu número: ");
        int numero = keyb.nextInt();
        for(int cont = 1; numero > somador; cont+=2){
            somador += cont;
            quadrado = (numero == somador);
            System.out.print(cont +" > " +somador +"  ");
        }
        System.out.println("\n" +(quadrado ? "Seu número é um quadrado perfeito" : "seu número não é um quadrado perfeito"));
    }

    public static void furacoes(){
        String status = "";
        keyb = new Scanner(System.in);
        System.out.println("Vamos verificar a escala do atual furacão");
        System.out.println("Digite a velocidade do furacão em km/h");
        float velocidade = keyb.nextFloat();
        if (velocidade <= 118 && velocidade >= 62){
            status = "Tempestade tropical";
        } else if (velocidade < 153){
            status = "Furacão categoria 1";
        } else if (velocidade <= 177){
            status = "Furacão categoria 2";
        } else if (velocidade <= 209){
            status = "Furacao categoria 3";
        } else if (velocidade <= 249){
            status = "Furacão categoria 4";
        } else if (velocidade > 249) {
            status = "Furacao categoria 5";
        } else {
            System.out.println("Velocidade muito baixa!");
        }

        System.out.println("A Categoria do seu furacão é: " +status);
    }

    public static void potenciaDois() {
        int numero, potencia = 0, maxDigito;
        boolean testeLogico = false;
        keyb = new Scanner(System.in);
        System.out.println("Vamos verificar se seu número é uma potência de dois!");
        System.out.println("Digite o seu número: ");
        numero = keyb.nextInt();
        if (numero % 2 != 0 && numero != 1) {
            System.out.println("Seu número não pode ser uma potência de dois, pois é diferente de um e ímpar");
        } else if(numero == 1){
            testeLogico = true;
        } else {
            maxDigito = (int) Math.pow(numero, 1/2f);
            for(int cont = 1; cont <= maxDigito; cont++){
                if(Math.pow(2, cont) == numero){
                    testeLogico = true;
                    potencia = cont;
                    break;
                }
            }
        }
        System.out.println(testeLogico ? ("Seu número é uma potência de dois e é: " +potencia) :
                "infelizmente seu número não é uma potência de dois");
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

    public static void numeroPrimo(){
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
    }
}