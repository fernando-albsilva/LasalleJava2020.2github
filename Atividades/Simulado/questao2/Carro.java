/*
Nome: Fernando Albuquerque Silva
Matricula : 0050005653
*/

package questao2;



public class Carro extends Veiculo{

	public Carro() {
		this.setVelocidade_maxima(150);
		this.setPotencia(130);
	}
	
	public void mostrar_marca() {
		System.out.println(this.getMarca());
	}
}


