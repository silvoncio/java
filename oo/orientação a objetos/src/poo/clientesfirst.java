package poo;

public class clientesfirst {
	private String nome;
	private String cpf;
	private String telefone;
	private String genero;
	private int idade;
	
	public void Cliente (String nome, String cpf, String telefone, String genero, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.genero = genero;
		this.idade = idade;
	}
	
	public void mostrarInfo() {
		System.out.println("\n************Informações do cliente************");
		System.out.printf("nome: %s \nidade: %d \ncpf: %s \ngenero: %s \ntelefone: %s \n",
		nome,idade,cpf,genero,telefone);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}

