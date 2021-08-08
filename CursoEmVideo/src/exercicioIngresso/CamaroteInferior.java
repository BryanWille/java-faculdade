package exercicioIngresso;

public class CamaroteInferior extends Vip {
    private String localizacao;

    public CamaroteInferior(String localizacao, float valor){
        super(valor);
        this.setLocalizacao(localizacao);
    }

    public String lugarVaga(){
        return "A localização da sua vaga é: " +this.getLocalizacao() +"!";
    }

    public String getLocalizacao(){
        return this.localizacao;
    }
    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }

}
