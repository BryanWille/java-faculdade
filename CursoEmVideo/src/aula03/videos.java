package aula03;

public class videos {
    public static void main(String[] args) {

        Editar fonfon = new Editar();

        fonfon.title = "Ainda não sei qual é o título";
        fonfon.releaseHour = 17;

        fonfon.release();

        Editar matta = new Editar();

        fonfon.title = "HKUN";
        fonfon.releaseHour = 21;

        fonfon.release();
    }
}
