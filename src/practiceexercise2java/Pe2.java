package practiceexercise2java;

import java.util.Arrays;
import java.util.Scanner;

public class Pe2 {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int p= sc.nextInt();
	switch(p){
	case 1:
		System.out.println("Enter to check Palindrom");
		String s=sc.next();
		System.out.println(Pe2.Problem1(s));
	
	case 2:
		System.out.println("Enter to check Power");
		int i=sc.nextInt();
		System.out.println(Pe2.Problem2(i));
		
	case 3:
//		As we are using the of the different class we have to use the instance variable.  
		Member  ec = new Member();
		System.out.println(ec.display());
		
	case 4:
	 int j=sc.nextInt();
	 EvenNumTest  ec1 = new EvenNumTest();
	 System.out.println(ec1.isEven(j));
	 
	case 5:
		ClassStudents ec2 = new ClassStudents();
		int[] f = ec2.Students();
		System.out.println("Average is"+f[0]);
		System.out.println("Minimum score is "+f[1]);
		System.out.println("Maximum score is "+f[2]);
		
	case 6:
		Factorial ec3 = new Factorial();
		System.out.println(ec3.shortfactorial());
		System.out.println(ec3.longfactorial());
		
	case 7:
		User ec4 = new User();
		ec4.Problem7();
		
	}	
}	
	




public  static String Problem1(String s){
	String S = "";
	String[] name =  s.split("");
	for(int i=name.length-1;i>=0;i--) {
		S+=name[i];
	}
	if(S.matches(s)) {
		return "yes";
	}
	else
		return "No";
}
public  static String Problem2(int x) {
	
	while(x>4){
		int temp = x/4;
		x=temp;
}	
	if(x%4==0) {
		return "Yes";
	}else
		return "No";
}

{
	
}



}

