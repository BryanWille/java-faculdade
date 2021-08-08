package exercicioIngresso;

public class Ingresso {
    private float valor;

    public Ingresso(float valor){
        this.setValor(valor);
    }

    public String imprimeValor(){
        return "O valor do ingresso foi de: " +this.getValor();
    }

    public float getValor(){
        return this.valor;
    }
    public void setValor(float valor){
        this.valor = valor;
    }
}
