package Prova;

import java.io.Serializable;

public class Movimentacao implements Serializable {
    private int codigoAcao;
    private char movimentacao;
    private float valorMovimentacao;


    public Movimentacao(){

    }

    public Movimentacao(int codigoAcao, char movimentacao, float valorMovimentacao) {
        this.setCodigoAcao(codigoAcao);
        this.setMovimentacao(movimentacao);
        this.setValorMovimentacao(valorMovimentacao);
    }


    public int getCodigoAcao() {
        return codigoAcao;
    }

    public void setCodigoAcao(int codigoAcao) {
        this.codigoAcao = codigoAcao;
    }

    public char getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(char movimentacao) {
        this.movimentacao = movimentacao;
    }

    public float getValorMovimentacao() {
        return valorMovimentacao;
    }

    public void setValorMovimentacao(float valorMovimentacao) {
        this.valorMovimentacao = valorMovimentacao;
    }


    @Override
    public String toString() {
        return "Movimentacao{" +
                "codigoAcao=" + codigoAcao +
                ", movimentacao=" + movimentacao +
                ", valorMovimentacao=" + valorMovimentacao +
                '}';
    }
}
