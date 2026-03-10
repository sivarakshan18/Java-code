package workout;

import java.util.Scanner;

public class TemperatureCheck {
	static String tempCheck(double temp) {
		if(temp<15)
			return "cold";
		else if(temp>=15 && temp<30)
			return "normal";
		return "Hot";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Temperature :");
		double n1=sc.nextDouble();
		System.out.println(tempCheck(n1));

	}

}
