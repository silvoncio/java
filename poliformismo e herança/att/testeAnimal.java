package att;

public class testeAnimal {
public static void main(String[]args) {
		
		animal doguinho = new cachorro("thor",4,"caramelo","Vira-lata");
		animal cavalo = new cavalo ("sorriso",6,2.1);
		animal preguica = new pregui�a ("kaka",2,"�sia");
		
		doguinho.emitirSom();
		cavalo.emitirSom();
		preguica.emitirSom();
	}
}
