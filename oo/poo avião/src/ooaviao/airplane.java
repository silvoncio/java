package ooaviao;

public class airplane {
	private String modelo;
	private int velMax;
	private int capacidadeP;
	private String fabricante = "Embraer";
	
	public void Aviao (String modelo, int velMax,int capacidadeP) {
		this.modelo = modelo;
		this.velMax = velMax;
		this.capacidadeP = capacidadeP;
	}
	public void Aviao(String modelo, int velMax, int capacidadeP,String fabricante) {
		this.modelo = modelo;
		this.velMax = velMax;
		this.capacidadeP = capacidadeP;
		this.fabricante = fabricante;
	}
	
	public void mostrarInfo() {
		System.out.println("\n************Informações do Avião************");
		System.out.printf("\nmodelo: %s \nvel-max: %d \ncapacidade de passageiros: %d \nfabricante: %s \n",
		modelo,velMax,capacidadeP,fabricante);
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getVelMax() {
		return velMax;
	}
	public void setVelMax(int velMax) {
		this.velMax = velMax;
	}
	public int getCapacidadeP() {
		return capacidadeP;
	}
	public void setCapacidadeP(int capacidadeP) {
		this.capacidadeP = capacidadeP;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
}
