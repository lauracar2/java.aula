import java.util.Scanner;

public class ACESS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int codigo, senha;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o código de entraada: ");
	    codigo = entrada.nextInt();
	    
	    if(codigo == 123) {
	    	System.out.println("Insira a senha de acesso: ");
	    	senha = entrada.nextInt();
	    	
	    	if(senha == 999) {
	    		System.out.println("Acesso permitido!! ");
	    	}	
	    	else {
                System.out.println("Senha incorreta");
            }
        } else {
            System.out.println("Código incorreto");
        }

        entrada.close();
	   	}
	    
	    
	    }	

	

