package q538;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.print("number? ");
			int num = scan.nextInt();
			if (num > 0) {
				System.out.println("positive integer");
			} else if (num < 0) {
				System.out.println("negative number");
			}else {
				System.out.println(num);
			}
			
			
			
				
		}
		
	}

}
