package practiceexercise2java;

import java.util.Scanner;

public class Factorial {
	public static int shortfactorial() {
	  System.out.println("Enter the number");
	  
	  Scanner sc =  new Scanner (System.in);
	  int i  = sc.nextInt();
	  int N =1;
	  for(int n=i;n>=1;n--) {
		N=N*n;  
	  }		
	  return N;
	}
	
	public static long longfactorial () {
		  System.out.println("Enter the number greater than 16");
		  
		  Scanner sc =  new Scanner (System.in);
		  long i  = sc.nextLong();
		  long N =1;
		  for(long n=i;n>=1;n--) {
			N=N*n;  
		  }		
		  return N;

	
}
}
	

