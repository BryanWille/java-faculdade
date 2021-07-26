public class Person {
    public static void main(String[] args){
        Test bryan = new Test();
        System.out.println();
        bryan.nome = "Bryan";
        bryan.idade = 18;
        System.out.println(bryan.nome + bryan.idade);
    }
}
class Test{
    String nome;
    int idade;
}