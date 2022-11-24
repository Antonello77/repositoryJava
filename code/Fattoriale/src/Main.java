import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1;
		int numero2;
 Scanner input1 = new Scanner(System.in);
 
 
 
 
 System.out.println("inserisci numero = ");
 numero1 =input1.nextInt();
 System.out.println("inserisci potenza = ");
  numero2 = input1.nextInt();
  System.out.println(CalcolaPotenza(numero1,numero2));
	}
	
	static public int CalcolaPotenza(int numero1, int numero2) {
		int pow = numero1;
		for(int i=1; i<numero2; i++) {
			pow +=numero1;
	
		}
 return pow;
	}
}
	

