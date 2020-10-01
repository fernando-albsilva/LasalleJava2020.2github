/*
Nome: Fernando Albuquerque Silva
Matricula : 0050005653
*/

package questao3;

public abstract class Cliente {
	private String endereco;
	private String telefone;
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void mostra_endereco() {
		System.out.println("Cliente nao possui endereco cadastrado");
	}
	
}
