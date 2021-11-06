package aula02;

public class Editar {
    String title;
    int releaseHour;

    void release(){
        if(releaseHour - 14 < 4){
            System.out.println("You have to edit this right now!" +this.title);
        } else {
            System.out.println("Be careful with release hour" +this.title);
        }
    }
}
