package q531;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double dou = 0.0;
		Scanner scan = new Scanner(System.in);
		dou = scan.nextDouble();
		scan.close();
		
		if(dou <= 50.80) {
			System.out.println("Flyweight");
		}else if(dou <= 61.23) {
			System.out.println("Lightweight");
		}else if(dou <= 72.57) {
			System.out.println("Middleweight");
		}else if(dou <= 88.45) {
			System.out.println("Cruiserweight");
		}else {
			System.out.println("Heavyweight");
		}
	}
}
