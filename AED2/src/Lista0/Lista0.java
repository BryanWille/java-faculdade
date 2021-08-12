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
                    "\n[6]Furacões \n[7]Potência de Dois \n>>> ");
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

}
