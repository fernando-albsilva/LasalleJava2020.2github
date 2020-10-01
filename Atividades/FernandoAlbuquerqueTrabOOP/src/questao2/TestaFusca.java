/*
Nome: Fernando Albuquerque Silva
Matricula : 0050005653
*/
package questao2;

public class TestaFusca {

	public static void main(String[] args) {
		
		Fusca fusca = new Fusca("volkswagen");
		
		fusca.mostrar_marca();
		System.out.println("Velocidade maxima = " + fusca.getVelocidade_maxima());
		System.out.println("Potencia = " + fusca.getPotencia());
		
			

	}

}
