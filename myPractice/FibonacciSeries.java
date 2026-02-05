package myPractice;

public class FibonacciSeries {
	public void fibo() {
		int n=7;
		int a=0;
		int b=1;
		int c;
//		if(n<=1)return 1;
//		if(n<=2)return 2;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<=n;i++) {
			
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FibonacciSeries f=new FibonacciSeries();
		 f.fibo();

	}

}
