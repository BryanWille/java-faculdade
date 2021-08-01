package aula07;

public class UltraEmojiCombat {
    public static void main(String[] args){
        Lutador[] l = new Lutador[6];
         l[0] = new Lutador("Pretty Boy", "França",
                1.75, 68.9, 31, 11, 2, 1);

        l[1] = new Lutador("Putscript", "Brasil",
                1.68, 57.8, 29, 14, 2, 3);

        l[2] = new Lutador("Snapshadow", "EUA",
                1.65, 80.9, 35, 12, 2, 1);

        l[3] = new Lutador ("Dead Code", "Austrália",
                1.93, 81.6, 28, 13, 0, 2);

        l[4] = new Lutador ("UFOCobol", "Brasil", 1.70, 119.3,
                37, 5, 4, 3);

        l[5] = new Lutador ("Nerdaart", "EUA",
                 1.81, 105.7, 30, 12, 2, 4);

        l[3].status();

    }
}
