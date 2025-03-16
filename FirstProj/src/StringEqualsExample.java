
public class StringEqualsExample {

	public static void main(String[] args) {
		String strVal1 = "JBEdu";
		String strVal2 = "JBEdu";
	
	if(strVal1 == strVal2) {
		System.out.println("참조가 같음");
	}else {
		System.out.println("참조가 다름");
	}
	
	if(strVal1.equals(strVal2)) {
		System.out.println("두 문자열이 같음");
	}
	
	String strVar3 = new String("JBEdu");
	String strVar4 = new String("JBEdu");
	
	if(strVar3 == strVar4) {
		System.out.println("참조가 같음");
	}else {
		System.out.println("참조가 다름");
	}
	
	if(strVar3.equals(strVar4)) {
		System.out.println("두 문자열이 같음");
	}
	
	
	
	
	
	
	
	}

}
