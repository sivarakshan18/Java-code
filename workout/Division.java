package workout;

import java.util.Scanner;

public class Division {
	static String divide(int n) {
		return (n%5==0 && n%11==0)?"Divisible by 5 and 11":"Not divisible by 5 and 11";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number :");
		int n=sc.nextInt();
		System.out.println(divide(n));

	}

}
