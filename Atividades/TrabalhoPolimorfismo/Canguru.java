package semana05aula;

public class Canguru extends Mamifero{

	public Canguru(String corPelo) {
		this.corPelo=corPelo;
	}
	
	public Canguru() {
		this.corPelo="Cor do pelo nao definida!";
	}
	
	@Override
	public void imprimeCorPelo() {
		System.out.println(this.corPelo);
	}
	
	@Override
	public  void locomover() {
		System.out.println("Canguru andou ");
	}
		
	@Override
	public  void alimentar() {
		System.out.println("Canguru se alimentou");
	}
	

	@Override
	public void emitirSom() {
		System.out.println("grrrrrrrrrrrrrrr!");
	}

	
}
