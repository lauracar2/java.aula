import java.util.Scanner;

public class Java3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
      Scanner ent = new Scanner(System.in);
		
      System.out.println("Gostaria de receber a sua média? digite o seu nome:  ");
            String nome = ent.nextLine();
		
      System.out.println("Informe a sua primeira nota? ");
            double n1 = ent.nextDouble();
		
      System.out.println("Informe a sua segunda nota bmestral: ");
             double n2 = ent.nextDouble();
		
      System.out.println("Informe a sua terceira nota: ");
             double n3 = ent.nextDouble();
		
      System.out.println("Informe a sua quarta nota: ");
             double n4 = ent.nextDouble();
		
             double resultado = (n1 + n2 + n3 + n4)/4;
		
               if(resultado >= 7) {
     System.out.println("Parabéns você foi aprovado " + nome );
		}
               if(resultado <= 5) {
			
     System.out.println( nome + "você está em recuperação ");
		}
              else{
     System.out.println( nome + "Você foi reprovado!!");
		}
		ent.close();
	}

}
