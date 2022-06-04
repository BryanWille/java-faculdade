package compressao;

public class Compressao {
    public static void main(String[] args) {
        String texto = "GaasssssssAAAABBBCCCCCCCDDDDDEEEEFFFGGG";
        //4A3B4C4D4E3F2G
        //4A 3B 4C 4D 4E 3F 2G
        System.out.println(comprimir(texto));
    }

    static String comprimir(String texto) {
        String compresso = "";
        int cont = 1;
        for (int i = 0; i < texto.length(); i++) {
            if (i + 1 < texto.length() && texto.charAt(i) == texto.charAt(i + 1)) {
                cont++;
            } else {
                compresso += cont + String.valueOf(texto.charAt(i)) + " ";
                cont = 1;
            }
        }
        return compresso;
    }

}
