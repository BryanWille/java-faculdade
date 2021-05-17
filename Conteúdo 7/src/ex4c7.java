import java.util.Scanner;

public class ex4c7 {
	public static void main(String[] args) {
		String equipe = "", estado = "";
		Scanner keyb = new Scanner(System.in);
		System.out.print("Digite o nome de uma equipe de Futebol: ");
		equipe = keyb.nextLine();
		switch (equipe) {
			case "América": case "Atlético": case "Cruzeiro": case "Villa Nova":
				estado = "Minas Gerais";
				break;
			case "Botafogo": case "Flamengo": case "Fluminense": case "Vasco":
				estado = "Rio de Janeiro";
				break;
			case "Corinthians": case "Palmeiras": case "Santos": case "São Paulo":
				estado = "São Paulo";
				break;
			case "Grêmio": case "Internacional": case "Juventude":
				estado = "Rio Grande do Sul";
				break;
			case "Náutico": case "Santa Cruz": case "Sport":
				estado = "Pernambuco";
				break;
			default:
				System.out.println("Time inválido!");
				break;
		}
		keyb.close();
		System.out.println("O time " +equipe +" é do estado de " +estado +"!");
	}

}
