package lzw;


import java.util.LinkedHashMap;
import java.util.Map;

public class TestesHash {
    public static void main(String[] args) {
        Map<Integer, Integer> dicionario = new LinkedHashMap<>();
        int[] vetor = {1, 2, 3, 4, 5, 6, 6, 6, 7};
        int incrementar = 6;
        for (int ele : vetor){
            if(dicionario.get(ele) == null) {
                dicionario.put(ele, incrementar);
                incrementar--;
            }
        }
        System.out.println(dicionario.toString());
    }
}
