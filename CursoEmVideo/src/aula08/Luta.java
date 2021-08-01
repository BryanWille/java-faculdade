package aula08;

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void lutar(){
        if(this.isAprovada()){
            getDesafiante().apresentar();
            getDesafiado().apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            switch(vencedor){
                case 0:
                    System.out.println("\nNinguém ganhou, empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("\nGanhou: " +this.getDesafiante().getNome());
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
                case 2:
                    System.out.println("\nGanhou: " +this.getDesafiado().getNome());
                    this.getDesafiante().perderLuta();
                    this.getDesafiado().ganharLuta();
                    break;
            }
        } else {
            System.out.println("Luta não foi aprovada!");
        }
    }

    public void marcarLuta(Lutador l1, Lutador l2){
        this.setDesafiante(null);
        this.setDesafiado(null);
        this.setAprovada(false);
        if(!l1.getNome().equalsIgnoreCase(l2.getNome())){
            if(l1.getCategoria().equalsIgnoreCase(l2.getCategoria())){
                System.out.println("Luta agendada!");
                this.setAprovada(true);
                this.setDesafiado(l1);
                this.setDesafiante(l2);
            } else {
                System.out.println("Os lutadores não estão na mesma faixa de peso!");
            }
        } else {
            System.out.println("Não pode haver lutas com o mesmo lutador!");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
