import java.util.Scanner;

public class Paginas {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        while (keyb.hasNext()) {
            String entrada = keyb.nextLine();
            if (Integer.parseInt(entrada.substring(0, 1)) != 0) {
                int quantPagDia = Integer.parseInt(entrada.substring(0, entrada.indexOf(" ")));
                int numeroDias = Integer.parseInt(entrada.substring(entrada.indexOf(" ") + 1, entrada.lastIndexOf(" ")));
                int novaQuantPag = Integer.parseInt(entrada.substring(entrada.lastIndexOf(" ") + 1));
                int mmc = mmc(quantPagDia, novaQuantPag);
                quantPagDia = mmc / quantPagDia;
                novaQuantPag = mmc / novaQuantPag;
                int pag = (numeroDias * mmc) / (quantPagDia - novaQuantPag);
                if(pag == 1 ){
                    System.out.println(pag + " pagina");
                } else {
                    System.out.println(pag + " paginas");
                }
            }
        }
    }

    public static int mdc(int a, int b) {
        if (a == 0)
            return b;
        return mdc(b % a, a);
    }

    // method to return LCM of two numbers
    public static int mmc(int a, int b) {
        return (a / mdc(a, b)) * b;
    }
}
/* Python
    from math import lcm

while True:
    try:
        entrada = input("")
        if entrada == '0':
            break
        entrada = entrada.split(" ")
        quantPagDia = int(entrada[0])
        numeroDias = int(entrada[1])
        novaQuantPag = int(entrada[2])
        mmc = lcm(quantPagDia, novaQuantPag)
        quantPagDia = mmc / quantPagDia
        novaQuantPag = mmc / novaQuantPag
        pag = abs((numeroDias * mmc) / (quantPagDia - novaQuantPag))
        print(f'{pag:.0f} paginas')
    except EOFError:
        break

from math import lcm
cont = 0
for i in range(1, 20):
    for j in range(1, 20):
        for k in range(1, 20):
            if not k == i:
                quantPagDia = i
                numeroDias = j
                novaQuantPag = k
                mmc = lcm(quantPagDia, novaQuantPag)
                quantPagDia = mmc / quantPagDia
                novaQuantPag = mmc / novaQuantPag
                pag = abs((numeroDias * mmc) / (quantPagDia - novaQuantPag))
                if pag == 1:
                    cont += 1
                    print(f'{i} {j} {k} = {pag}')
print(cont)

 */