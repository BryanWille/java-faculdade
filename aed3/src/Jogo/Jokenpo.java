package Jogo;

import java.io.*;
import java.util.Random;

public class Jokenpo {
    private long pontoJogador, pontoPc, empate, resultado, jogos;
    private String[] opcoes = {"Pedra", "Papel", "Tesoura"};
    private long[] resultados = new long[100];

//    private long sorteador(){
//        return (new Random().nextLong(String.valueOf(opcoes.length)));
//    }

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

    private void lerResultado(){

    }

    private void salvarResultado(long numGanhador) throws IOException {
        this.resultados[(int) jogos] = numGanhador;
    }

    private void gravarResultado(long[] todosResultados){
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ganhador.dat"));
            out.writeLong(todosResultados.length);
            for(Long resultados : todosResultados){
                out.writeLong(resultados);
            }
        } catch (IOException e) {
            System.out.println("Erro de E/S");
        }
    }


    public void ganhador(long numPc, long numUser ) throws IOException {
        //Pedra = 0, Papel = 1, Tesoura = 2;
        //Empate = 0, PC = 1, Usuario = 2;
        long numGanhador;
        if (numPc == numUser){
            this.empate ++;
            numGanhador = 0;
        } else if(numPc == 0 && numUser == 2 || numPc == 1 && numUser == 0 || numPc == 2 && numUser == 1){
            this.pontoPc++;
            numGanhador = 1;
        } else {
            this.pontoJogador++;
            numGanhador = 2;
        }
        this.setResultado(numGanhador);
        this.salvarResultado(numGanhador);
        jogos ++;
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
