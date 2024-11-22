package estudo.interfaces.exemplo2;

public class Aplication {

	public static void main(String[] args) {
		PingPong pingPong = new PingPong();
		VideoGame xDevOne = new VideoGame();
		xDevOne.ligar(pingPong);
		xDevOne.jogar(pingPong);
		xDevOne.fechar();
	}

}
