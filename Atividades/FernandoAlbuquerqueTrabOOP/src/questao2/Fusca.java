/*
Nome: Fernando Albuquerque Silva
Matricula : 0050005653
*/

package questao2;

public class Fusca extends Carro{
	
	public Fusca(String marca)
	{
		this.setMarca(marca);
	}
	
	@Override
	public void mostrar_marca() {
		System.out.println(this.getMarca());
	}
}
