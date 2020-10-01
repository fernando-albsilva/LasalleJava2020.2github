/*
Nome: Fernando Albuquerque Silva
Matricula : 0050005653
*/
package questao1;

public class Dados {

	public void mostrar(int num) {
		if( (num % 2) == 0) {
			System.out.println(" O número é par");
		}else {
			System.out.println(" O número é impar");
		}
	}
	
	public void mostrar(String str) {
		System.out.println(" O tamanho da string é : " + str.length());
	}
}
