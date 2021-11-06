package exercicioIngresso;

public class CamaroteSuperior extends Vip{
    private float camarote;

    public CamaroteSuperior(float valor){
        super(valor);
        this.setValor(this.getValor() + 100);
    }

    public String valorCamarote(){
        return "O valor do camarote é de: R$" +this.getValor() +" !";
    }

    public float getCamarote(){
        return this.camarote;
    }
    public void setCamarote(float camarote){
        this.camarote = camarote;
    }
}
