package Revisao;

import java.util.Date;

public class Pessoa {
    private String nome;
    private Date nasc;
    private float altura;

    public Pessoa(String n, int y, int m, int d, float alt){
        this.setAltura(alt);
        this.setNasc(y, m, d);
        this.setNome(n);
    }

    public String idade(){
        return String.valueOf(nasc.getYear() - 2002);
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public Date getNasc(){
        return this.nasc;
    }
    public void setNasc(int year, int month, int date){
        Date nasc = new Date(year, month, date);
        this.nasc = nasc;
    }

    public float getAltura(){
        return this.altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
}
