package att;

public class testeAnimal {
public static void main(String[]args) {
		
		animal doguinho = new cachorro("thor",4,"caramelo","Vira-lata");
		animal cavalo = new cavalo ("sorriso",6,2.1);
		animal preguica = new preguiça ("kaka",2,"Ásia");
		
		doguinho.emitirSom();
		cavalo.emitirSom();
		preguica.emitirSom();
	}
}
