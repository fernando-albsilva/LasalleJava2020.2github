package semana05aula;

public class Reptil extends Animal {

	String corEscama;
	
	public Reptil(String corEscama) {
		this.corEscama=corEscama;
	}
	public Reptil() {
		this.corEscama=" Sem cor de escama definada";
	}
	
	public void imprimeCorEscama() {
		System.out.println(this.corEscama);
	}
	
	@Override
	public void locomover() {
		System.out.println("Reptil se locomoveu");
		
	}
	@Override
	public void alimentar() {
		System.out.println("Reptil alimentado");
	}
	@Override
	public void emitirSom() {
		System.out.println("sssssssssssssssssss");
		
	}
	
	
	
}
