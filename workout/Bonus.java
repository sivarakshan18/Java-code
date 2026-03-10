package workout;

import java.util.Scanner;

public class Bonus {
    static String bonusGive(int salary) {
      	int bonus=0;
    		if(salary>50000) {
    			bonus=salary*10/100;
    			return "Bonus="+(bonus);
    		}
    		else {
    			bonus=salary*5/100;
    			return "Bonus="+(bonus);
    		}
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a salary :");
		int s=sc.nextInt();
		System.out.println(bonusGive(s));
	}

}
