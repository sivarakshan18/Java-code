package OOPS;

class Encap{
	private int age=10;
	
	int getAge() {
		return age;
	}
	void setAge(int age) {
		System.out.println("Age modified ");
		this.age=age;	
	}
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encap obj=new Encap();
		obj.setAge(23);
		System.out.println(obj.getAge());

	}

}
