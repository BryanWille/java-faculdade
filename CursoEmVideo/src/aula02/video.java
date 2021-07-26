package aula02;

public class video {
    public static void main(String[] args) {

        Assistir flow = new Assistir();
        flow.duracao = 7200;
        flow.titulo = "[CANNABIS MEDICINAL] DR. GEOVANE MASSA - Flow Podcast #420";
        flow.videoBom = true;
        flow.velocidade = 1;

        flow.assistirVideo();
        flow.setVelocidade();

        Assistir aulaPortugues = new Assistir();
        aulaPortugues.duracao = 3600;
        aulaPortugues.titulo = "Língua Portuguesa para Concursos 2021- Aula 1/3 - AlfaCon";
        aulaPortugues.videoBom = false;
        aulaPortugues.velocidade = 2;

        aulaPortugues.assistirVideo();
        aulaPortugues.setVelocidade();
    }
}
