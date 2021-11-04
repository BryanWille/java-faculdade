package Lista;

public class TesteLista {
    public static void main(String[] args){
        ListaEstatica le = new ListaEstatica(5);
        le.inserir("Olá");
        le.inserir("Teste no Console");
        le.inserir("Mundo!");
        le.inserir("Testando,");
        le.inserir("uma Lista Estática");
        System.out.println(le.toString());
        le.retirar(3);
        System.out.println(le.toString());
    }
}
