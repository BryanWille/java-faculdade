package Pessoa;

import java.io.Serializable;

public class Telefone implements Serializable {
    private String numero;

    public Telefone (String numero){
        this.setNumero(numero);
    }

    @Override
    public String toString() {
        return this.numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
