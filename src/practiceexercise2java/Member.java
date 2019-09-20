package practiceexercise2java;

public class Member {
	String display() {
		String s="";
		String[] Member = {"Member's name: Harry","Member's age: 30","Member's salary: 25000"};
		for (int i = 0;i<3;i++)
		{
			s+=Member[i]+",";
		}
		return(s);
		}
	}



