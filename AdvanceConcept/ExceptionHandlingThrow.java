package AdvanceConcept;

import java.util.Scanner;

public class ExceptionHandlingThrow {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		try {
			
			throw new Exception();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
