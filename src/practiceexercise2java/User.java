package practiceexercise2java;

import java.util.Scanner;

public class User {
	public void Problem7() {
		System.out.println("Enter the first name");
		Scanner sc =  new Scanner(System.in);
		String F1 = sc.next();
		System.out.println("Enter the last name");
		String F2 = sc.next();
		System.out.println("Enter the age");
		int F3 = sc.nextInt();
		System.out.println("Enter the salary");
		int F4 = sc.nextInt();
		String F5= F1 +" " +F2;
		System.out.println("Full name: "+F5);
		if(F3>18 && F3<60) {
			System.out.println("Age: "+F3);
		}else System.out.println("Please provide a valid age number");
		System.out.println("Salary: " +F4);
	}
}
