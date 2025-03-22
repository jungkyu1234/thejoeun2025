package q530;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int age = 0;
		
		Scanner scan = new Scanner(System.in);
		age = scan.nextInt();
		scan.close();
		
		if(age >= 20) {
			System.out.println("adult");
		}else {
			System.out.println((20 - age) + " years later");
		}
	}

}
