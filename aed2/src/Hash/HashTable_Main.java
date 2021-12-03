package Hash;

import java.util.Hashtable;

public class HashTable_Main {
    public static void main(String[] args){
        String[] valores = {"36", "18", "72", "43", "6", "10", "5", "15", "0"};
        HashTable hash = new HashTable(8);
        hash.enderecamentoAbertoOn();
        hash.useRehashOff();
        for(String elementos : valores){
            hash.inserir(elementos);
        }

        System.out.println(hash.toString());

        System.out.println(hash.numeroColisoes());

    }
}
