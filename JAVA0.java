package java.test;

import java.util.Scanner;

public class JAVA0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			int codigo, senha;
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("insira o código de acesso: ");
			codigo = entrada.nextInt();
			
			  if (codigo == 658) {
		            System.out.print("Insira a senha de acesso: ");
		            senha = entrada.nextInt();
		            if(senha == 765609) {
		                System.out.println("Acesso permitido");
		            } else {
		                System.out.println("Senha incorreta");
		            }
		        } else {
		            System.out.println("Código incorreto");
		        }

		        entrada.close();
	}

}
