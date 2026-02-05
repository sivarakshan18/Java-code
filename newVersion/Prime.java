package newVersion;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		boolean isPrime=true;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		num=sc.nextInt();
		if(num>1) {
			for(int i=2;i<=num;i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
		}
		if(isPrime) {
			System.out.println("prime");
		}
		else {
			System.out.println("Not prime");
		}

	}

}
