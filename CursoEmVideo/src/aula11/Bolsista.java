package aula11;

public class Bolsista extends Aluno{
    private float bolsa;

    public void renovarBolsa(boolean teste){
        if(teste){
            System.out.println("Bolsa renovada com sucesso!");
        } else {
            System.out.println("Sua bolsa não foi renovada :(");
        }
    }

    @Override
    public void pagarMensalidade(double mensalidade){
        System.out.println(this.getNome() +", mensalidade de " +mensalidade +" paga com sucesso!");
    }

    public float getBolsa() {
        return bolsa;
    }
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
