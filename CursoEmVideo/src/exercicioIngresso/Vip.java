package exercicioIngresso;

public class Vip extends Ingresso{
    private float adicional;

    public Vip (float valor){
        super(valor);
        this.setValor(this.getValor() + 50);
    }

    public String valorIngresso(){
        return "O valor do seu ingresso foi de: R$" +this.getValor() +"!";
    }

    public float getAdicional(){
        return this.adicional;
    }
    public void setAdicional(float adicional){
        this.adicional = adicional;
    }
}
