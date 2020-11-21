package view;

import java.util.Scanner;

import bo.Aluno;
import controller.AlunoController;

public class AlunoView {

	public static String teste;
	
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		Aluno aluno = new Aluno();
		AlunoController controller = new AlunoController();
		
		

			
		
		for(;;) {
				System.out.println("**********************");
				System.out.println("1->incluir Aluno:");
				System.out.println("2->excluir Aluno:");
				System.out.println("3->alterar Aluno:");
				System.out.println("4->buscar Aluno:");
				System.out.println("**********************");
				System.out.print("opçao:");
				teste = in.next();
				
				
				
				
				
				
				
				switch (teste) 
			      {
			          //comparing value of variable against each case
			        case "1":
			        	System.out.println("Inserindo aluno:");
			        	System.out.println("Entre com o cpf do aluno:");
			    		aluno.setCpf(in.next());
			    		System.out.println("Entre com o nome do aluno:");
			    		aluno.setNome(in.next());
			    		System.out.println("Entre com o sexo do aluno:");
			    		aluno.setSexo(in.next());
			    		//passar aluno para o controller
			    		
			    		controller.create(aluno);
			        	
			          break;
			          
			          
			        case "2":
			        	System.out.println("Excluindo aluno:");
			        	System.out.println("Entre com o cpf do aluno:");
			    		aluno.setCpf(in.next());
			    		//passar aluno para o controller
			    		
			    		controller.delete(aluno);
			        	
			          
			          break;
			          
			          
			        case "3":
			        	System.out.println("Alterando aluno:");
			        	System.out.println("Entre com o cpf do aluno:");
			    		aluno.setCpf(in.next());
			    		System.out.println("Entre com o nome do aluno:");
			    		aluno.setNome(in.next());
			    		System.out.println("Entre com o sexo do aluno:");
			    		aluno.setSexo(in.next());
			    		//passar aluno para o controller
			    		
			    		controller.update(aluno);
			          break;
			          
			        case "4":
			        	System.out.println("Alterando aluno:");
			        	System.out.println("Entre com o cpf do aluno:");
			    		aluno.setCpf(in.next());
			    		controller.read(aluno);
				          break;
			        //optional
			        default:
			          System.out.println("Opção invalida");
			    }
				
		
				
		
				
		}

	}

}
