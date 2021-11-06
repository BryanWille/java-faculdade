package aula02;

public class Assistir {
    String titulo;
    boolean videoBom;
    double duracao;
    double velocidade;

    void assistirVideo(){
        if(duracao >= 1800 && !videoBom){
            System.out.println("Vídeo muito longo, não vou assistir");
        } else {
            System.out.println("Iniciando, aula03.video!");
        }
    }

    void setVelocidade(){
        if(videoBom){
            System.out.println("Assistindo normalmente o vídeo: " +this.titulo);
        } else {
            System.out.println("Assistindo em 2x");
        }
    }


}
