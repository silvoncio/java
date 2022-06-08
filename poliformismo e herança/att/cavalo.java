package att;

public class cavalo extends animal {
private double tamanho;
	
	public cavalo (String nome, int idade, double tamanho) {
		super(nome,idade);
		this.tamanho = tamanho;
	}
	
	public void correr() {
		System.out.println("tru tru tru...");
	}
	
	public void emitirSom () {
		System.out.println(this.getNome()+" diz: brluuuu");
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

}
