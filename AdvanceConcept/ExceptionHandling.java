package AdvanceConcept;
import java.util.Scanner;
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		try {
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("C is important");
		}

	}

}
