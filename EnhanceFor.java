
public class EnhanceFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{2,3,4},{6,7,8},{9,2,3}};
		for(int temp[]:a) {
			for(int val:temp) {
				System.out.print(val+" ");
			}
			System.out.println();
		}

	}

}
