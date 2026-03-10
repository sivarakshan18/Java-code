package workout;

import java.util.Scanner;

public class LargestNumber {
	static String largest(int a,int b) {
    	   if(a>b)return a+" is larger";
    	  // else
    	   return b+" is larger";
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number1 :");
		int n1=sc.nextInt();
		System.out.print("Enter a number2 :");
		int n2=sc.nextInt();
		System.out.println(largest(n1, n2));

	}

}
