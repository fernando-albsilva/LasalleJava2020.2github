
public class Jogador {

	int idade;
	String nome;
	boolean jogando;

	void chutar() {
		if (jogando)
			System.out.println("Chutou a bola.");
		else
			System.out.println("Jogador nao pode chutar pois nao está jogando.");
	}

	void defender() {
		if (jogando)
			System.out.println("Jogador defendeu a jogada.");
		else
			System.out.println("Jogador nao pode defender pois não está jogando.");
	}
}
