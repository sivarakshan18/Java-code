package test;

import java.util.Scanner;

public class Status {
	
	
public static boolean showstatus(boolean status) {
		
		
		return status;
		
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the status value");
		boolean sus=sc.nextBoolean();
		System.out.println("Status verified......");
		System.out.println(showstatus(sus));
		//System.out.println(showstatus(true));
		
	}

}
