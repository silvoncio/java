package att;

public class animal {
	private String nome;
	private int idade;
	
	public animal (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void emitirSom() {
		System.out.println("hrrrr hrrrr hrrrr");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
