package Hash;

import java.util.Hashtable;

public class HashTable_Main {
    public static void main(String[] args){
        String[] valores = {"44", "46", "49", "70", "27", "71", "90", "97", "95"};
        HashTable hash = new HashTable(7);
        hash.enderecamentoAbertoOff();
        hash.useRehashOn();
        for(String elementos : valores){
            hash.inserir(elementos);
        }

        System.out.println(hash.toString());

    }
}
