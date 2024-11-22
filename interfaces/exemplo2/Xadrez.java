package estudo.interfaces.exemplo2;

public class Xadrez implements Jogo {

	@Override
	public void jogar() {
		System.out.println("Exibir Menu");
		System.out.println("Peças iniciais...");
	}

	@Override
	public void fechar() {
		System.out.println("Fechando o jogo...");
	}

}
