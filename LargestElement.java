
public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{2,3,4},{6,7,8}};
		int max=a[0][0];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(max<a[i][j]) {
					max=a[i][j];
				}
				
			}
			
		}
		System.out.println(max);

	}

}
