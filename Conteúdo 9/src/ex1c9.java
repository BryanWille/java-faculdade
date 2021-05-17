public class ex1c9 {
    public static void main(String[] args){
        double numero = 0, somador = 0;
        for(int c = 37; c > 0; c--){
            numero += 1;
            somador += c * (c+1)/numero;
        }
        System.out.println(somador);
    }
}
