package Patterns;

import java.util.Scanner;

public class Inverted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int num;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter length of pattern:");
			num=sc.nextInt();
			for(int i=num;i>0;i--) {
				for (int j=0;j<i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
	}

}
