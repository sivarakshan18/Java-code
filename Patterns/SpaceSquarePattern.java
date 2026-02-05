package Patterns;

public class SpaceSquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=4,c=4;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(i==0 || i==r-1 ||j==0 || j==c-1) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
