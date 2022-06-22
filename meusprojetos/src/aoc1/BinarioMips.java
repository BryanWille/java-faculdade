package aoc1;

public class BinarioMips {
    private String binario;
    private String expoente;
    private String mantissa;
    private DecimalBinario Conversor;
    private String sinal;
    private String binarioFinal;

    public BinarioMips(String binario){
        this.setSinal("0");
        this.setBinario(binario);

        this.Conversor = new DecimalBinario(this.fazerExpoente());

        this.setMantissa(this.fazerMantissa());
        this.setExpoente(String.valueOf(Conversor.getParteInteira()));

        this.setBinarioFinal(this.sinal + this.expoente + this.mantissa);
    }

    public String fazerMantissa(){
        String mantissa = binario.replace(".", "").substring(1);
        while (mantissa.length() < 23){
            mantissa += "0";
        }
        return mantissa;
    }

    public int fazerExpoente(){
        return (this.binario.indexOf(".")-1 ) + 127;
        // Ponto decimal na posição 2 (String posições começa 0)
        // pi = 11.0010010000 = 0.110010010000 * 2²
    }

    public String getExpoente() {
        return expoente;
    }

    public void setExpoente(String expoente) {
        this.expoente = expoente;
    }

    public String getBinario() {
        return binario;
    }

    public void setBinario(String binario) {
        this.binario = binario;
    }

    public String getMantissa() {
        return mantissa;
    }

    public void setMantissa(String mantissa) {
        this.mantissa = mantissa;
    }

    public String getSinal() {
        return sinal;
    }

    public void setSinal(String sinal) {
        this.sinal = sinal;
    }

    public String getBinarioFinal() {
        return binarioFinal;
    }

    public void setBinarioFinal(String binarioFinal) {
        this.binarioFinal = binarioFinal;
    }

    @Override
    public String toString() {
        String sinal = this.binarioFinal.substring(0,1) == "0" ? "-" : "+";
        String expoente = String.valueOf(this.fazerExpoente());
        return "\n=================================================\n" +
                "Sinal" + "\t" + "Expoente" +"\t" + "Mantissa" + "\n" +
                this.sinal +"\t\t" + this.expoente +"\t" + this.mantissa + "\n"
                +sinal +"\t\t" +expoente +"\t\t\t" +"1 + 0." + this.mantissa +
                "\n=================================================\n";
    }
}
