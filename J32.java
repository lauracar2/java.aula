import java.util.Scanner;

public class J32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ent = new Scanner(System.in);
		
		System.out.println("Para ser clasificado para a luta precisamos de algumas informacões: ");
		
		System.out.println("Digie a sua altura: ");
		double num2 = ent.nextDouble();
		
		System.out.println("Digite o seu peso: ");
		double num = ent.nextDouble();
		
		if(num >= 60) {
			System.out.println("Parsbéns você foi clasificado");
			
		}
		else {
			System.out.println("não foi dessa vez");
		}
		ent.close();
	}

}
