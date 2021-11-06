package testes;//Bryan Wille Souto Braga

import java.util.Objects;
import java.util.Scanner;

public class E01438Ateste {
    public static void main(String[] args) {
        int idade, quantPessoas = 0, primeiraMulher = 0;
        double salMedHom, salTotHom = 0, quantHom = 0, menorPesoMul = 0, quantSalMin = 0, salario, peso;
        String nome = "", nomeMagMul = "", sexo;
        Scanner arquivo = new Scanner(Objects.requireNonNull(E01438Ateste.class.getResourceAsStream("testes/depuracao.txt")));
        do {
            while (arquivo.hasNextLine()) {
                nome = arquivo.nextLine();
                if (!nome.equalsIgnoreCase("fim")) {
                    quantPessoas += 1;
                    idade = Integer.parseInt(arquivo.nextLine());
                    sexo = arquivo.nextLine().toUpperCase();
                    salario = Double.parseDouble(arquivo.nextLine());
                    peso = Double.parseDouble(arquivo.nextLine());
                    switch (sexo) {
                        case "M":
                            quantHom += 1;
                            salTotHom += salario;
                            break;
                        case "F":
                            primeiraMulher += 1;
                            if (primeiraMulher == 1 || menorPesoMul > peso) {
                                menorPesoMul = peso;
                                nomeMagMul = nome;
                            }
                            break;
                    }
                    if (idade > 25 && idade < 40 && 940 > salario) {
                        quantSalMin += 1;
                    }
                }
            }
        } while (!nome.equalsIgnoreCase("FIM"));
        salMedHom = salTotHom / quantHom;
        System.out.println("O Total de pessoas pesquisadas foi de: " + quantPessoas);
        System.out.println("O Salário médio dos homens foi: R$" + salMedHom);
        System.out.println("Quantidade de pessoas entre 25 e 40 anos, com salário menor que R$940 foi de: " + quantSalMin
                + " pessoas.");
        System.out.println("A mulher mais magra foi " + nomeMagMul + ", com o peso de " + menorPesoMul + " kg.");
        System.out.println("Fim, Obrigado por participar da Pesquisa!");

    }
}