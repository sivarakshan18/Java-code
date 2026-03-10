package workout;

import java.util.Scanner;

public class Smallest {
	static String smallest(int a,int b) {
		if(a>b)return b+" is smallest";
		return a+" is smallest";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number1 :");
		int n1=sc.nextInt();
		System.out.print("Enter a number1 :");
		int n2=sc.nextInt();
		System.out.println(smallest(n1, n2));

	}

}
