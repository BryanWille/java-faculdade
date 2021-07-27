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


    public int getVolume(){
        return this.volume;
    }
    public void setVolume(int v){
        this.volume = v;
    }

    public boolean getLigado(){
        return this.ligado;
    }
    public void setLigado(boolean l){
        this.ligado = l;
    }

    public boolean getTocando(){
        return this.tocando;
    }
    public void setTocando(boolean t){
        this.tocando = t;
    }


    @Override
    public void ligar() {

    }

    @Override
    public void desligar() {

    }

    @Override
    public void abrirMenu() {

    }

    @Override
    public void fecharMenu() {

    }

    @Override
    public void menosVolume() {

    }

    @Override
    public void maisVolume() {

    }

    @Override
    public void ligarMudo() {

    }

    @Override
    public void desligarMudo() {

    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }
}
