package workout;

import java.util.Scanner;

public class Voting {
	static String eligible(int n) {
		return (n>=18)?"eligible to vote":"Not eligible to vote";
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a age :");
		int n=sc.nextInt();
		System.out.println(eligible(n));

	}

}
