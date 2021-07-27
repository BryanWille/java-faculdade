package aula05;

public class Banco {
    public String numConta;
    protected String tipo;
    private String nome;
    private double saldo;
    private boolean status;


    public Banco(){
        this.status = false;
        this.saldo = 0;
    }

    public String getNumConta(){
        return this.numConta;
    }
    public void setNumConta(String n){
        this.numConta = n;
    }


    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }


    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }


    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double s){
        this.saldo = s;
    }


    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean s){
        this.status = s;
    }

    public void abrirConta(String t){
        this.setStatus(true);
        if (t.equalsIgnoreCase("CC")){
            this.setTipo("CC");
            this.setSaldo(50);
        } else if (t.equalsIgnoreCase("CP")){
            this.setSaldo(150);
            this.setTipo("CP");
        } else {
            System.out.println("Tipo de conta inválido!");
            this.setTipo("INVALIDO");
        }
    }

    public void fecharConta(){
        System.out.println("Fechando sua conta!");
        if(this.saldo == 0 && this.status){
            System.out.println("Conta fechada!");
            this.status = false;
        } else if (this.saldo != 0){
            System.out.println("Você tem que resolver suas pendências antes de fechar a sua conta!");
            System.out.println("Seu saldo é de: R$" +this.getSaldo());
        } else {
            System.out.println("Você não possui uma conta, quer criar agora?");
        }
    }

    public void depositar(double d){
        if(this.status){
            System.out.printf("\nDepósito de R$%f feito com sucesso", d);
            this.saldo += d;
        } else {
            System.out.println("Você não tem uma conta portanto não pode depositar!");
        }
    }

    public void sacar(double d){
        if(d <= this.saldo && this.status){
            System.out.printf("\nOk, sacando R$%f", d);
        } else if (d > this.saldo){
            System.out.printf("\nNão pode sacar pois vocẽ quer sacar R$%f e sua conta possui menos que isso: R$%f",
                    d, this.saldo);
        } else {
            System.out.println("Você não possui uma conta em nosso Banco, crie uma agora mesmo!");
        }
    }

    public void pagarMensal(){
        if(this.tipo.equalsIgnoreCase("CC")){
            this.saldo -= 15;
        } else if(this.tipo.equalsIgnoreCase("CP")){
            this.saldo -= 20;
        } else {
            System.out.println("Tipo de conta inválida!");
        }
    }

    public void status(){
        System.out.println("\nNome: " +this.getNome() +"\nNuméro da conta: " +this.getNumConta()
        +"\nTipo de conta: " +this.getTipo() +"\nSaldo da conta: R$" +this.getSaldo()
        +"\nExiste a conta: " +this.getStatus());
    }
}
