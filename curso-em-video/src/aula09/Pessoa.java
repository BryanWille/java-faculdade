package aula09;

public class Pessoa {
    private String nome, sexo;
    private int idade;

    public Pessoa(String nome, String sexo, int idade){
        this.setNome(nome);
        this.setSexo(sexo);
        this.setIdade(idade);
    }


    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
        System.out.println("Parabéns" +this.getNome() +" pelos seus " +this.getIdade() +" !");
    }


    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
}
