package Jogo;

import java.util.Random;

public class Jokenpo {
    private long pontoJogador, pontoPc, empate, resultado;
    private String[] opcoes = {"Pedra", "Papel", "Tesoura"};

    private long sorteador(){
        return (new Random().nextLong(opcoes.length));
    }

    public String retornarEscolha(long num){
        String escolha;
        switch ((short) num){
            case 0:
                escolha = "Pedra";
                break;
            case 1:
                escolha = "Papel";
                break;
            case 2:
                escolha = "Usuario";
                break;
            default:
                escolha = "Inválida!";
        }
        return escolha;
    }

    private void gravarResultado(boolean jogadorGanhou){

    }


    public void ganhador(long numPc, long numUser ){
        //Pedra = 0, Papel = 1, Tesoura = 2;
        //Empate = 0, PC = 1, Usuario = 2;
        if (numPc == numUser){
            this.empate ++;
            this.setResultado(0);
        } else if(numPc == 0 && numUser == 2 || numPc == 1 && numUser == 0 || numPc == 2 && numUser == 1){
            this.pontoPc++;
            this.setResultado(1);
        } else {
            this.pontoJogador++;
            this.setResultado(2);
        }
    }

    public String resultado(long resultado){
        String ganhador;
        switch((short) resultado){
            case 1:
                ganhador = "Computador";
                break;
            case 2:
                ganhador = "PC";
                break;
            default:
                ganhador = "Empate";
        }
        return ganhador;
    }

    public String resultadoGeral(){
        return "teste";
    }



    public long getPontoJogador() {
        return pontoJogador;
    }

    public long getPontoPc() {
        return pontoPc;
    }

    public long getEmpate(){return this.empate;}

    public long getResultado() {
        return resultado;
    }
    private void setResultado(long resultado) {
        this.resultado = resultado;
    }

    public String[] getOpcoes() {
        return opcoes;
    }
}
