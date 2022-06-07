package compressao;

import java.io.*;

public class Uncompressor {
    private BufferedReader imagemComprimida;
    private BufferedWriter imagemDescomprimida;

    public Uncompressor (String localArquivoComprimido, String nomeArquivoDescomprimido) throws IOException{
        this.setImagemDescomprimida(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nomeArquivoDescomprimido))));
        this.setImagemComprimida(new BufferedReader(new InputStreamReader(new FileInputStream(localArquivoComprimido))));
        uncompress();
    }

    public void uncompress() throws IOException {

        // ================= LEITURA CABEÇALHO =================
        String cabecalho[] = imagemComprimida.readLine().split("\\*");
        // ================= ESCRITA CABEÇALHO =================
        for (String item : cabecalho) {
            this.imagemDescomprimida.write(item);
            this.imagemDescomprimida.newLine();
        }
        // ================= LEITURA LINHAS =================
        String linhaTemp;
        String breakline[];
        while ((linhaTemp = imagemComprimida.readLine()) != null) {
            breakline = linhaTemp.split(" ");
            for (String item : breakline) {
                if (item.contains("$")) {
                    breakline = item.split("\\$");
                    for (int i = 0; i < Integer.parseInt(breakline[0]); i++) {
                        write(breakline[1]);
                    }
                } else {
                    write(item);
                }
            }
        }
        imagemDescomprimida.close();
    }

    private void write(String linhaComprimida) throws IOException {
        this.imagemDescomprimida.write(linhaComprimida + " ");
    }

    public BufferedReader getImagemComprimida() {
        return imagemComprimida;
    }

    public void setImagemComprimida(BufferedReader imagemComprimida) {
        this.imagemComprimida = imagemComprimida;
    }

    public BufferedWriter getImagemDescomprimida() {
        return imagemDescomprimida;
    }

    public void setImagemDescomprimida(BufferedWriter imagemDescomprimida) {
        this.imagemDescomprimida = imagemDescomprimida;
    }
}