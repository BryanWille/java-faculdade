package lzw;
import java.io.*;
import java.util.*;


public class Compressor {
	private BufferedReader imagemOriginal;
    private BufferedWriter imagemComprimida;
    private int quantidadeCaracteres;
    private Map<Integer, Integer> dicionario = new LinkedHashMap<>();
    private int posicao = 1;

    public Compressor(String localArquivoOriginal, String nomeArquivoComprimido) throws IOException {
        this.setQuantidadeCaracteres(quantidadeCaracteres);
        this.setImagemComprimida(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nomeArquivoComprimido))));
        this.setImagemOriginal(new BufferedReader(new InputStreamReader(new FileInputStream(localArquivoOriginal))));

        this.imagemOriginal.readLine(); // Cabeçalho
        this.imagemOriginal.readLine();
        this.imagemOriginal.readLine();


        String tempTexto = "";
        while ((tempTexto = this.imagemOriginal.readLine()) != null){
            dictionarie(tempTexto);
        }

        System.out.println(this.getDicionario().toString());

        comprimir();
    }

    private void escrever(String linhaComprimida) throws IOException {
        this.imagemComprimida.newLine();
        this.imagemComprimida.write(linhaComprimida);
    }

    private void dictionarie(String texto){
        texto = texto.replaceAll("  "," ");
        String[] split = texto.split(" ");
        dicionario.put(Integer.valueOf(split[0]), 1);
        for(int i = 1; i < split.length; i++){
            if (dicionario.get(Integer.valueOf(split[i])) != null)
                dicionario.put(Integer.valueOf(split[i]), this.getPosicao());
                this.setPosicao(this.posicao += 1);
        }

    }

    private void comprimir() throws IOException {


        imagemComprimida.close();
    }

    private String comprimirLinhar(String linha) {
       return "as";
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

    public int getQuantidadeCaracteres() {
        return quantidadeCaracteres;
    }

    public void setQuantidadeCaracteres(int quantidadeCaracteres) {
        this.quantidadeCaracteres = quantidadeCaracteres;
    }
    public Map<Integer, Integer> getDicionario() {
        return dicionario;
    }

    public void setDicionario(Map<Integer, Integer> dicionario) {
        this.dicionario = dicionario;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
}
