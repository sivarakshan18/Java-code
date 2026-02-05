package OOPS;
class Grand{
	int age=56;
}
class Parent extends Grand{
	void disp() {
		System.out.println("In parent Method");
	}
	String name="Andrew";
}
class Child extends Parent{
	void disp() {
		System.out.println("In Child method");
	}
}
class Daughter extends Parent{
	String name="Sheeba";
}
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.disp();
		System.out.println(c.age);
		Daughter d=new Daughter();
		System.out.println(d.name);
		

	}

}
