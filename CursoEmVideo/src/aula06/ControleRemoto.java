package aula06;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }


    private int getVolume(){
        return this.volume;
    }
    private void setVolume(int v){
        this.volume = v;
    }

    private boolean getLigado(){
        return this.ligado;
    }
    private void setLigado(boolean l){
        this.ligado = l;
    }

    private boolean getTocando(){
        return this.tocando;
    }
    private void setTocando(boolean t){
        this.tocando = t;
    }


    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " +this.getLigado());
        System.out.println("Qual o volume? " +this.getVolume());
        for(int i = 0; i <= getVolume(); i+= 10){
            System.out.println("|");
        }
        System.out.println("Está tocando? " +this.getTocando());
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu!");
    }

    @Override
    public void menosVolume() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Seu volume já está mutado!");
        }
    }

    @Override
    public void maisVolume() {
        if(this.getLigado() && volume < 100){
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Seu volume está no máximo!");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() != 0){
            setVolume(0);
            System.out.println("Volume mutado!");
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getVolume() == 0 && this.getLigado()){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(!this.getTocando() && this.getLigado()){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getTocando() && this.getLigado()){
            this.setTocando(false);
        }
    }
}
