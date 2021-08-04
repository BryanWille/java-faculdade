package aula11;

public class Aluno extends Pessoa{
    private String curso;
    private int matricula;

    public void pagarMensalidade(double mensalidade){
        System.out.println("Mensalidade de R$" +mensalidade +" paga com sucesso! senhor(a) " +this.getNome());
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
