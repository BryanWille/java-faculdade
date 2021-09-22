package Prova1;

public class prova1 {
    public static void main(String[] args){
        System.out.println(MDCRecursivo(12, 18));
        System.out.println(potenciaIterativa(2, 5));
    }
    public static int MDCRecursivo(int a, int b){
        if(b < 1) {
            return a;
        } else {
            return MDCRecursivo(b, a % b);
        }
    }

    public static int potenciaIterativa(int base, int expoente){
        int num = base;
        for(int cont = 1; cont < expoente; cont++){
            num *= base;
        }
        return num;
    }

    public static boolean primoRecursivo(int num){
        return true;
    }
}
