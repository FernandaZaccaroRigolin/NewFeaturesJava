package B_MethodReferences;

//Functional interface
interface Figura2D1 {
	Retangulo2 desenha(Double largura, Double altura);
}

class Retangulo2 {
	
	public Retangulo2(Double largura, Double altura) {
		System.out.println("Desenha retangulo de Largura: " + largura + " e Altura: " + altura);
	}
}

public class MethodReferencesExemplo04 {

	public static void main(String[] args) {
		
		/*Method reference 
		* Refer�ncia a um construtor
		*/
		Figura2D1 fig1 = Retangulo2::new;
		
		fig1.desenha(10.5, 7.0);

	}

}
