package exercicioAnimal;

public class TestarAnimais {
    public static void main(String[] args){
        Mamifero camelo = new Mamifero("Camelo", "Beje", "Terra",
                150, 2, 4, "Grama");
        Peixe tubarao = new Peixe("Tubarão", "Cinzento", "Mar",
                300, 1.5f, 0, "Barbatanas e cauda");
        Mamifero ursocanada = new Mamifero("Urso-do-canadá", "Vermelho", "Terra",
                180, 0.5f, 4, "Mel");

        camelo.dadosMamifero();
        System.out.println("\n\n");
        tubarao.dadosPeixe();
        System.out.println("\n\n");
        ursocanada.dadosMamifero();
    }
}
