
public class Diagnol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{2,3,4},{6,7,8},{9,2,3}};
		int p=0,s=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==j) {
					p+=a[i][j];
				}
				if((i+j)==a.length-1) {
					s+=a[i][j];
				}
			}
		
		}
		System.out.println("Sum of principle dio="+p);
		System.out.println("Sum of Secondary dio="+s);

	}

}
