package estudo.interfaces.exemplo2;

public class TiroAoAlvo implements Jogo {

	@Override
	public void jogar() {
		System.out.println("Carregando o jogo...");
		System.out.println("Se conectando ao servidor...");
		
	}

	@Override
	public void fechar() {
		System.out.println("Salvando o progresso...");
		System.out.println("Saindo da partida...\nSaindo do jogo...");
	}

	
}
