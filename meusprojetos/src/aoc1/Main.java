package aoc1;

public class Main {
    public static void main(String[] args) {
        DecimalBinario pi = new DecimalBinario(3.1415926f);
        System.out.println("Pi em Binário: " +pi.getBinario());
        BinarioMips binarioMips = new BinarioMips(pi.getBinario());
        System.out.println("\nBinário PI no Mips: " +binarioMips.getBinarioFinal());
        System.out.println(binarioMips.toString());
    }

}
