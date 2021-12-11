package Hash;



public class HashTable_Main {
    public static void main(String[] args){
        //String[] valores = {"44", "46", "49", "70", "27", "71", "90", "97", "95"};
        String valores [] = {"5","8","1","3","9","6","2","7","4"};
        HashTable hash = new HashTable(4);
        hash.enderecamentoAbertoOn();
        hash.useRehashOff();
        for(String elementos : valores){
            hash.inserir(elementos);
            System.out.println(Integer.parseInt(elementos) % 7);
        }

        System.out.println(hash.toString());

    }
}
