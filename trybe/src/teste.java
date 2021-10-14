import java.io.*;
import java.util.ArrayList;

public class teste {
    public static void main(String[] args){
        ArrayList<Integer> teste = new ArrayList<>();
        teste.add(2);
        teste.add(4);
        teste.add(5);
        teste.add(5);
        System.out.println(tripleTheChances(teste));
    }

    public static ArrayList<Integer> tripleTheChances(ArrayList<Integer> chances) {
        ArrayList<Integer> triple = new ArrayList<>();
        for(int i = 0; i < chances.size(); i++){
            chances.add(i, (chances.get(i)*3));
        }
        return chances;
    }
}
