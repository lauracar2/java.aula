package jv;

import java.util.Scanner;

public class ZX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		
		if(100 > num) {
			
	    System.out.println(" está dentro do valor");
		}
		 if(num <= 200) {
			 System.out.println(" esta dentro!!!");
		 }
		
		else {
			System.out.println("este valor está fora!!!!");
			
		}
		sc.close();
	}

}
