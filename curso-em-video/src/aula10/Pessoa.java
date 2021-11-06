package aula10;

public class Pessoa {
    private String nome, sexo;
    private int idade;

    /*public Pessoa(String nome, int idade, String sexo){
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setNome(nome);
    } */

    public void fazerAniver(){
        System.out.println("Parabéns!" +this.getNome() +" Feliz aníversario!");
        this.setIdade(this.getIdade() + 1);
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
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
