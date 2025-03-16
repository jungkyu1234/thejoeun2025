package q613;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
	        String name;
	        String school;
	        int grade;
	        
	        name = sc.next();
	        school = sc.next();
	        grade = sc.nextInt();

		School schoo = new School(name, school, grade);
		
		System.out.println(schoo.getName());
		System.out.println(schoo.getSchool());
		System.out.println(schoo.getGrade());
	}

}
