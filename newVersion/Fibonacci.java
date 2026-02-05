package newVersion;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		int r,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		num=sc.nextInt();
		int a=0,b=1,c;
		if(num>=1) {
			System.out.print(a+" ");
		}
		if(num>=2) {
			System.out.print(b+" ");
		}
		for(int i=3;i<=num;i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

	}

}
