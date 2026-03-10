package workout;

import java.util.Scanner;

public class PositiveOrNegativeOrZero {
    static String findNumber(int n) {
    	  if(n>0)return "positive number";
    	  else if(n<0)return "negative number";
    	  return "Zero";
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number :");
		int n=sc.nextInt();
		System.out.println(findNumber(n));

	}

}
