import java.util.*;
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a row length:");
		int r=sc.nextInt();
		System.out.print("Enter a column length:");
		int c=sc.nextInt();
		int arr1[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for (int j=0;j<c;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++) {
			for (int j=0;j<c;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}

	}

}
