package OOPS;
 abstract class NewDemo{
	 int age=10;
	void demo() {
		System.out.println("Hello");
	}
	abstract void myMethod();
	abstract int show(int age);
}
 
 class MyClass extends NewDemo{
	 void myMethod() {
		 System.out.println("It is my method");
	 }
	 int show(int age) {
		 return age;
	 }
 }
public class AbstracttonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    MyClass c=new MyClass();
	    c.myMethod();
	    System.out.println(c.show(12));
	    c.demo();
		

	}

}
