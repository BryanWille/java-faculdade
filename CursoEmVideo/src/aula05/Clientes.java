package aula05;

public class Clientes {
    public static void main(String[] args) {
        Banco Jubileu = new Banco();
        Banco Creuza = new Banco();

        Jubileu.setNome("Jubileu");
        Jubileu.setNumConta("123");
        Jubileu.abrirConta("CP");
        Jubileu.setSaldo(0);
        Jubileu.depositar(300);
        Jubileu.pagarMensal();
        Jubileu.status();

        System.out.println("\n");

        Creuza.setNome("Creuza");
        Creuza.setNumConta("456");
        Creuza.abrirConta("CC");
        Creuza.depositar(500);
        Creuza.sacar(100);
        Creuza.status();
        Creuza.fecharConta();
    }
}
