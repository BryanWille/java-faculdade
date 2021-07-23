package aula04;

public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta(String m, String c, float p){
        this.setModelo(m);
        this.tampar();
        this.setCor(c);
        this.setPonta(p);
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }

    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }

    public boolean getTampa(){
        return this.tampada;
    }
    public void setTampa(boolean t){
        this.tampada = t;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.printf("\nModelo: %s \nPonta: %f \nCor: %s \nTampada: %b", this.getModelo(), this.getPonta(),
                this.getCor(), this.getTampa());
    }
}
