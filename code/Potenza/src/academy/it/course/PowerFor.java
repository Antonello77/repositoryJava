package academy.it.course;

public class PowerFor {

	public static void main(String[] args) {
		
		int numero = 2;
		int power= 16;
		
		for(int i=0; i<15; i++) {
			power = numero * power;
			System.out.println(power);
		}
}
}
