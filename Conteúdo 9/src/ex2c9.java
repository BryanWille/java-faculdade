public class ex2c9 {
    public static void main(String[] args){
        double div = 0;
        for (int c = 0; 100 >= c; c++){
            div += c / (Math.pow(c, 2) + (c - 1));
        }
        System.out.println(div);
    }
}
