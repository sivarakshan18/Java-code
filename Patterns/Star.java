package Patterns;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=3;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i;j++) {
				System.out.print(" ");
			} 
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			for(int j=1;j<=num-i;j++) {
				System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}
