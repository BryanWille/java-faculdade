package aula08;

public class Lutador {
    private String nome, nacionalidade, categoria;
    private double altura, peso;
    private int idade, vitorias, derrotas, empates;

    public Lutador(String nome, String nacionalidade, double altura, double peso, int idade, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.setPeso(peso);
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public void apresentar(){
        System.out.println("------------------------------------------------------");
        System.out.println("Chegou a Hora de Apresentarmos o lutador: " +this.getNome());
        System.out.println("Lutador: " +this.getNome());
        System.out.println("Origem: " +this.getNacionalidade());
        System.out.println(this.getIdade() +" anos");
        System.out.println(this.getAltura() +"m de altura");
        System.out.println("Pesando " + this.getPeso() +"Kg");
        System.out.println("Ganhou: " +this.getVitorias() +" vezes");
        System.out.println("Perdeu: " +this.getDerrotas() +" vezes");
        System.out.println("Empatou: " +this.getEmpates() +" vezes");
    }

    public void status(){
        System.out.println(this.getNome());
        System.out.println("é um peso de " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() +" empates");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNacionalidade(){
        return this.nacionalidade;
    }
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if (this.getPeso() < 52.2){
            this.categoria = "Inválido";
        } else if (this.getPeso() <= 70.3){
            this.categoria = "Leve";
        } else if (this.getPeso() <= 83.9){
            this.categoria = "Médio";
        } else if (peso <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
