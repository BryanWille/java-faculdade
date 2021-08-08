package exercicioIngresso;

public class Normal extends Ingresso {

    public Normal(float valor){
        super(valor);
    }

    public String tipoIngresso (){
        return "Seu ingresso é normal: valor de R$" +this.getValor() +"!";
    }
}
