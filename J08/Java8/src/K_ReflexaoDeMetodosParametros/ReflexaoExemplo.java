package K_ReflexaoDeMetodosParametros;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class Produto {
	private String nome;
	private Double preco;
	
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
}

public class ReflexaoExemplo {

	public static void main(String[] args) {
		
		//Inst�ncia da classe Produto
		Produto p = new Produto("Geladeira", 3000.00);
		
		//Inst�ncia da classe Class
		Class<? extends Produto> cl = p.getClass();
		
		//Todos os m�todos declarados na classe Produto
		Method[] method = cl.getDeclaredMethods();
		
		for(Method m : method) {
			System.out.println(m.getName());
			
			//Par�metros do m�todo
			Parameter[] parameter = m.getParameters();
			
			for(Parameter pr : parameter) {
				System.out.println(pr);
			}
		}
		
		
	}

}
