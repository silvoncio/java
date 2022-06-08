package att;

public class preguiça extends animal {
private String localizacao;
	
	public preguiça(String nome, int idade,String localizacao) {
		super(nome,idade);
		this.localizacao = localizacao;
	}
	
	public void emitirSom() {
		System.out.println(this.getNome()+" diz: aaah ah aaaah");
	}
	
	public void subirArvore() {
		System.out.println("subindo na árvore");
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
}
