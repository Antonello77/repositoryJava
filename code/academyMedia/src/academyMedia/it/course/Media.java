package academyMedia.it.course;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner input = new Scanner(System.in);
 System.out.println("inserisci due numeri interi : ");
 int n1;
 int n2;
 
 n1 = input.nextInt();
 n2 = input.nextInt();
 
 System.out.println("somma= " +(n1+n2));
 int sum=n1+n2;
 
 int m;
 
 m=(sum)/2;
 System.out.println("Media= "+m);
 
	}

}
