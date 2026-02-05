package InterFaceConcept;
interface MyNewInterface{
	static void show() {
		System.out.println("In show method....");
	}
	default void disp() {
		System.out.println("In display method");
		
	}
	
}

public class ExcerciseInterface {
	public static void main(String args[]) {
		MyNewInterface obj =new MyNewInterface() {
			 void show() {
				System.out.println("Hello");
			}
		};
		obj.disp();
		MyNewInterface.show();
	}

}
