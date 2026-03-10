package workout;

import java.util.Scanner;

public class GradeSystem {
	static String grade(int mark) {
		if(mark>=90)return "Grade A";
		else if(mark>=75)return "Grade B";
		else if(mark>=50)return "Grade C";
		return "fail";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a mark :");
		int n=sc.nextInt();
		System.out.println(grade(n));

	}

}
