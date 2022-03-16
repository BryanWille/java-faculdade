package ObjectInputStream.Ex5;

import java.io.Serializable;

public class Pessoa implements Serializable {
    private String nome;
    private int id;

    public Pessoa(int id, String nome){
        this.setId(id);
        this.setNome(nome);
    }

    public String toString(){
        return "Nome: " +this.getNome() +" id: " +this.getId();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
