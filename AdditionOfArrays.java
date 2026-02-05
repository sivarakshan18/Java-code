import java.util.*;
public class AdditionOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r1,c1,r2,c2;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a rows length of matrix 1:");
		r1=sc.nextInt();
		System.out.print("Enter a column length matrix 1:");
		c1=sc.nextInt();
		System.out.print("Enter a rows length of matrix 2:");
		r2=sc.nextInt();
		System.out.print("Enter a column length matrix 2:");
		c2=sc.nextInt();
		int a[][]=new int[r1][c1];
		int b[][]=new int[r2][c2];
		int c[][]=new int[r1][c1];
		
		if(r1==r2 & c1==c2) {
			System.out.println("Enter matrx 1 element:");
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter matrx 2 element:");
			for(int i=0;i<b.length;i++) {
				for(int j=0;j<b[i].length;j++) {
					b[i][j]=sc.nextInt();
				}
			}
			System.out.println("Display matrix 1");
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("Display matrix 2");
			for(int i=0;i<b.length;i++) {
				for(int j=0;j<b[i].length;j++) {
					System.out.print(b[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("Addition of two matrix");
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					c[i][j]=a[i][j]+b[i][j];
				}
					
			}
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
			

		}
		else {
			System.out.println("Somehting went wrong");
		}
	}

}
