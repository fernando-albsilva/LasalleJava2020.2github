
public class JogadorTester {

	public static void main(String[] args) {
		Jogador jogador = new Jogador();

		jogador.jogando = true;
		jogador.chutar();
		jogador.defender();

		jogador.jogando = false;
		jogador.chutar();
		jogador.defender();

	}

}
