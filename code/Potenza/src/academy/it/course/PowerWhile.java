package academy.it.course;

public class PowerWhile {

	 public static void main(String[] args) {
		 int numero = 2;
			int power= 16;
			int i=0;
			
			while(i<15) {
				power= numero * power;
				System.out.println( power);
			   i++;
				
			}
	}
}