package att;

public class cachorro extends animal {
	public cachorro(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	private String corDoPelo;
	private String raca;
	
	public cachorro (String nome, int idade, String corDoPelo, String raca) {
		super(nome,idade);
		this.corDoPelo = corDoPelo;
		this.raca = raca;
	}
	
	public void emitirSom() {
		System.out.println(this.getNome()+" diz: au au!");
	}
	
	public void correr() {
		System.out.println("correndo!");
	}

	public String getCorDoPelo() {
		return corDoPelo;
	}

	public void setCorDoPelo(String corDoPelo) {
		this.corDoPelo = corDoPelo;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
}
