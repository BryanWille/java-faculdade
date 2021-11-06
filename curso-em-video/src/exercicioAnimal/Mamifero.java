package exercicioAnimal;

public class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String nome, String cor, String ambiente, float comprimento,
                    float velocidadeMedia, int numeroPatas, String alimento) {
        super(nome, cor, ambiente, comprimento, velocidadeMedia, numeroPatas);
        this.setAlimento(alimento);
    }

    public void dadosMamifero(){
        this.dados();
        System.out.print(", alimento= '" +this.getAlimento() +"'");
    }

    public String getAlimento(){
        return this.alimento;
    }
    public void setAlimento(String alimento){
        this.alimento = alimento;
    }

}
