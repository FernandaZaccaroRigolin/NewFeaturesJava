package B_SwitchExpressionsYield;
import java.util.Scanner;

public class SwitchExpressionsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Digite o dia da semana: ");
		
		Scanner input = new Scanner(System.in);
		
		String dia = input.nextLine();
		
		input.close();
		
		String resultado =switch (dia) {
			case "segunda":
				yield "dia �til";
			case "ter�a":
				yield "dia �til";
			case "quarta":
				yield "dia �til";
			case "quinta":
				yield "dia �til";
			case "sexta":
				yield "dia �til";
			case "s�bado":
				yield "final de semana";
			case "domingo":
				yield "final de semana";
			default:
				yield "dia inv�lido";
		};
		
		System.out.println(resultado);

	}

}
