
public class Pedido {
	
	private String comprador;
	private double valorTotal;
	
	public Pedido(String comprador) {
		this.comprador=comprador;
		this.valorTotal=0.0;
	}
	
	public void adiciona(Item item) {
		
		this.valorTotal+=( item.getValorUnitario()*item.getQuantidade());
	}
	
	public String getComprador() {
		return this.comprador;
	}
	
	public double mostrarValorTotal() {
		return this.valorTotal;
	}
	
	

}
