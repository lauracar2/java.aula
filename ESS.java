package jv;

import java.util.Scanner;

public class ESS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int num = sc.nextInt();
		
		System.out.println("Digite um segundo n�mero: ");
		int num1 = sc.nextInt();
		
		if(num == num1) {
			
		System.out.println("S�o id�nticos");
		}
		else if(num > num1) {
			System.out.println(num1 + " � maior que " + num);
		}
		else if(num > num1) {
			System.out.println(num + " � maior que "  + num1);
		}
		sc.close();
	}

}
