
public class Test {

	public static void main(String[] args) {
		int x = 5;
		int y = 8;
		int result1 = ++x + 10; // 16
		int result2 = y++ + 10; // 18

		System.out.println("x 다음: " + x); //6
		System.out.println("y 다음: " + y); // 9
		
		int z = ++x + y++; // 7 + 9 = 16
		
		System.out.println("x : " + x); // 7
		System.out.println("y : " + y); // 10
		System.out.println("z : " + z); // 16
		System.out.println("result1 : " + result1); // 16
		System.out.println("result2 : " + result2); // 18
		
		
	}

}
