package exercicioPessoa;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.setIdade(idade);
        this.setNome(nome);
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
}
