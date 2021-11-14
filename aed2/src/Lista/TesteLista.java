package Lista;

public class TesteLista {
    private static ListaEstatica le;
    private static ListaDinamica ld;
    public static void main(String[] args){

      // ----------------------- LISTA ESTÁTICA ----------------------- //

      le = new ListaEstatica(4);
      System.out.println(le.vazia()); // True
      System.out.println(le.consultarInicio()); // Lista Vazia

      le.inserir("A");
      le.inserir("B");
      le.inserir("C");
      le.inserir("D");
      le.inserir("E"); //Erro Capacidade Excedida

      System.out.println(le.vazia()); //false
      System.out.println(le.toString()); // "A, B, C, D"
      System.out.println(le.tamanho()); // 4
      System.out.println(le.consultarInicio()); // A
      System.out.println(le.consultarFim()); // D

      le.retirarInicio(); // B, C, D
      le.retirarFim(); // B, C
      le.retirarFim(); // B
      le.retirarInicio(); // null

      System.out.println(le.toString()); // null
      System.out.println(le.tamanho()); // 0

      le.limpar();

      le.inserir(1);
      le.inserir(2);
      le.inserir(3);
      le.inserir(4);
      le.inserir(5); // Erro: capacidade excedida

      System.out.println(le.toString()); // 1, 2, 3, 4
      System.out.println(le.tamanho()); // 4

      System.out.println(le.consultarInicio()); // 1
      System.out.println(le.consultarFim()); // 4



      // ----------------------- LISTA DINÂMICA ----------------------- //

      ld = new ListaDinamica();

      ld.inserir("A");
      ld.inserir("B");

      ld.inserirInicio("C");
      System.out.println("Conteúdo: " +ld.toString() +" Tamanho: " +ld.tamanho()); // "C, A, B" 3
      ld.inserirFim("D");
      System.out.println("Conteúdo: " +ld.toString() +" Tamanho: " +ld.tamanho()); // "C, A, B, D" 4
      ld.inserir("E", 3);
      System.out.println("Conteúdo: " +ld.toString() +" Tamanho: " +ld.tamanho()); // "C, A, B, E, D" 5
      ld.inserir("F", 1000); // Erro Chave não é valida, posicionamento é maior que o contador
      System.out.println("Conteúdo: " +ld.toString() +" Tamanho: " +ld.tamanho()); // "C, A, B, E, D" 5

      ld.retirarInicio();
      System.out.println("Conteúdo: " +ld.toString() +"Tamanho: " +ld.tamanho()); // "A, B, E, D" 4
      ld.retirarFim();
      System.out.println("Conteúdo: " +ld.toString() +"Tamanho: " +ld.tamanho()); // "A, B, E" 3
      ld.retirar(2);
      System.out.println("Conteúdo: " +ld.toString() +"Tamanho: " +ld.tamanho()); // "A, E" 2
      ld.retirar(-1); // Erro chave inválida
      System.out.println("Conteúdo: " +ld.toString() +"Tamanho: " +ld.tamanho()); // "A, E" 2

      ld.limpar();
      System.out.println("Conteúdo: " +ld.toString() +"Tamanho: " +ld.tamanho()); // null

      ld.inserir("B");
      ld.inserir("A");
      ld.inserir("C");
      ld.inserir("D");
      ld.inserir("E");
      System.out.println("Conteúdo: " +ld.toString() +"Tamanho: " +ld.tamanho()); // "B, A, C, D, E" 5

      ListaDinamica lisdin = ld.copiar();
      System.out.println("Conteúdo: " +lisdin.toString() +"Tamanho: " +lisdin.tamanho()); // "B, A, C, D, E" 5



    }
}
