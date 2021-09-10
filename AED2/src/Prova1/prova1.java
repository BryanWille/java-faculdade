package Prova1;

public class prova1 {
    public static void main(String[] args){
        System.out.println(potenciaIterativa(5, 4));
    }
    public static void MDCRecursivo(int a, int b){
        int n = 0;
        if( a % n > 0 || b % n > 0){
            System.out.println("Teste");
        }
    }

    public static int potenciaIterativa(int base, int expoente){
        int num = base;
        for(int cont = 1; cont <= expoente; cont++){
            num *= base;
            System.out.println((num *= base));
        }
        return num;
    }
}
