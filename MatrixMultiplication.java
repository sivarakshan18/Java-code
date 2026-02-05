
public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2},{3,4}};
		int b[][]= {{2,1,3},{1,2,4}};
		
		int c[][]=new int[a.length][b[0].length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b[0].length;j++) { 
				for(int k=0;k<a[i].length;k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("Display matrix ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		
		}
	}

}
