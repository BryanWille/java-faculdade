package lzw;
import java.io.*;
import java.util.*;


public class Compressor {
	private BufferedReader imagemOriginal;
    private BufferedWriter imagemComprimida;
    private Map<String, Integer> dicionario = new LinkedHashMap<>();
    private int posicao = 0;
    private ArrayList<String> todosCaracteres = new ArrayList<String>();
    private String c, p = "";

    public Compressor(String localArquivoOriginal, String nomeArquivoComprimido) throws IOException {
        this.setImagemComprimida(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nomeArquivoComprimido))));
        this.setImagemOriginal(new BufferedReader(new InputStreamReader(new FileInputStream(localArquivoOriginal))));

        this.imagemOriginal.readLine(); // Cabeçalho
        this.imagemOriginal.readLine();
        this.imagemOriginal.readLine();


        String tempTexto = "";
        while ((tempTexto = this.imagemOriginal.readLine()) != null){
            tempTexto = tempTexto.replaceAll("\\s+"," ");
            String[] split = tempTexto.split(" ");
            this.todosCaracteres.addAll(Arrays.asList(split));
        }

        dictionarieBase();

        comprimir();
    }

    private void escrever(String linhaComprimida) throws IOException {
        this.imagemComprimida.newLine();
        this.imagemComprimida.write(linhaComprimida);
    }

    private void dictionarieBase(){
        for (int i = 0; i < todosCaracteres.size(); i++) {
            if (dicionario.get(todosCaracteres.get(i)) == null) {
                dicionario.put(todosCaracteres.get(i), this.getPosicao());
                this.setPosicao(this.posicao += 1);
            }
        }
    }

    private boolean existeDicionario(String texto){
        return dicionario.get(texto) != null;
    }

    private void adicionarDict(String texto){
        this.posicao += 1;
        this.dicionario.put(texto, this.posicao);
    }

    private void comprimir() throws IOException {
        int i = 0;
        while ( i < this.todosCaracteres.size()){
            this.c = this.todosCaracteres.get(i);
            if (existeDicionario(this.p + this.c))
                this.p += this.c;
            else {
                this.imagemComprimida.write(this.p);
                adicionarDict(this.p + this.c);
                this.p = this.c;
            }
            i++;
        }
        this.imagemComprimida.write(this.p);
        imagemComprimida.close();
    }

    public BufferedReader getImagemOriginal() {
        return imagemOriginal;
    }

    public void setImagemOriginal(BufferedReader imagemOriginal) {
        this.imagemOriginal = imagemOriginal;
    }

    public BufferedWriter getImagemComprimida() {
        return imagemComprimida;
    }

    public void setImagemComprimida(BufferedWriter imagemComprimida) {
        this.imagemComprimida = imagemComprimida;
    }

    public Map<String, Integer> getDicionario() {
        return dicionario;
    }

    public void setDicionario(Map<String, Integer> dicionario) {
        this.dicionario = dicionario;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
}
