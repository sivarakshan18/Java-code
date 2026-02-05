package newVersion;

import java.util.Scanner;

public class Degits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		int r,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		num=sc.nextInt();
		while(num>0) {
			r=num%10;
			sum=sum+r;
			num/=10;
		}
		System.out.println("sum="+sum);

	}

}
