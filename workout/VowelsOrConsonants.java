package workout;

import java.util.Scanner;

public class VowelsOrConsonants {
    static String vowelsOrCon(char ch) {
    	 if(ch=='a' || ch=='e' ||ch=='i'||ch=='o'||ch=='u')
    		 return "Vowles";
    	 return "Consonants";
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Character :");
		char c=sc.next().charAt(0);
		System.out.println(vowelsOrCon(c));

	}

}
