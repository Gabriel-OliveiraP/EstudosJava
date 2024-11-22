package estudo.interfaces.exemplo2;

public class VideoGame{
	
	private Boolean estaLigado = false;
	private Jogo jogo;

	public void ligar(Jogo jogo) {
		System.out.println("Ligando o videogame");
		System.out.println("Iniciando o jogo: ");
		estaLigado = true;
	} 
	public void jogar(Jogo jogo) {
		if(estaLigado == true) {
		System.out.println("Jogando o jogo");
		this.jogo = jogo;
		jogo.jogar();
		}
		else {
			System.out.println("Primeiro se deve ligar o VideoGame");
		}
		
	}
	public void fechar() {
		System.out.println("Fechando o jogo");
		if(jogo != null) {
			jogo.fechar();
			estaLigado = null; // redefinindo o valor de nulo para tirar o jogo da variavel
		}
		else {
			System.out.println("Não tem nenhum jogo rodando");
		}
	}
	
}
