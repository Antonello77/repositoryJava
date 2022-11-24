package academy.it.course;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num;
		String giorno;
		System.out.println("inserire  numero da 1 a 7");
		num = input.nextInt();
		switch (num) {
		case 1:
			giorno = "Lunedì";
			break;
		case 2:
			giorno = "Martedì";
			break;
		case 3:
			giorno = "Mercoledì";
			break;
		case 4:
			giorno = "Giovedì";
			break;
		case 5:
			giorno = "Venerdì";
			break;
		case 6:
			giorno = "Sabato";
			break;
		case 7:
			giorno = "Domenica";
			break;
		default:
			giorno = "inserire  numero da 1 a 7";
		}
		
		
		 
		
		if (giorno == "inserire  numero da 1 a 7") {
			System.out.println(giorno);
		} else {
			System.out.println(num + "=" + giorno);
		}
		
	}


   
		
		
	}
	
	



