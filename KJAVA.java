
import java.text.DecimalFormat;
import java.util.Scanner;

public class KJAVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.00");
		
		
		System.out.println("Digite o peso da carne: ");
		double pesocarne = entrada.nextDouble();
		
		if (pesocarne > 50) {
			double passoupeso = pesocarne - 50;
			double pesopermitido = passoupeso * 4;
			System.out.println("A carne passou" + passoupeso + "kg. O total da multa será: R$ " + df.format(pesopermitido));
			
		}
		else {
			System.out.println("A carne está no peso permitido, não houve ecesso!");
			entrada.close();
		}
	}

}
