package aula11;

public class Aula011 {
    public static void main(String[] args){
        /* Visitante v1 = new Visitante();
        v1.setNome("josé");
        v1.setIdade(18);
        v1.setSexo("M");
        System.out.println(v1.toString()); */

        Aluno a1 = new Aluno();

        a1.setNome("Claúdio");
        a1.setMatricula(1111);
        a1.setCurso("Computação");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade(200);

        Bolsista b17 = new Bolsista();
        b17.setMatricula(1112);
        b17.setNome("Jubileu");
        b17.setBolsa(12.4f);
        b17.pagarMensalidade(300);
    }
}
