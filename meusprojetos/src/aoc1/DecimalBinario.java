package aoc1;

public class DecimalBinario {
    private float decimal;
    private String binario;
    private String parteDecimal;
    private String parteInteira;

    /* =========== CONSTRUTOR =========== */
    public DecimalBinario(float numero){
        this.setDecimal(numero);

        this.setParteInteira(this.inteiroBinario((int) numero));
        this.setParteDecimal(this.decimalBinario(numero - (int) numero));

        this.setBinario(this.parteInteira +"." +this.parteDecimal);
    }

    /* =========== BINÀRIO DA PARTE INTEIRA DO NÚMERO =========== */
    public String inteiroBinario(int numero){
        StringBuilder binario = new StringBuilder();
        while (numero > 0){
            binario.append(numero % 2);
            numero /= 2;
        }
        String binarioFinal = (new StringBuilder(binario.toString()).reverse()).toString();
        return binarioFinal;
    }


    /* =========== BINÀRIO DA PARTE DECIMAL DO NÚMERO =========== */
    public String decimalBinario(float decimal){
        String binario = "";
        for(int i = 0; i < 23; i++){
            decimal *= 2;
            if(decimal > 1){
                binario += "1";
                decimal -= 1;
            } else if (decimal < 1){
                binario += "0";
            } else {
                binario += "1";
                break;
            }
        }
        return binario;
    }

    /* =========== GETTERS & SETTERS =========== */
    public float getDecimal() {
        return decimal;
    }

    public void setDecimal(float decimal) {
        this.decimal = decimal;
    }

    public String getBinario() {
        return binario;
    }

    public void setBinario(String binario) {
        this.binario = binario;
    }

    public String getParteInteira() {
        return parteInteira;
    }

    public void setParteInteira(String parteInteira) {
        this.parteInteira = parteInteira;
    }

    public String getParteDecimal() {
        return parteDecimal;
    }

    public void setParteDecimal(String parteDecimal) {
        this.parteDecimal = parteDecimal;
    }

}
