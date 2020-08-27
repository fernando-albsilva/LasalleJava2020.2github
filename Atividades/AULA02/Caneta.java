
public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;

	void rabiscar() {
		if (tampada) {
			System.out.println("ERRO");
		} else {
			System.out.println("Rabiscando");
		}

	}

	void tampar() {
		tampada = true;
	}

	void destampar() {
		tampada = false;
	}

}
