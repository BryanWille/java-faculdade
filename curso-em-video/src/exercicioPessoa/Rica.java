package exercicioPessoa;

public class Rica extends Pessoa {
    private double dinheiro;

    public Rica(double dinheiro, int idade, String nome){
        super(nome, idade);
        this.setDinheiro(dinheiro);
    }

    public void fazCompras(){
        System.out.println("Fazendo compras!");
    }

    public double getDinheiro(){
        return this.dinheiro;
    }
    public void setDinheiro(double dinheiro){
        this.dinheiro = dinheiro;
    }

}
