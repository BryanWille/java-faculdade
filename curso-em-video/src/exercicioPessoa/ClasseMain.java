package exercicioPessoa;

public class ClasseMain {
    public static void main(String[] args){
        Rica bryan = new Rica(3000, 18, "Bryan");
        Pobre jose = new Pobre("José", 44);
        Miseravel josiscreudo = new Miseravel("Josiscreudo", 23);

        bryan.fazCompras();
        jose.trabalha();
        josiscreudo.mendinga();
    }
}
