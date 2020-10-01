/*
Nome: Fernando Albuquerque Silva
Matricula : 0050005653
*/
package questao2;

public abstract class Veiculo {
	
	private String marca;
	private float velocidade_maxima;
	private float potencia;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getVelocidade_maxima() {
		return velocidade_maxima;
	}
	public void setVelocidade_maxima(float velocidade_maxima) {
		this.velocidade_maxima = velocidade_maxima;
	}
	public float getPotencia() {
		return potencia;
	}
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
	
	

}
