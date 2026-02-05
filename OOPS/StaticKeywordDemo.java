package OOPS;
class Student{
	String name;
	int age;
	static String Teacher_name;
	 void disp() {
		System.out.println("In display method");
		System.out.println("name="+ name);
		System.out.println("age="+age);
		System.out.println("Teacher name="+Teacher_name);
	}
	 static {
		 Student.Teacher_name="Kaviya";
	 }

	
}
public class StaticKeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		Student s2=new Student();
		s1.name="siva";
		s1.age=23;
		
		s2.name="Arun";
		s2.age=27;
		s1.disp();
		s2.disp();
		
		

	}

}
