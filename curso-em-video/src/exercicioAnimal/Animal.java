package exercicioAnimal;

public class Animal {
    private String nome, cor, ambiente;
    private float comprimento, velocidadeMedia;
    private int numeroPatas;

    public Animal(String nome, String cor, String ambiente, float comprimento, float velocidadeMedia, int numeroPatas){
        this.setNome(nome);
        this.setComprimento(comprimento);
        this.setAmbiente(ambiente);
        this.setCor(cor);
        this.setNumeroPatas(numeroPatas);
        this.setVelocidadeMedia(velocidadeMedia);
    }

    public void dados(){
        System.out.print("Animal " +
                "nome='" + this.getNome() + '\'' +
                ", cor='" + this.getCor() + '\'' +
                ", ambiente='" + this.getAmbiente() + '\'' +
                ", comprimento=" + this.getComprimento() +
                ", velocidadeMedia=" + this.getVelocidadeMedia() +
                ", numeroPatas=" + this.getNumeroPatas());
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public float getComprimento(){
        return this.comprimento;
    }
    public void setComprimento(float comprimento){
        this.comprimento = comprimento;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }
    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public float getVelocidadeMedia() {
        return velocidadeMedia;
    }
    public void setVelocidadeMedia(float velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
}
