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

    public void tampar(int t){
        switch (t){
            case 1:
                this.setTampada(true);
                System.out.println("Garrafa Tampada!");
                break;
            case 2:
                this.setTampada(false);
                System.out.println("Garrafa Destampada");
                break;
            case 3:
                System.out.println("Opção invalida!");
        }
    }
    public void retirarLiquido(String l, int quant){
        if(!this.getTampada()){
            if(l.equalsIgnoreCase(getLiquido())){
                if(getPreenchimento() - quant < 0){
                    System.out.println("Sua garrafa vai ficar 'devendo' vamos parar em 0%");
                    setPreenchimento(0);
                } else {
                    setPreenchimento(getPreenchimento() - quant);
                }
            } else {
                System.out.println("O líquido que você quer tirar é :" +l +" e o liquido que está na garrafa é: "
                                   +this.getLiquido() +" troque antes de tirar!");
            }
        } else {
            System.out.println("A garrafa está tampada! destampe-a");
        }
    }

    public void colocarLiquido(String l, int quant){
        if(!this.getTampada()){
            if(l.equalsIgnoreCase(getLiquido())){
                if(getPreenchimento() + quant > 100){
                    System.out.println("Sua garrafa vai transbordar, parando em 100%");
                    setPreenchimento(100);
                } else {
                    setPreenchimento(getPreenchimento() + quant);
                }
            } else {
                System.out.println("O líquido que você quer colocar é :" +l +" e o liquido que está na garrafa é: "
                +this.getLiquido() +" troque antes de colocar mais!");
            }
        } else {
            System.out.println("A garrafa está tampada! destampe-a");
        }
    }

    public String selecionarLiquido(int t){
        String liquido;
        if(getTampada()){
            System.out.println("Garrafa tampada, Destempe-a");
            return "vazio";
        } else {
            if(getLiquido().equals("vazio")){
                switch (t){
                    case 1:
                        liquido = "Guaraná";
                        break;
                    case 2:
                        liquido = "Coca-Cola";
                        break;
                    case 3:
                        liquido = "Água";
                        break;
                    case 4:
                        liquido = "Café";
                        break;
                    default:
                        liquido = "vazio";
                        break;
                }
                this.setLiquido(liquido);
                return liquido;
            } else {
                System.out.println("Sua garrafa já tem um liquido esvazie-a antes!");
                return "vazio";
            }
        }
    }

    public void statusMenu(){
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
