package q557;

import java.util.Scanner;

public class Main {

//10개의 문자를 입력받아서 첫 번째 네 번째 일곱 번째 입력받은 문자를 차례로 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char[] inp = new char[10];

		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.next().charAt(0);
		}

		sc.close();

		for (int i = 0; i < inp.length; i++) {
			System.out.print(inp[i] + " ");
		}
		System.out.println();
		
		// A B C D E F G H I J
		for (int i = 1; i < inp.length; i++) {
			if (i % 2 == 0) {
				System.out.print(inp[i] + " ");
			}

		}
	}

}
