package q536;

public class Main {

	// 1부터 15까지 차례로 출력하는 프로그램을 작성하시오. while문을 이용하세요.
	public static void main(String[] args) {

		for(int i=1; i <=15; i++) {
			System.out.println(i);
		}
		
		System.out.println("==========위에는 for 문============");
		
		int i = 1;
		while(i <= 15) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("==========위에는 while 문============");

		int y = 1;
		do {
			System.out.println(y++);
		} while (y <= 15);
		
		System.out.println("==========위에는 do while 문============");
	}
}
