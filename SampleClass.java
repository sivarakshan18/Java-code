class Index{
	int mul(int a,int b) {
		return a*b;
	}
}
public class SampleClass {
	public static void main(String args[]) {
		Index obj=new Index();
		System.out.println("multiply:"+obj.mul(2,4));
	}
}
