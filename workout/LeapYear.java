package workout;

import java.util.Scanner;

public class LeapYear {
    static String leap(int year) {
    		if((year%4==0 && year%100!=0)||(year%400==0))return "leap year";
    		return "Not a leap year";
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a year :");
		int n=sc.nextInt();
		System.out.println(leap(n));

	}

}
