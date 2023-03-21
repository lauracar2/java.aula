package jv;

import java.util.Scanner;

public class s4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um número: ");
		int n1 = entrada.nextInt();
		
		if (n1 % 3 == 0) {
			
			System.out.println("é multiplo ");
			
		}
		else {
			System.out.println("não é");
			entrada.close();
		}
			
		
	}

}
