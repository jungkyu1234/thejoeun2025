package q528;

import java.util.Scanner;

public class Main {

	//정수를 입력받아 첫 줄에 입력 받은 숫자를 출력하고 둘째 줄에 음수이면 “minus” 라고 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		System.out.println(num);
		
		if(num < 0) {
			System.out.println("minus");
		}
		
		
		
		
	}

}
