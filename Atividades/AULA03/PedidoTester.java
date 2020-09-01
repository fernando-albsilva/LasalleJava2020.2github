
import java.util.Scanner;

public class PedidoTester {
	
	public static void main(String[] args) {
		
		String itemNome;
		double valorItem;
		int quantidade;
		
		
		Scanner input=new Scanner(System.in);
		
		
		
		System.out.println("----------------------------------------");
		System.out.print("Digite o nome do comprador :");
		Pedido pedido = new Pedido(input.next());
		System.out.println("----------------------------------------");
		
		System.out.print("Digite o nome do Item1 : ");
		itemNome=input.next();
		System.out.println("");
		
		System.out.print("Digite o valor unitario do Item1 : ");
		valorItem=input.nextDouble();
		System.out.println("");
		
		System.out.print("Digite a quantidade  do Item1 '"+ itemNome +"' : " );
		quantidade=input.nextInt();
		System.out.println("");
			
		Item item1 = new Item(itemNome,valorItem,quantidade);
		
		
		
		System.out.println("----------------------------------------");	
		System.out.print("Digite o nome do Item2 : ");
		itemNome=input.next();
		System.out.println("");
		
		System.out.print("Digite o valor unitario do Item2 : ");
		valorItem=input.nextDouble();
		System.out.println("");
		
		System.out.print("Digite a quantidade  do Item2 '"+ itemNome +"' : " );
		quantidade=input.nextInt();
		System.out.println("");
		
			
		Item item2 = new Item(itemNome,valorItem,quantidade);
		
		
		
		pedido.adiciona(item1);
		pedido.adiciona(item2);

		
		
		System.out.println("----------------------------------------");	
		System.out.println("valor total " + pedido.mostrarValorTotal());
		System.out.println("----------------------------------------");	
		
		System.out.println("Comprador : "+ pedido.getComprador());
		System.out.println("------------------------------------------------------------------------------------------------------------");	

		System.out.println(" Produto : " + item1.getDescricao() + "/ Valor Unitario : " + item1.getValorUnitario() + "/ Quantidade : " + item1.getQuantidade()
		+ "/ total :" + (item1.getValorUnitario()*item1.getQuantidade()));
		System.out.println("------------------------------------------------------------------------------------------------------------");	
		System.out.println(" Produto : " + item2.getDescricao() + "/ Valor Unitario : " + item2.getValorUnitario() + "/ Quantidade : " + item2.getQuantidade()
		+ "/ total :" + (item2.getValorUnitario()*item2.getQuantidade()));
	}
	
}
