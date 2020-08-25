/* NOME: Fernando Albuquerque Silva
 * MATRICULA : 0050005653
 */


import java.util.Scanner;

public class Ex2FernandoAlbuquerque {

	public static void main(String[] args) {
		int Numero,Teste=1;

		do {
				Scanner input=new Scanner(System.in);

				System.out.println("-----------------------------------------------------------------");
				System.out.print("Digite o numero para ver se o mesmo é par ou impar : ");
				Numero = input.nextInt();

				if (Numero % 2 == 0) {
					System.out.println("-----------------------------------------------------------------");
					System.out.println(" O número é par");
					System.out.println("-----------------------------------------------------------------");
				}else {
					System.out.println("-----------------------------------------------------------------");
					System.out.println(" O Número é impar");
					System.out.println("-----------------------------------------------------------------");
				}


				System.out.print("Digite o numero zero para sair ou otro numero para testar novamente: ");
				Teste = input.nextInt();
				System.out.println("-----------------------------------------------------------------");


		} while (Teste != 0);


	}

}