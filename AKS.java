import java.util.Random;

public class AKS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// gerador de números infinitos//
		Random generate = new Random();
		
		int num = 1;
		while(1 < 6) {
			int number = generate.nextInt(60);
			System.out.println(number);
			
		}
		
	}

}
