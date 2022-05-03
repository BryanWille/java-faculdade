public class ConversorDias {
    public static void main(String[] args) {
        int tempoDias = 370;
        int ano = (tempoDias / 365);
        int dias = tempoDias % 30;
        int meses = ((tempoDias - dias) - ano * 365) / 30;
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)", ano, meses, dias);
    }
}
