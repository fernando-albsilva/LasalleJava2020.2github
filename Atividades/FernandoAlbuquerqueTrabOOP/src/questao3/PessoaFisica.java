/*
Nome: Fernando Albuquerque Silva
Matricula : 0050005653
*/

package questao3;

public class PessoaFisica extends Cliente {
	
	private String nome;
	private String cpf;
	
	public PessoaFisica(String nome,String cpf,String endereco,String telefone) {
		this.nome=nome;
		this.cpf=cpf;
		this.setEndereco(endereco);
		this.setTelefone(telefone);
	}
	public PessoaFisica() {
		System.out.println("É preciso passar nome,cpf,edereco e telefone para criar PessoaFisica");
	}
	
	@Override
	public void mostra_endereco() {
		System.out.println(this.getEndereco());
	}
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	
}
