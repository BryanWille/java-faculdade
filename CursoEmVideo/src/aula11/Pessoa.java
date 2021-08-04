package aula11;

public abstract class Pessoa {
    //Classe Abstrata não podemos instancar ela, somente suas sub-classes
    private String nome, sexo;
    private int idade;


    public final void fazerAniver(){
        this.idade ++;
        System.out.println(this.getNome() +", parabenś pelos seus " +this.getIdade());
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

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }
}
