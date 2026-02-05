package Patterns;

import java.util.Scanner;

public class SimplePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of pattern:");
		num=sc.nextInt();
        for(int i=1;i<=num;i++) {
        	for (int j=1;j<=i;j++) {
        		System.out.print(j);
        	}
        	System.out.println();
        	
        }

	}

}
