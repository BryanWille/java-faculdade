import java.util.Scanner;

public class ex4c7 {
	public static void main(String[] args) {
		String equipe = "", estado = "";
		Scanner keyb = new Scanner(System.in);
		System.out.print("Digite o nome de uma equipe de Futebol: ");
		equipe = keyb.nextLine();
		switch (equipe) {
			case "Am�rica": case "Atl�tico": case "Cruzeiro": case "Villa Nova":
				estado = "Minas Gerais";
				break;
			case "Botafogo": case "Flamengo": case "Fluminense": case "Vasco":
				estado = "Rio de Janeiro";
				break;
			case "Corinthians": case "Palmeiras": case "Santos": case "S�o Paulo":
				estado = "S�o Paulo";
				break;
			case "Gr�mio": case "Internacional": case "Juventude":
				estado = "Rio Grande do Sul";
				break;
			case "N�utico": case "Santa Cruz": case "Sport":
				estado = "Pernambuco";
				break;
			default:
				System.out.println("Time inv�lido!");
				break;
		}
		keyb.close();
		System.out.println("O time " +equipe +" � do estado de " +estado +"!");
	}

}
