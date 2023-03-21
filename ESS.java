package jv;

import java.util.Scanner;

public class ESS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		
		System.out.println("Digite um segundo número: ");
		int num1 = sc.nextInt();
		
		if(num == num1) {
			
		System.out.println("São idénticos");
		}
		else if(num > num1) {
			System.out.println(num1 + " é maior que " + num);
		}
		else if(num > num1) {
			System.out.println(num + " é maior que "  + num1);
		}
		sc.close();
	}

}
