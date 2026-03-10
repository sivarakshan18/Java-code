package workout;

import java.util.Scanner;

public class LargestThree {
	static String largest(int a,int b,int c) {
		return (a>b)&&(a>c)?a+" is larger":(b>c)?b+" is larger":c+" is larger";
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number1 :");
		int n1=sc.nextInt();
		System.out.print("Enter a number2 :");
		int n2=sc.nextInt();
		System.out.print("Enter a number3 :");
		int n3=sc.nextInt();
		System.out.println(largest(n1, n2,n3));


	}

}
