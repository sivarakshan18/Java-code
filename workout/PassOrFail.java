package workout;

import java.util.Scanner;

public class PassOrFail {
    static boolean status(int marks) {
    	  	if(marks>=40) return true;
    	  	else return false;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a mark :");
		int n=sc.nextInt();
		System.out.println(status(n)?"pass":"fail");

	}

}
