package aula09;

public class Aula09 {
    public static void main(String[] args){
        /* Pessoa Bryan = new Pessoa("Bryan", "Masculino", 18);
        Livro Physics = new Livro("Uma Breve História do Tempo", "Stephen Hawking",
                256, 1, false, Bryan);

        Physics.abrir();
        Physics.detalhes();
        Physics.fechar();
        Physics.avancarPag(); */

        Pessoa[] p = new Pessoa[2];
        Livro [] l = new Livro[3];

        p[0] = new Pessoa("Pedro", "M", 22);
        p[1] = new Pessoa("Maria", "F", 25);

        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[0]);

        l[0].detalhes();
    }
}
