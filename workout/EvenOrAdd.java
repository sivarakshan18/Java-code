package workout;

import java.util.Scanner;

public class EvenOrAdd {
	static String evenOrOdd(int n) {
		if(n%2==0)return "Even number";
		return "Odd number";
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number :");
		int n=sc.nextInt();
		System.out.println(evenOrOdd(n));

	}

}
