package aula14;

public class Video implements AcoesVideo {
    private String titulo;
    private int views, avaliacao, curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.setTitulo(titulo);
        this.setAvaliacao(1);
        this.setViews(0);
        this.setCurtidas(0);
        this.setReproduzindo(false);
    }

    @Override
    public void play(){
        this.setViews(this.getViews() + 1);
        if(!this.isReproduzindo()){
            System.out.println("Despausando video!");
            this.setReproduzindo(true);
        } else {
            System.out.println("Vídeo já está sendo reproduzido");
        }
    }

    @Override
    public void pause (){
        if (this.isReproduzindo()){
            System.out.println("Pausando vídeo!");
            this.setReproduzindo(false);
        } else {
            System.out.println("Vídeo já está pausado!");
        }
    }

    @Override
    public void like(){
        System.out.println("Vídeo curtido!");
        this.setCurtidas(this.getCurtidas() + 1);
    }


    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", views=" + views +
                ", avaliacao=" + avaliacao +
                ", curtidas=" + curtidas +
                ", reproduzindo=" + reproduzindo +
                '}';
    }
}
