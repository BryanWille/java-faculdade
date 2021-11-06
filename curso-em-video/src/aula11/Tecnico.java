package aula11;

public class Tecnico extends Aluno {
    private String registroProfissional;

    public void praticar(boolean teste){
        if(teste){
            System.out.println("Praticando com sucesso!");
        } else {
            System.out.println("Você tem que praticar!");
        }
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }
    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
