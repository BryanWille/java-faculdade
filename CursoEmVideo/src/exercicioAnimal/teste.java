package exercicioAnimal;

public class teste{
    public static void main(String[] args){
        Animal Cachorro = new Animal("Budgy", "Marrom",
                "Doméstico", 70.2f, 13f, 4);
        Cachorro.dados();
        System.out.println("\n \n");
        Peixe Nemo = new Peixe("Nemo", "Laranja e Branco", "Recife Marítmo",
                10.5f, 15f, 2, "áquatico");
        Nemo.dadosPeixe();
    }
}