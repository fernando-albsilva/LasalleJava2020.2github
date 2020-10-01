/*
Nome: Fernando Albuquerque Silva
Matricula : 0050005653
*/

package questao3;

public class PessoaFisicaTester {

	public static void main(String[] args) {
		
		/* aqui ele inicializa o metodo construdor que tem a assinatura com esses parametros"*/
		PessoaFisica pessoaFisica = new PessoaFisica("fernando","11111111","rua 10","985326578");
		
		System.out.println("nome = "+ pessoaFisica.getNome());
		System.out.println("cpf = "+ pessoaFisica.getCpf());
		/*o metodo mostra_endereco da classe PessoaFisica sobrepoe o da classe Cliente.
		 * Polimorfismo de Sobreposição 
		 *
		 * */
		System.out.print("endereco = ");
		pessoaFisica.mostra_endereco();
		System.out.println("telefone = "+ pessoaFisica.getTelefone());
		
		
		System.out.println("******************************************************************");
		/* aqui ele inicializa o outro metodo construdor que tem a assinatura com esses parametros
		 * acarretando que nenhum atributo é inicializado. 
		 * Polimorfismo de sobrecarga"*/
		PessoaFisica pessoaFisica2 = new PessoaFisica();
		
		System.out.println("nome = "+ pessoaFisica2.getNome());
		System.out.println("cpf = "+ pessoaFisica2.getCpf());
		System.out.print("endereco = ");
		pessoaFisica2.mostra_endereco();
		System.out.println("telefone = "+ pessoaFisica2.getTelefone());
	}

}
