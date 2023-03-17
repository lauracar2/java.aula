import java.util.Scanner;

public class Z3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner on = new Scanner(System.in);
		
		System.out.println(" Para ser liberado o seu empréstido irá ser necessário recolher algumas imformações suas: ");
		String nome = on.next();
		//
		System.out.println("informe seu nome completo:");
		String nomee = on.nextLine();
		//
		System.out.println("informe a sua renda bruta: ");
		int salario = on.nextInt();
		//
		double salarioDesconto = (salario * 30) / 100;		
		System.out.println("informe o valor da prestação: ");
		//
		int prestacao = on.nextInt();
		if(salarioDesconto > prestacao) {
			System.out.println(nomee + " Empréstimo liberado com sucesso!!!!");
		}
		else if(salarioDesconto < prestacao) {
			
			System.out.println(nomee + "Empréstimo recusado!!");
			
		}
		}
	}


