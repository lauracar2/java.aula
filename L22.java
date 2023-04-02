
public class L22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Escreva um programa que leia as quatro medidas hp, lp, ha e la, calcule e imprima quanto azulejos com as medidas dadas são necessários para cobrir a parede dada //
		
		double hp, ip, ha, la, qtd;
		
		hp = 2.6;
		ip = 1.6;
		ha = 0.35;
		la = 0.3;
		
		qtd = (hp * ip)/ (ha * la);
		
		System.out.println("A quantidade necessária para cubirir a parade de ajulejo é de: " + qtd);
		
	}
}
