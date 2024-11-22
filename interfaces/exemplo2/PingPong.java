package estudo.interfaces.exemplo2;

public class PingPong implements Jogo{

	@Override
	public void jogar() {	
		System.out.println("Cutscene inicial...");
		System.out.println("Menu principal..");
		System.out.println("Tocando musica de fundo..");
	}

	@Override
	public void fechar() {
		System.out.println("Salvando o progresso...");
		System.out.println("Fechando o jogo.....");
	}
	
	
}
