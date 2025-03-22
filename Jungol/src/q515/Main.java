package q515;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 개의 정수를 입력 받아 곱과 몫을 출력하시오.");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		if(a < 0 || a > 500) {
			System.out.println("안돼요");
		}else {
			System.out.println(a + "*" + b + "=" +  (a * b));
			System.out.printf("%d  /  %d + , %d\n" , a, b,  a / b);
		// int : %d
		// char : %c
		// String : %s
	    // double : %f
		}
	}

}
