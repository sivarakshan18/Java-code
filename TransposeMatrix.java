
public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{2,3,4},{6,7,8}};
		int b[][]=new int[a[0].length][a.length];
		for(int i=0;i<a[0].length;i++) {
			for(int j=0;j<a.length;j++) {
				b[i][j]=a[j][i];
			}
		}
		for(int i=0;i<a[0].length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
				
		}
		

	}

}
