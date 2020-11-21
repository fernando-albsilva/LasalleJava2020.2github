package excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
				Scanner entrada = new Scanner(System.in);
				
				System.out.println("Entre com um numero:");
				
				int num = entrada.nextInt();
				
				System.out.println("numero lindo = " + num);
			}
			catch	(InputMismatchException e)
			{
				System.out.println("Não é permitido outro valor além de números:");
			}
			catch (IndexOutOfBoundsException e)
		{
				System.out.println(" Fora do limite de espaco");
		}
		finally { //se gera um erro trata o erro e vem para o finally
			System.out.println("Fim do programa");
		}
		
		
		
		
		
		
//			catch (Exception e)  Trata qualquer tipo de excecao
//			{
//				System.out.println(e);
//				System.out.println("Erro ");
//			}
	 
		
		

	}

}
