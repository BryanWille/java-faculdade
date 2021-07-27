package meuteste;

public class GarrafaEmge implements Garrafa {
    private boolean tampada;
    private int preenchimento;
    private String liquido;

    public GarrafaEmge(){
        setPreenchimento(0);
        setTampada(true);
        setLiquido("vazio");
    }

    public void colocarLiquido(String l){
        if(this.getTampada()){
            if(this.getLiquido().equalsIgnoreCase("vazio")){
                System.out.println("Colocando " +l);
                this.setLiquido(l);
            } else {
                System.out.println("Sua garrafá tem um liquído você primeiro tem que esvazia-lá!");
            }
        } else {
            System.out.println("A garrafa está tampada! destampe-a");
        }
    }

    //"your condition"? "step if true":"step if condition fails"

    public void status(){
        System.out.println("-------------------------------");
        System.out.println("Sua garafa está tampada: " +(this.getTampada() ? "sim" : "não"));
        System.out.println("Quantos porcento de preenchimento da garrafa: " +this.getPreenchimento() +"%");
        System.out.println("Você está bebendo: " +this.getLiquido());
        System.out.println("-------------------------------");
    }

    public boolean getTampada(){
        return this.tampada;
    }
    public void setTampada(boolean t){
        this.tampada = t;
    }

    public int getPreenchimento(){
        return this.preenchimento;
    }
    public void setPreenchimento(int p){
        this.preenchimento = p;
    }

    public String getLiquido(){
        return this.liquido;
    }
    public void setLiquido(String l){
        this.liquido = l;
    }

    @Override
    public void guarana(){
        this.colocarLiquido("Guaraná");
    }

    @Override
    public void coca(){
        this.colocarLiquido("Coca-Cola");
    }

    @Override
    public void agua(){
        this.colocarLiquido("Água");
    }

    @Override
    public void cafe(){
        this.colocarLiquido("Café");
    }

    @Override
    public void esvaziar(){
        if(!this.getLiquido().equals("vazio") && this.getPreenchimento() > 0){
            System.out.println("Ok tirar da garrafa totalmente: " +this.getLiquido());
            this.setLiquido("vazio");
            this.setPreenchimento(0);
        } else {
            System.out.println("Garrafa já está vazia!");
        }
    }

    @Override
    public void encher(){
        if(!this.getLiquido().equals("vazio") && this.getPreenchimento() < 100){
            System.out.println("Vamos preencher totalmente a garrafa de: " +this.getLiquido());
            this.setPreenchimento(100);
        } else if (this.getLiquido().equals("vazio")){
            System.out.println("Sua garrafa não tem liquido! coloque um primeiro");
        } else {
            System.out.println("Sua garrafa já está cheia!");
        }
    }
}
