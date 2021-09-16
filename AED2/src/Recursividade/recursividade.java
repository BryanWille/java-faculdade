package Recursividade;
import java.util.Scanner;

public class recursividade {
    private static Scanner keyb;
    public static void main(String[] args){
        System.out.println(fibonacciRecursivo(5));
    }

    public static int fibonacciRecursivo(int termo){
        if (termo <= 1){
            return 1;
        } else {
            return fibonacciRecursivo(termo - 1) + fibonacciRecursivo(termo - 2);
        }
    }
}
