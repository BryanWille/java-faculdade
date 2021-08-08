package exercicioAnimal;

public class Peixe extends Animal{
    private String caracteristica;

    public Peixe(String nome, String cor, String ambiente, float comprimento,
                 float velocidadeMedia, int numeroPatas, String caracteristica) {
        super(nome, cor, ambiente, comprimento, velocidadeMedia, numeroPatas);
        this.setCaracteristica(caracteristica);
    }

    public void dadosPeixe(){
        this.dados();
        System.out.print(", caracteristica='"+this.getCaracteristicas() +"'");
    }

    public String getCaracteristicas(){
        return this.caracteristica;
    }
    public void setCaracteristica(String caracteristica){
        this.caracteristica = caracteristica;
    }
}
