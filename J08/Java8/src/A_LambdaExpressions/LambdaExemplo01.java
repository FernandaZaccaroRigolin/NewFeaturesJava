package A_LambdaExpressions;

interface Figura {
	
	void desenha();
}

//Classe concreta implementa a interface Figura
class Circunferencia implements Figura {

	@Override
	public void desenha() {
		System.out.println("\nClasse Circunferencia: desenha circunfer�ncia.");
	}
}


public class LambdaExemplo01 {

	public static void main(String[] args) {
		
		//Implementa��o sem lambda expression - utilizando classe concreta
		Circunferencia cir = new Circunferencia();
		cir.desenha();
		
		/*************************************************************/
		
		//Implementa��o sem lambda expression - utilizando classe an�nima
		Figura fig = new Figura() {
			
			@Override
			public void desenha() {
				System.out.println("\nInterface Figura: desenha circunferencia.");
			}
		};
		fig.desenha();
		
		/*************************************************************/
		
		//Lambda expression sem argumentos
		Figura fig2 = () -> System.out.println("\nLambda Expression: desenha circunfer�ncia.");
		fig2.desenha();
		
		/*************************************************************/
				
		//Lambda expression sem argumentos e com m�ltiplos m�todos
		Figura fig3 = () -> {
			System.out.println("\nLambda Expression - multiplos metodos:");
			System.out.println("desenha circunferencia.");
		};
		fig3.desenha();
	}

}
