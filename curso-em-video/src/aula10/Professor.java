package aula10;

public class Professor extends Pessoa {
    private String especilidade;
    private double salario;

    public void receberAumento(double aumento){
        this.setSalario(this.getSalario() + aumento);
    }

    public String getEspecilidade() {
        return especilidade;
    }
    public void setEspecilidade(String especilidade) {
        this.especilidade = especilidade;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
