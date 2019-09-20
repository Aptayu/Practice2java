package practiceexercise2java;

import java.util.Arrays;
import java.util.Scanner;

public class ClassStudents {
	public static int[] Students() {
		
		Scanner sc = new Scanner(System.in) ;
		int average = 0;
		
		System.out.println("Enter the number of students");
		int i = sc.nextInt();
		int[] Marks = new int[i]; 
		System.out.println("Enter the marks of stdents");
		for(int j = 0;j<i;j++) {
			System.out.println("Marks of"+j+"student");
			Marks[j]  = sc.nextInt();
			if(Marks[j]>0 && Marks[j]<100) {
				average =average+Marks[j];
			}else
				System.out.println("Error");
		} 
		average = average/i;
		
		Arrays.sort(Marks);
				int[] Answer= {average ,  Marks[0], Marks[Marks.length-1]};
				return Answer;
	}

}
