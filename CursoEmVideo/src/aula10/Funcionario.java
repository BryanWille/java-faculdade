package aula10;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public void mudaTrabalho(){
        this.setTrabalhando(!this.isTrabalhando());
    }

    public boolean isTrabalhando(){
        return this.trabalhando;
    }
    public void setTrabalhando(boolean trabalhando){
        this.trabalhando = trabalhando;
    }

    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }

}
