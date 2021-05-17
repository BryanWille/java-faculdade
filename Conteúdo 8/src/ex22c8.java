public class ex22c8 {
    public static void main(String[] args){
        int uni, dez, cen, mil, memoria = 0, cont = 0;
        for (int contador = 1000; 9999>= contador; contador ++){
            uni = contador % 10;
            dez = (contador % 100) / 10;
            cen = (contador / 100) % 10;
            mil = contador / 1000;
            if(mil == uni && dez == cen){
                System.out.println(contador);
                memoria += contador;
                cont += 1;
            }
        }
        System.out.println("Foram encontrados " +cont +" numeros palindromos é a media de soma é " +(float) (memoria/cont));
    }
}
