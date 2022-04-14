package Prova;

import java.io.Serializable;

public class Acao implements Serializable {
    private int codigoAcao;
    private String texto;
    private float valorAcao;

    public Acao (){

    }

    public Acao (int c , String texto, float valorAcao){
        this.setCodigoAcao(codigoAcao);
        this.setTexto(texto);
        this.setValorAcao(valorAcao);
    }

    public int getCodigoAcao() {
        return codigoAcao;
    }

    public void setCodigoAcao(int codigoAcao) {
        this.codigoAcao = codigoAcao;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public float getValorAcao() {
        return valorAcao;
    }

    public void setValorAcao(float valorAcao) {
        this.valorAcao = valorAcao;
    }

    @Override
    public String toString() {

        return "Acao {" +
                "codigoAcao=" + this.codigoAcao +
                ", texto='" + this.texto + '\'' +
                ", decimal=" + this.valorAcao +
                '}';
    }
}
