package OOPS;
interface MyInterface{
	 void disp();
	 int add(int a,int b);
	
}
class DemoFace implements MyInterface{
	public void disp() {
		System.out.println("In display method");
	}
	public int add(int a,int b) {
		return a+b;
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface obj=new DemoFace();
		obj.disp();
		System.out.println(obj.add(2, 7));

	}

}
