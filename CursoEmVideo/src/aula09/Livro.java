package aula09;

public class Livro implements Publicacao {
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;


    public Livro(String titulo, String autor, int totPaginas,  Pessoa leitor){
        this.setAutor(autor);
        this.setLeitor(leitor);
        this.setTitulo(titulo);
        this.setTotPaginas(totPaginas);
    }


    public void detalhes(){
        System.out.println("Olá, " +this.getLeitor().getNome() +"!");
        if(this.isAberto()){
            System.out.println("-------------------------------");
            System.out.println("Autor: " +this.getAutor());
            System.out.println("Título: " +this.getTitulo());
            System.out.println("Total de Páginas: " +this.getTotPaginas());
            System.out.println("Página atual: " +this.getPagAtual());
            System.out.println("-------------------------------");
        } else {
            System.out.println("Livro fechado! abra-o antes");
        }
    }


    @Override
    public void abrir(){
        if(!isAberto()){
            System.out.println("Abrindo livro!");
            this.setAberto(true);
        } else {
            System.out.println("Livro já está aberto!");
        }
    }

    @Override
    public void fechar(){
        if(isAberto()){
            System.out.println("Fechando livro!");
            this.setAberto(false);
        } else {
            System.out.println("Livro já está fechado!");
        }
    }

    @Override
    public void folhear() {
        System.out.println("Folheando livro!");
        for(int cont= 0; cont <= this.getTotPaginas(); cont+= 8){
            this.setPagAtual(cont);
            System.out.println("Folheando livro!");
            System.out.println("Página: " +this.getPagAtual());
        }
    }

    @Override
    public void avancarPag() {
        if(getPagAtual() < getTotPaginas() && this.isAberto()){
            this.setPagAtual(this.getPagAtual() + 1);
            System.out.println("Avançando uma página! agora ná pág: " +this.getPagAtual());
        } else if (!this.isAberto()){
            System.out.println("Livro fechado, abra-o antes");
        } else {
            System.out.println("Já terminamos de ler o livro");
        }
    }

    @Override
    public void voltarPag() {
        if(this.getPagAtual() != 1 && this.isAberto()){
            System.out.println("Voltando uma página!");
            this.setPagAtual(this.getPagAtual() - 1);
            System.out.println("Agora estamos ná pagina: " +this.getPagAtual());
        } else if (!this.isAberto()){
            System.out.println("Livro fechado, abra-o antes");
        } else {
            System.out.println("Já terminamos de ler o livro");
        }
    }


    private String getTitulo() {
        return titulo;
    }
    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private String getAutor() {
        return autor;
    }
    private void setAutor(String autor) {
        this.autor = autor;
    }

    private Pessoa getLeitor() {
        return this.leitor;
    }
    private void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    private int getTotPaginas() {
        return totPaginas;
    }
    private void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    private int getPagAtual() {
        return pagAtual;
    }
    private void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    private boolean isAberto() {
        return aberto;
    }
    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
}
