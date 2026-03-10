package workout;

import java.util.Scanner;

public class DivideThreeOrSeven {
	static String divide(int n) {
		return (n%3==0 || n%7==0)?"Divisible by 3 or 7":"Not divisible by 3 or 7";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number :");
		int n=sc.nextInt();
		System.out.println(divide(n));

	}

}
