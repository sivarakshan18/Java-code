package OOPS;
class Demo{
	int num1;
	int num2;
	int result;
	void disp() {
		
	}
	void add(int a,int b) {
		num1=a;
		num2=b;
		result=num1+num2;
		System.out.println(result);
		
	}
	void add(int a,double b) {
		num1=a;
		num2=(int)b;
		result=num1+num2;
		System.out.println(result);
	}
	
}
public class PolymorphismOverloading {

	public static void main(String... args) {
		// TODO Auto-generated method stub
		Demo obj=new Demo();
		obj.add(2,3);
		obj.add(2, 4.8);
		

	}

}
