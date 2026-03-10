package workout;

import java.util.Scanner;

public class RangeFind {
    static String find(int n) {
    	   if(n>0 && n<=50)return "low";
    	   else if(n>=51 && n<=100)return "medium";
    	   return "high";
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number :");
		int n=sc.nextInt();
		System.out.println(find(n));

	}

}
