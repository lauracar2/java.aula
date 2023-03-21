package jv;

import java.util.Scanner;

public class AA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double alcool = 2.90;
		double gasolina = 3.79;

		System.out.println("A - gaslina");
		System.out.println("B - alcool");
		System.out.println("Qual o tipo de combustivel? ");
		String tipo = sc.nextLine();
		System.out.println("Informe a capacidade do tanque: ");
		double capacidade = sc.nextDouble();

		if (tipo.equals("a") || tipo.equals("A")) {

			double tanque = gasolina * capacidade;
			System.out.println("O valor total para encher o tanque é de " + tanque);

		}

		if (tipo.equals("b") || tipo.equals("B")) {

			double tanque = alcool * capacidade;
			System.out.println("O valor total para encher o tanque é de " + tanque);

		} 
		
		else {
			System.out.println(" opção inválida!!");

		}
		
		sc.close();
	}

}
